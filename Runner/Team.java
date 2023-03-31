package main.Runner;

import main.Participant;

import java.util.*;

public class Team extends Thread {

    public static int teamsNumber;
    private int teamParticipants;
    private Queue<Runner> runners =new LinkedList<>();
    private long duration;
    private String team;
    private HashMap<Integer,Long> participantScores=new HashMap<>();
    private long score;
    private String name;

    Team(String name,int teamsNumber,int teamParticipants){
        this.teamParticipants=teamParticipants;
        this.teamsNumber=teamsNumber;
        addRunner();
    }
    public void addRunner(){
        for (int i = 0; i <teamParticipants ; i++) {
            Runner runner1=new Runner("Runner"+i);
            runners.offer(runner1);
        }
    }

    @Override
    public void run() {
        for (Runner r :runners){
            try {
                System.out.println(r.getName()+" from "+Thread.currentThread().getName()+" started");
                Thread.sleep(r.getSleepTime());
                System.out.println(r.getName()+" from "+Thread.currentThread().getName()+" is running "+r.getSleepTime());
            } catch (InterruptedException e) {
                System.out.println("Lele");
            }
        }
    }
    public void printRunners(){
        System.out.println(runners);
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getScore() {
        return score;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
