package main.Beast;

import main.Client.Client;

import java.util.Random;

public class Dragon extends AirBeast{


    public Dragon(String name) {
        super(name, true, 200,200,KIND.DRAGON);
    }

    @Override
    public void actAsBeast() {
        System.out.println("Gives a diamond");
    }

    public void ifFatalEnd(Client client) {
        int chance=new Random().nextInt(100);
        if (chance<10){
            System.out.println("Fatal end. You've been burned");
            park.addLost(client);
        }
        else {
            System.out.println(" survived from "+this.getName());
        }

    }


}
