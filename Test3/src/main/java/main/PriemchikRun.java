//package main;
//
//import java.sql.*;
//import java.time.LocalDate;
//
//public class PriemchikRun {
//    @Override
//    public void run() {
//        while (true){
//            try{
//
////                for (int i = 0; i < 5; i++) {
//                Car car = service.takeCar0();
////                    Car  carExist = DBManager.getInstance().checkCarExist(car);
//
//                if (carExist==null) {
////                        DBManager.getInstance().registerCar(car);
//                }
//                else {
////                        DBManager.getInstance().upDateCar(car);
//                }
//                Order order = new Order(car, Date.valueOf(LocalDate.now()));
//
//                DBManager.getInstance().getOrderrToDB(order);
//                service.insertOrderDiagnostic1(order);
////                }
//            }
//            catch (SQLException s){
//                System.out.println("lala 0 "+s.getMessage());
//            }
//        }
//    }
//    public int checkCarExist(Car car) throws SQLException {
////     public Car checkCarExist(Car car) throws SQLException {
//        PreparedStatement ps = this.connection.prepareStatement(
//                "SELECT COUNT(*) AS total FROM cars WHERE licence_plate =?", Statement.RETURN_GENERATED_KEYS);
//        ps.setString(1, car.getLicence_plate());
//        ResultSet rs = ps.executeQuery();
//        if( rs.next() ){
//            return car;
//        }else {
//            return null;
//        }// проверка и актуализация на телефона
//    }
//    public void getOrderrToDB(Order order) {
//        try {
//            PreparedStatement ps = connection.prepareStatement(
//                    "INSERT INTO  orders (car_id,registered_At)VALUES (?,?) ",Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, order.getCar().getId());
//            ps.setDate(2, Date.valueOf(LocalDate.now()));
//            ps.executeUpdate();
//            ResultSet rs=ps.getGeneratedKeys();
//            rs.next();
//            int id=rs.getInt( "id");
//            order.setId(id);
//
//        } catch (SQLException e) {
//            System.out.println("lalaOrderToDB " + e.getMessage());
//        }
//    }
//}
