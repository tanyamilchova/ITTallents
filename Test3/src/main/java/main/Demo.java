package main;

import java.time.LocalDateTime;
import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Worker.service = service;
        Diagnostic.service = service;
        Priemchik.service = service;
        Dispecher.service = service;

        Priemchik priemchik = new Priemchik();
        priemchik.start();


        for (int i = 0; i < 10; i++) {
            Car car = new Car("CC000" + i + "AA", "bmv", "owner", "088870000" + i,
                    2010, new Random().nextInt(2), LocalDateTime.now());
            service.putCar0(car);
        }



        Diagnostic diagnostic1 = new Diagnostic(new Random().nextInt(25, 65), "Diagnostic1");
        diagnostic1.start();
        Diagnostic diagnostic2 = new Diagnostic(new Random().nextInt(25, 65), "Diagnostic2");
        diagnostic2.start();


        Worker worker1 = new Worker("Worker1 ", Worker.TYPE.MONTEUR);
        worker1.start();
        Worker worker2 = new Worker("Worker2 ", Worker.TYPE.MONTEUR);
        worker2.start();


        Worker worker3 = new Worker("W3", Worker.TYPE.PODRUJKA);
        worker3.start();
        Worker worker4 = new Worker("W4", Worker.TYPE.PODRUJKA);
        worker4.start();



        Dispecher dispecher = new Dispecher();
        dispecher.start();


        Reporter reporter = new Reporter(service);
        reporter.setDaemon(true);
        reporter.start();


        Thread.sleep(35000);

            priemchik.interrupt();
            diagnostic1.interrupt();
            diagnostic2.interrupt();
            worker1.interrupt();
            worker2.interrupt();
            worker3.interrupt();
            worker4.interrupt();
            dispecher.interrupt();

    }
}

