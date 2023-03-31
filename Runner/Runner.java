package main.Runner;

import java.util.Random;

public class Runner {

    private int sleepTime;
    private String name;


   public Runner(String name){
        this.name=name;
        this.sleepTime=new Random().nextInt(500,700);
    }
    public int getSleepTime() {
        return sleepTime;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }
}
