package main.Client;

import main.Attraction.Attraction;

import java.util.Random;

public class Kid extends Client{

    public Kid(String name) {
        super(name,new Random().nextInt(2,15),new Random().nextBoolean() ?GENDER.FEMALE:GENDER.MALE ,KIND.KID);

    }

    @Override
    public double getPriceAfterDiscount(Double price) {
        return 0.5*price;
    }

    @Override
    public Attraction choiceAnAtraction(Attraction attraction) {
        return park.getRandomNormalAttr();
    }
}
