package main;

import java.sql.SQLException;

public class Dispecher extends Thread {

    public static Service service;

    @Override
    public void run() {
        while (true) {
            Order order = null;
            try {
                order = service.takeCarReady3();
                if(order!=null) {
                    Thread.sleep(1000);
                    service.addAllOrdersCompleated(order);
                    System.out.println("car finished  number " + service.getAllOrderCompleated().size());
                    DBManager.getInstance().getOrderFinished(order);
                    DBManager.getInstance().makeRecord(order);
                }

            } catch (InterruptedException |RuntimeException e) {
                System.out.println("run method Dispatcher");
                 return;
            }catch (SQLException e){
                System.out.println("lalal getOrderFinished" + e.getMessage());

            }
        }
    }
}

