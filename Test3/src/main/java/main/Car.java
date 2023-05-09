package main;

import java.time.LocalDateTime;

public class Car {

    private int id;
    private String licence_plate;
    private String model;
    private String owner;
    private String phoneOwner;
    private int year_of_production;


    public Car(String licence_plate, String model, String owmer_name, String phoneOwner, int year_of_production, int warranty, LocalDateTime registered_at) {
        this.licence_plate = licence_plate;
        this.model = model;
        this.owner = owmer_name;
        this.phoneOwner = phoneOwner;
        this.year_of_production = year_of_production;
        this.warranty = warranty;
        this.registered_at = registered_at;
    }

    private int warranty;
    private LocalDateTime registered_at;


    public String getPhoneOwner() {
        return phoneOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public int getWarranty() {
        return warranty;
    }

    public String getLicence_plate() {
        return licence_plate;
    }
}
