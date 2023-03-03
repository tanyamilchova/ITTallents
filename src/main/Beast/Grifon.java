package main.Beast;

import main.Client.Client;

import java.util.Random;

public class Grifon extends AirBeast{


    public Grifon(String name ) {
        super(name,  true,100,150,KIND.GRIF );
    }

    @Override
    public void actAsBeast() {
        System.out.println("Ride me ");
    }
    public void ifFatalEnd(Client client) {
        System.out.println(" You survived! "+this.getName());
    }
}
