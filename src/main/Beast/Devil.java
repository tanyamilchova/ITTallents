package main.Beast;

import main.Client.Client;

import java.util.Random;

public class Devil extends EarthBeast{


    public Devil(String name) {
        super(name, TYPE_BEAST.EARTHBEAST,  true,200,KIND.DEVIL);
    }

    @Override
    public void actAsBeast() {
        System.out.println(" I'll make your wish come true");
    }

    public void ifFatalEnd(Client client) {
        int chance=new Random().nextInt(100);
        if (chance<10){
            System.out.println("Fatal end. Your soul has been taken!");
            park.addLost(client);
        }
        else {
            System.out.println(" survived from "+this.getName());
        }

    }
}
