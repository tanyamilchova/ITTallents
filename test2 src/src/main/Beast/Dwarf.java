package main.Beast;

import main.Client.Client;

import java.util.Random;

        public class Dwarf extends EarthBeast{


   public Dwarf(String name)  {
        super(name, TYPE_BEAST.EARTHBEAST, false,150,KIND.DWARF);
    }

    @Override
    public void actAsBeast() {
        System.out.println("Gives a ring ");
    }

    @Override
    public void ifFatalEnd(Client client) {
        System.out.println(" You survived! from "+this.getName());
    }
}
