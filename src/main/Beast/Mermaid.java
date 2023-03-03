package main.Beast;

import main.Client.Client;

import java.util.Random;

public class Mermaid extends WaterBeast{


    public Mermaid(String name) {
        super(name,true,150,"Blonde",200,KIND.MARMAL);
    }

    @Override
    public void actAsBeast() {
        System.out.println( "Sing a song ");
    }

    public void ifFatalEnd(Client client) {
        int chance=new Random().nextInt(100);
        if (chance<10){
            System.out.println("Fatal end.You've been kidnapped!");
            park.addLost(client);
        }
        else {
            System.out.println(" survived from "+this.getName());
        }

    }

}
