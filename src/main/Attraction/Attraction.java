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


    public Attraction( TYPE_ATR type) {
        this.type = type;
        this.beast=beast;
    }

    public void showYourTrick(){
        for (Client client1:clientList) {
            double payment=client1.getPriceAfterDiscount(this.calculatePrice(this.beast));
            client1.paymentDone(payment);
            this.beast.getPayment(payment);
            park.receivePayments(payment);
            this.beast.actAsBeast();
            this.beast.ifFatalEnd(client1);
            park.addBeast(beast);
            park.accumulateBeastsByIncomes(beast);

        }
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
            System.out.println(p+" this client on the Queue");
            this.showYourTrick();
        });
    }
    public void printClientsFromQueue(){
        System.out.println(clientList+" clients on this queue");
    }
    public TYPE_ATR getType() {
        return type;
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
