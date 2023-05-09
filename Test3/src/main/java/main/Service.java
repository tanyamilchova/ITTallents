package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Service {

    public static final Object lockEntry=new Object();
    public static final Object lock=new Object();
    public static final Object lockReady=new Object();

    public void takeReady() {
    }



    public enum Type {}
    private int id;
    private Type type;
    private String name;
    private double price;
    private LocalDateTime date;
    private int initialCars=10;


    private Queue<Car> carsQueue0 = new LinkedList<>();
    private ArrayList<Order> orderDiagnostic1 = new ArrayList<>();
    private ArrayList<Order> remontOrders = new ArrayList<>();
    private ArrayList<Order> podrujkaOrders = new ArrayList<>();
    private ArrayList<Order>ready=new ArrayList<>();
    private ArrayList<Order>allOrderCompleated=new ArrayList<>();

    public  void putCar0(Car car) {
        synchronized (lockEntry) {
            carsQueue0.offer(car);
            System.out.println("Car added to Queue");
            lockEntry.notifyAll();
        }
    }
    public  Car takeCar0() {
        Car car = null;
        synchronized (lockEntry) {
            try {
                while (carsQueue0.size() == 0) {
                    lockEntry.wait();
                }
                car = carsQueue0.poll();
                System.out.println("Car taken from Queue");
        lockEntry.notifyAll();
            } catch (InterruptedException e) {
                System.out.println("lala takeCar0 " + e.getMessage());
                throw new RuntimeException(e.getMessage());
            }
            return car;
        }
    }

    public synchronized void insertOrderDiagnostic1(Order order) {
        orderDiagnostic1.add(order);
        notifyAll();
        System.out.println("Order inserted to Diagnostic");
    }


    public synchronized Order takeOrderFromDiagnostik1() {
        Order order=null;
        try {
            while (orderDiagnostic1.size()==0){
                this.wait();
            }
            order = orderDiagnostic1.remove(orderDiagnostic1.size() - 1);
            this.notifyAll();
            System.out.println("Order taken from Diagnostik");

        } catch (InterruptedException e) {
            System.out.println("lala take order from diagnostik" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return order;
    }

    public void putForRemont2(Order order) {
        synchronized (lock){
            remontOrders.add(order);
            lock.notifyAll();
        }
        System.out.println("Order added in Remont");
    }
    public void putForPodrujka2(Order order){
        synchronized (lock){
            podrujkaOrders.add(order);
            System.out.println("Order added in Podrujka");
            lock.notifyAll();
        }
    }
    public Order takeFromRemont2( ){
        Order order=null;
        try {
            synchronized (lock) {
                while (remontOrders.size()==0){
                    lock.wait();
                }
                order = remontOrders.remove(remontOrders.size() - 1);
                System.out.println("Order taken from Remont");
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("lala take from remont " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return order;
}
    public Order takeFromPodrujka2( ){
        Order order=null;
        try {
            synchronized (lock) {
                while (podrujkaOrders.size()==0){
                    lock.wait();
                }
                order = podrujkaOrders.remove(podrujkaOrders.size() - 1);
                System.out.println("Order taken from Podrujka");
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("lala taken from Podrujka " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return order;
    }
    public Order addCarReady3(Order order){
        synchronized (lockReady) {
            ready.add(order);
            System.out.println("Order add to Ready");
            lockReady.notifyAll();
        }
        return order;
    }

    public Order takeCarReady3(){
        Order order=null;
        try {
            synchronized (lockReady) {
                while (ready.size()==0){
                    lockReady.wait();
                }
                order = ready.remove(ready.size() - 1);
                System.out.println("Order taken from Ready with car "+order.getCar().getId());
                lockReady.notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("lala take car ready " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return order;
    }

    public void addAllOrdersCompleated(Order order){
        allOrderCompleated.add(order);
    }

    public ArrayList<Order> getAllOrderCompleated() {
        return allOrderCompleated;
    }
}
