package main;

import main.Attraction.Attraction;
import main.Attraction.ExtremAttraction;
import main.Attraction.NormalAttraction;
import main.Beast.*;
import main.Client.Adult;
import main.Client.Client;
import main.Client.Kid;
import main.Client.Pentioner;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
         Park park=new Park("SofiaPark","Sofia");
        Attraction.park=park;
        Beast.park=park;
        Client.park=park;

        for (int i = 0; i < 3; i++) {
            NormalAttraction normalAttraction=new NormalAttraction();
            normalAttraction.setBeast(new Kraken("Kraken"+i) );
            park.addNormAtr(normalAttraction);
            NormalAttraction normalAttraction1=new NormalAttraction();
            normalAttraction1.setBeast(new Grifon("Grifon"+i));
            park.addNormAtr(normalAttraction1);
            NormalAttraction normalAttraction2=new NormalAttraction();
            normalAttraction2.setBeast(new Dwarf("Dwarf"+i));
            park.addNormAtr(normalAttraction2);
        }
        for (int i = 0; i < 2; i++) {
            ExtremAttraction extremAttraction=new ExtremAttraction();
            extremAttraction.setBeast(new Mermaid("Mermaid"+i));
            park.addExtrAtr(extremAttraction);

            ExtremAttraction extremAttraction1=new ExtremAttraction();
            extremAttraction1.setBeast(new Dragon("Dagon"+i));
            park.addExtrAtr(extremAttraction1);
            ExtremAttraction extremAttraction2=new ExtremAttraction();
            extremAttraction2.setBeast(new Devil("Devil"+i));
            park.addExtrAtr(extremAttraction2);
        }

        for (int i = 0; i < 100; i++) {

            Client client =null;
            int chance3 = new Random().nextInt(3);
            client = switch (chance3) {
                case 1 -> new Kid("Kid" + i);
                case 2 -> new Adult("Adult" + i);
                default -> new Pentioner("Pentioner" + i);
            };
                    park.addClient(client);
        }


        park.startAttractting();


    }
}





