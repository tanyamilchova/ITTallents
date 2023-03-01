package main.Attraction;

import main.Beast.Beast;;
import main.Client.Client;
import main.Park;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Attraction implements Comparable<Attraction>{
public enum TYPE_ATR{NORMAL,EXTREME}

    public static Park park;
    private Queue<Client> clientList=new LinkedList<>();
    private Beast beast;
    private TYPE_ATR type;
    private int usege;

    public Attraction( TYPE_ATR type) {
        this.type = type;
        this.beast=beast;
    }

//    public abstract Client clientType();
//    public abstract boolean chanceToSurvive();
//
//    public abstract Beast getBeastType();
    public void showYourTrick(Client client){
//        for (Client client1:clientList) {
            double payment=client.getPriceAfterDiscount(this.calculatePrice(this.beast));
            client.paymentDone(payment);
            this.beast.getPayment(payment);
            park.receivePayments(payment);
            this.beast.actAsBeast();
            this.beast.ifFatalEnd(client);
            park.addBeast(beast);

//        }
    }
    public   void addClient(Client client){
        clientList.offer(client);
    }
    public double calculatePrice(Beast beast){
        return beast.getPayment();
    }

    public void attractClientFronList(){
clientList.stream()
        .forEach(p-> {
            System.out.println(p+" clientQueue");
            this.showYourTrick(p);

        });

    }
    public void printClientsFromQueue(){
        System.out.println(clientList);
    }

    public TYPE_ATR getType() {
        return type;
    }

    public int getUsege() {
        return usege;
    }

    @Override
    public int compareTo(Attraction o) {
        return this.beast.getKind().compareTo(o.beast.getKind());
    }

    @Override
    public String toString() {
        return " " + beast.getKind();
    }

    public void setBeast(Beast beast) {
        this.beast = beast;
    }

    public Beast getBeast() {
        return beast;
    }
}
