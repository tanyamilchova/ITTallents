package main.Beast;

import main.Attraction.Attraction;
import main.Client.Client;
import main.Park;

import java.util.Objects;

public abstract class Beast {
    public static Park park;
    public static Attraction attraction;


    public enum TYPE_BEAST{WATERBEAST,AIRBEAST,EARTHBEAST}
    public enum HABITAT{WATER,AIR,EARTH}
    public enum KIND{MARMAL,KRAKEN,DRAGON,GRIF,DEVIL,DWARF}
    private String name;
    private TYPE_BEAST typeBeast;
    private HABITAT habitat;
    private double price;
    private Client client;
    private boolean isDangerous;
    private double money;
    private KIND kind;





     public Beast(String name, TYPE_BEAST typeBeast, HABITAT habitat, boolean isDangerous,double price,KIND kind) {
        this.name = name;
        this.typeBeast = typeBeast;
        this.habitat = habitat;
        this.isDangerous=isDangerous;
        this.price=price;
        this.kind=kind;
     }
     public abstract void actAsBeast();
     public abstract void ifFatalEnd(Client client);
     public TYPE_BEAST getTypeBeast() {
        return typeBeast;
     }
    public void acceptMoney(double tax){
        this.money+=tax;
    }
    public void getPayment(double payment){
        this.money+=payment;
    }
    public double getPayment() {
        return price;
    }
    public double getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beast beast = (Beast) o;
        return Objects.equals(name, beast.name) && typeBeast == beast.typeBeast;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, typeBeast);
    }

    public KIND getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }
}
