package main.Beast;

public abstract class EarthBeast extends Beast{

    EarthBeast(String name, TYPE_BEAST typeBeast,  boolean isDangerous,double price,KIND kind) {
        super(name, typeBeast, HABITAT.EARTH, isDangerous,price,kind);
    }
}
