package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Reporter extends Thread{
    private Service service;

    public Reporter(Service service){
        this.service=service;
    }
    @Override
    public void run() {
        while (true){
            try{

                Thread.sleep(2000);
                stat1();
                stat2();
                stat3();
                stat4();
                stat5();
                stat6();

            }catch (InterruptedException e){
                System.out.println("lala run method reporter- job finished   "+e.getMessage());
                return;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void stat1() throws SQLException {
        //-- брой поръчки, които са заявени (регистрирани) за последните 30 дни
        Connection connection = DBManager.getInstance().getConnection();
        PreparedStatement ps =DBManager.getInstance().getConnection().prepareStatement(
                "SELECT COUNT(*)FROM orders WHERE registered_at>curdate()-30");
        ResultSet rs= ps.executeQuery();
        rs.next();
        int counted=rs.getInt(1);
        System.out.println(counted+" брой поръчки, които са заявени (регистрирани) за последните 30 дни");


    }
    public void stat2() throws SQLException {
        //-- брой поръчки, които са за услуги тип РЕМОНТ и брой поръчки, които са за услуги тип
        //-- ПОДДРЪЖКА;
        Connection connection = DBManager.getInstance().getConnection();
        PreparedStatement ps = DBManager.getInstance().getConnection().prepareStatement(
                " SELECT type, COUNT(id) as total FROM services\n" +
                        "GROUP BY type;   ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("брой поръчки, които са за услуги тип РЕМОНТ и брой поръчки, които са за услуги тип ПОДРЪЖКА " + rs.getString("type") + ":" + rs.getInt("total"));

        }
    }

    public void stat3() throws SQLException {
        //-- името на диагностика, извършил най-много диагностики на автомобили"
        Connection connection = DBManager.getInstance().getConnection();
        PreparedStatement ps =DBManager.getInstance().getConnection().prepareStatement(
                "SELECT d.name ,COUNT(*) AS total FROM orders AS o \n" +
                "JOIN diagnosticians AS d ON( o.diagnosed_by =d.id)\n" +
                "GROUP BY diagnosed_by\n" +
                "ORDER BY total DESC LIMIT 1;");
        ResultSet rs= ps.executeQuery();
        while (rs.next()){
            System.out.println("името на диагностика, извършил най-много диагностики на автомобили "+rs.getString("name")+" : "+rs.getInt("total"));
        }
    }

    public void stat4() throws SQLException {
        //-- регистрационният номер на всички автомобили с поне 3 извършени услуги
        Connection connection = DBManager.getInstance().getConnection();
        PreparedStatement ps =DBManager.getInstance().getConnection().prepareStatement(
                " SELECT licence_plate, COUNT(*) AS total\n" +
                        "        FROM cars AS c\n" +
                        "        JOIN orders AS o\n" +
                        "        ON (c.id=o.car_id)\n" +
                        "        GROUP BY (car_id)\n" +
                        "                HAVING total>=3; ");
        ResultSet rs= ps.executeQuery();
        while (rs.next()) {
            System.out.println("регистрационният номер на всички автомобили с поне 3 извършени услуги "+rs.getString("licence_plate") + rs.getInt("total"));
        }

    }
    public void stat5() throws SQLException {
        //-- брой поръчки за автомобили в гаранция
        Connection connection = DBManager.getInstance().getConnection();
        PreparedStatement ps =DBManager.getInstance().getConnection().prepareStatement(
               "  SELECT COUNT(*) AS total \n" +
                        "FROM orders AS o\n" +
                        "JOIN cars AS c\n" +
                        "ON (o.car_id=c.id)\n" +
                       " WHERE c.warranty =1");
        ResultSet rs= ps.executeQuery();
        rs.next();
            System.out.println("брой поръчки за автомобили в гаранция"+rs.getInt("total"));


    }
    public void stat6() throws SQLException {
        //-- обща сума на извършените услуги (ако услугата е извършена върху автомобил в
        //-- гаранция, сумата за услугата е 0)
        Connection connection = DBManager.getInstance().getConnection();
        PreparedStatement ps =DBManager.getInstance().getConnection().prepareStatement(
               " SELECT SUM(price)" +
                        "FROM services AS s \n" +
                        "JOIN orders AS o\n" +
                        "ON (s.id= o.service_id)\n" +
                        "JOIN cars AS c\n" +
                        "ON(o.car_id=c.id)\n" +
                        "WHERE  year_of_production > 2000");
        ResultSet rs= ps.executeQuery();
        rs.next();
        System.out.println("обща сума на извършените услуги"+rs.getInt("SUM(price)"));


    }
}
