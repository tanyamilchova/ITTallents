package main.Beast;

public abstract class AirBeast extends Beast{

    private int maxSpeed;


    AirBeast(String name, boolean isDangerous,int maxSpeed,double price,KIND kind) {
        super(name, TYPE_BEAST.AIRBEAST, HABITAT.AIR, isDangerous,price,kind);
    }
}
