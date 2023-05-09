package main;


import java.time.LocalDateTime;
import java.util.Random;


public class Worker extends Thread {


    public enum TYPE{MONTEUR,PODRUJKA}
    public static Service service;
    private int id;
    private int age;
    private String name;
    private TYPE type;
    public Worker(String name, TYPE type) {
        this.age = new Random().nextInt(25, 65);
        this.type =new Random().nextBoolean()?TYPE.MONTEUR:TYPE.PODRUJKA;
        this.name=name;

    }



    @Override
    public void run() {
        while (true){
            try {
                DBManager.getInstance().regisrterWorker(this);

                Order orderWork=null;
                if(this.type==TYPE.MONTEUR) {
                   orderWork =service.takeFromPodrujka2();
               }else{
                   orderWork =service.takeFromRemont2();
               }
               if(orderWork!=null) {

                   // дата на поправка и от кого е направена
                   orderWork.setRepaired_by(this.id);
                   orderWork.setRepaired_at(LocalDateTime.now());
                   orderWork.setService_id(orderWork.getRandomServiceId(orderWork.getType()));

                   System.out.println(orderWork.getType()+" setRepaired at DB from worker " + this.id);
                   DBManager.getInstance().setRepaired(orderWork);

                   Thread.sleep(orderWork.getWorkingTime());
                   service.addCarReady3(orderWork);
               }
            } catch (InterruptedException  | RuntimeException e) {
                System.out.println("lala run method worker " + e.getMessage());
                return;
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
}

