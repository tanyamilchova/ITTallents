package main;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class Priemchik extends Thread{
    public static Service service;

    @Override
    public void run() {
        while (true){
            try{
                Car car = service.takeCar0();
                Thread.sleep(50);
                if(car!=null) {
                    boolean carExist = DBManager.getInstance().checkCarExist(car);
                        System.out.println(carExist);
                        System.out.println(car.getLicence_plate());


                        if (!carExist) {
                            DBManager.getInstance().registerCar(car);
                        } else {
                            if (!DBManager.getInstance().checkPhoneNumber(car)) {
                                System.out.println("Phone number will be changed");
                                DBManager.getInstance().upDateCar(car);
                            }
                            int id=DBManager.getInstance().checkCarID(car);
                            car.setId(id);
                        }
                        Order order = new Order(car, LocalDateTime.now());

                        System.out.println("order with car id "+car.getId()+ " registered to DB");
                        DBManager.getInstance().getOrderrToDB(order);
                        service.insertOrderDiagnostic1(order);
                    }
            }
            catch (InterruptedException | RuntimeException e){
                System.out.println("run method Priemchik");
                    return;

            }
            catch (SQLException s){
                s.printStackTrace();
                System.out.println("lala sql run method Priemchik "+s.getMessage());
            }
        }
    }
}


