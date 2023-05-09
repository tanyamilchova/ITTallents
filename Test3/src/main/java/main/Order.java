package main;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Order {
    private static Service service;
    public enum TYPE_SERVICE{REMONT,PODRUJKA}
    private TYPE_SERVICE type;
    private int  service_id;
    private int id;
    private Car car;
    private int car_id;
    private LocalDateTime registered_at;
    private int diagnosed_by;
    private LocalDateTime diagnosed_At;


    private int repaired_by;
    private LocalDateTime repaired_at;
    private LocalDateTime timeFinish;
    private int workingTime;




    public Order(Car car, LocalDateTime timeRegister) {
        this.car = car;
        this.registered_at = timeRegister;
        this.workingTime=getRandomWorkingTime(this.type);
    }

    public int  getRandomWorkingTime(TYPE_SERVICE typeService){
        if(this.type==TYPE_SERVICE.PODRUJKA){
            return 1000;
        }
        return 3000;
    }
    public int getRandomServiceId(TYPE_SERVICE service){
        if(this.type==TYPE_SERVICE.PODRUJKA){
            return new Random().nextInt(1,5);
        }
        return new Random().nextInt(5,9);
    }

    public int getService_id() {
        return service_id;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public static void setService(Service service) {
        Order.service = service;
    }

    public void setType(TYPE_SERVICE type) {
        this.type = type;
    }

    public Car getCar() {
        return car;
    }

    public LocalDateTime getTimeFinish() {
        return timeFinish;
    }

    public static Service getService() {
        return service;
    }

    public int getDiagnosed_by() {
        return diagnosed_by;
    }

    public LocalDateTime getDiagnosed_At() {
        return diagnosed_At;
    }

    public TYPE_SERVICE getType() {
        return type;
    }

    public void setRepaired_by(int repaired_by) {
        this.repaired_by = repaired_by;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiagnosed_by(int diagnosed_by) {
        this.diagnosed_by = diagnosed_by;
    }

    public int getId() {
        return id;
    }

    public int getRepaired_by() {
        return repaired_by;
    }

    public void setRepaired_at(LocalDateTime repaired_at) {
        this.repaired_at = repaired_at;
    }

    public LocalDateTime getRepaired_at() {
        return repaired_at;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }
}
