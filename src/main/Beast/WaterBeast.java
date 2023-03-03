package main.Beast;

public abstract class WaterBeast extends Beast{

    private int maxDiving;
    private String hairColour;


    public WaterBeast(String name,  boolean isDangerous,int maxDiving,String hairColour,double price,KIND kind) {
        super(name, TYPE_BEAST.WATERBEAST, HABITAT.WATER, isDangerous,price,kind);
    }
}
