package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.sql.*;
import java.time.LocalDate;


public class DBManager {
    private static DBManager instance=new DBManager();

    public static DBManager getInstance() {
        return instance;
    }

    private static final String IP = "localhost";
    private static final String PORT = "3306";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String DB_NAME = "s15_test3_carshop";
    private Connection connection;

    private DBManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://" + IP + ":" + PORT + "/" + DB_NAME,
                    USER,
                    PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no installed" + e.getMessage());
        } catch (SQLException sq) {
            System.out.println("Problem creating connection " + sq.getMessage());
        }
    }

    public static void addDiagnostic(Diagnostic diagnostic) {
        try {
            PreparedStatement ps = getInstance().connection.prepareStatement(
                    "INSERT INTO diagnosticians (name,age)VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, diagnostic.getName());
            ps.setInt(2, diagnostic.getAge());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            diagnostic.setId(id);
            System.out.println(diagnostic.getId()+ " diagnostic added");
        } catch (SQLException e) {
            System.out.println("Add Diagnostic exception");
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException sq) {
            System.out.println("Connection not closed");
        }
    }
    public void getOrderFinished(Order order) throws SQLException {
        PreparedStatement ps =getInstance().connection.prepareStatement(
                "UPDATE orders SET closed_At=?");
        ps.setDate(1, Date.valueOf(LocalDate.now()));
        ps.executeUpdate();
    }

    public boolean checkCarExist(Car car) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement(
                "SELECT *  FROM cars WHERE licence_plate =?");
        ps.setString(1, car.getLicence_plate());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public int checkCarID(Car car) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement(
                "SELECT *  FROM cars WHERE licence_plate =?");
        ps.setString(1, car.getLicence_plate());
        ResultSet rs = ps.executeQuery();
        rs.next();
        int id=rs.getInt(1);
        return id;


    }

    public void makeRecord(Order order) {
        try {
            File f = new File(order.getCar().getLicence_plate() + Date.valueOf(LocalDate.now()).toString() + ".txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            String record = order.getDiagnosed_At() + "," + order.getDiagnosed_by() + "," + order.getRepaired_at() + "," + order.getRepaired_by() + "," + order.getRepaired_at() + "," + order.getTimeFinish();
            Files.writeString(f.toPath(), record, StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(" make a record " + e.getMessage());
        }
    }

    public void registerCar(Car car) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                " INSERT INTO cars (licence_plate,model,owner_name,year_of_production, phone_number,warranty)    VALUES ( ?,?,?,?,?,? )",
                Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, car.getLicence_plate());
        ps.setString(2, car.getModel());
        ps.setString(3, car.getOwner());
        ps.setInt(4, car.getYear_of_production());
        ps.setString(5, car.getPhoneOwner());
        ps.setInt(6, car.getWarranty());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        int id = rs.getInt(1);
        car.setId(id);
        System.out.println(car.getId()+" registered car");

    }

    public void upDateCar(Car car) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                " UPDATE  cars SET phone_number =? WHERE id =?");
                ps.setString(1, car.getPhoneOwner());
                ps.setInt(2, car.getId());
                ps.executeUpdate();
    }

    public boolean checkPhoneNumber(Car car) {
        boolean exist=false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT phone_number FROM cars WHERE licence_plate=?");
        preparedStatement.setString(1, car.getLicence_plate());
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        String number = rs.getString("phone_number");
        exist=number.equals(car.getPhoneOwner()) ;

        }catch (SQLException e){
            System.out.println("Check the phone number"+e.getMessage());
        }
        return exist;
    }
    public void getOrderrToDB(Order order) {
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO  orders (car_id,registered_at)VALUES (?,?) ",Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,order.getCar().getId());
            ps.setDate(2,Date.valueOf((LocalDate.now())));
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
             rs.next();
            int id=rs.getInt( 1);
            order.setId(id);

        } catch (SQLException e) {
            System.out.println("lala OrderToDB " + e.getMessage() +" carId: "+order.getCar().getId());

        }
    }

    public void upDateDiagnosticTimeType (Order order){
        try {
            PreparedStatement ps = connection.prepareStatement(
                    " UPDATE  orders SET diagnosed_At=?, diagnosed_By=? WHERE id=?");

            ps.setDate(1,Date.valueOf(LocalDate.now()));
            ps.setInt(2, order.getDiagnosed_by());
            ps.setInt(3,order.getId());
            ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Update  diagnostic time"+ e.getMessage());
            }
    }

    public void regisrterWorker(Worker worker) {
        try{
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO workers (name,age) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,worker.getName());
        ps.setInt(2, worker.getAge());
        ps.executeUpdate();
        ResultSet rs=ps.getGeneratedKeys();
        rs.next();
        int id=rs.getInt(1);
        worker.setId(id);

        }catch (SQLException e){
            System.out.println("registerWorker exception "+e.getMessage());
        }
    }


    public void setRepaired(Order order) {
        try{
        PreparedStatement ps = connection.prepareStatement(
                "UPDATE orders SET repaired_at=? ,repaired_by=?,service_id=? WHERE  id=?");
        ps.setDate(1, Date.valueOf(LocalDate.now()));
        ps.setInt(2, order.getRepaired_by());
        ps.setInt(3, order.getService_id());
        ps.setInt(4,order.getId());
        ps.executeUpdate();

        }catch (SQLException e){
        System.out.println("set Repaired exception "+e.getMessage());
        }
    }
}
