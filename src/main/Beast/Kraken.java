package main.Beast;

import main.Client.Client;

import java.util.Random;

public class Kraken extends WaterBeast{


    public Kraken(String name) {
        super(name, false,120,"Brown",150,KIND.KRAKEN);
    }

    @Override
    public void actAsBeast() {
        System.out.println("Gives a perl ");
    }
    public void ifFatalEnd(Client client) {
        System.out.println(" You survived! "+this.getName());
    }

    }

