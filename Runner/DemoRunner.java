package main.Runner;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DemoRunner {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Team>teams=new ArrayList<>();
        Team.teamsNumber=5;
        System.out.println();
        for (int i = 0; i <Team.teamsNumber ; i++) {
            Team team=new Team("Team"+i,5,4);
            teams.add(team);
        }
        long duration=0;
        long start=0;
      for (Team team:teams){
          start = System.currentTimeMillis();

          team.start();
          System.out.println(LocalDateTime.now());
          team.printRunners();
          System.out.println(Thread.currentThread());

      }
      for (Team t:teams){
          t.join();
          duration = System.currentTimeMillis() -start;
          t.setScore(duration);
      }

        teams.sort((o1, o2) -> Long.compare(o2.getScore(),o1.getScore()));
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getName()+":"+teams.get(i).getScore());
        }


    }
}
