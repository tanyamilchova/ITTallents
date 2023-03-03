package main.Client;

import main.Attraction.Attraction;

import java.util.Random;

public class Adult extends Client{
    public Adult(String name) {
        super(name, new Random().nextInt(18,65), new Random().nextBoolean() ?GENDER.FEMALE:GENDER.MALE,KIND.ADULT);
    }
    @Override
    public double getPriceAfterDiscount(Double price) {
        return price;
    }
    public Attraction choiceAnAttraction() {
        return new Random().nextBoolean() ?park.getRandomNormalAttr() : park.getRandomExtremeAttr();
    }



}
