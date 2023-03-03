package main.Client;

import main.Attraction.Attraction;
import main.Beast.Beast;
import main.Park;

public abstract class Client {
    public enum GENDER{MALE,FEMALE}
    public enum KIND {KID,ADULT,PENTIONER}

    public static Park park;
    private String name;
    private int age;
    private GENDER gender;
    private KIND kind;
    private double money=1000;
    private Beast beast;

    public Client(String name, int age, GENDER gender,KIND kind) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.kind=kind;

    }

    private double tax;

    public abstract double getPriceAfterDiscount(Double price);
    public abstract Attraction choiceAnAttraction();
    public void paymentDone(double price){
        this.money-=price;
    }

    public GENDER getGender() {
        return gender;
    }

    public KIND getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setBeast(Beast beast) {
        this.beast = beast;
    }

    public Beast getBeast() {
        return beast;
    }

    public int getAge() {
        return age;
    }
}
