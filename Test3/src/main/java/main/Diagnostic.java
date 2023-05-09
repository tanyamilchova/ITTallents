package main;

import java.util.Random;

public class Diagnostic extends Thread{

    public static Service service;

    private int id;
    private String name;
    private int  age;

    Diagnostic(int age, String name){
        this.age=age;
        this.name=name;
    }


    @Override
    public void run() {
        while (true){
            try{
       Order order=service.takeOrderFromDiagnostik1();
       if(order!=null) {
           DBManager.addDiagnostic(this);
           order.setDiagnosed_by(this.id);
           Thread.sleep(5000);
           Order.TYPE_SERVICE typeService = getRandomService();
           order.setType(typeService);

           order.setService_id( order.getRandomServiceId(typeService) );

           System.out.println(order.getType()+"order, diagnosed by :"+this.id);
           DBManager.getInstance().upDateDiagnosticTimeType(order);

           switch (typeService) {
               case REMONT -> service.putForRemont2(order);
               case PODRUJKA -> service.putForPodrujka2(order);
           }
       }

                System.out.println("In diagnostic");
            }catch (InterruptedException | RuntimeException e){
                System.out.println("run method diagnosisic");
                return;
            }
        }
    }

    private Order.TYPE_SERVICE getRandomService() {
        return new Random().nextBoolean()? Order.TYPE_SERVICE.PODRUJKA: Order.TYPE_SERVICE.REMONT;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public long getId() {
        return id;
    }
}
