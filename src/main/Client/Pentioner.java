package main.Client;

import main.Attraction.Attraction;

import java.util.Random;

public class Pentioner extends Client{
    public Pentioner(String name) {
        super(name, new Random().nextInt(66,100), new Random().nextBoolean() ?GENDER.FEMALE:GENDER.MALE,KIND.PENTIONER);
    }

    @Override
    public double getPriceAfterDiscount(Double price) {
        return 0.2*price;
    }

    @Override
    public Attraction choiceAnAttraction() {
        return new Random().nextBoolean() ?park.getRandomNormalAttr() : park.getRandomExtremeAttr();
    }
}
