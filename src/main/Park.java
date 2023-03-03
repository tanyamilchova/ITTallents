package main;

import main.Attraction.Attraction;
import main.Beast.Beast;
import main.Client.Client;

import java.util.*;
import java.util.stream.Collectors;

public class Park {

    private String name;
    private String adress;
    private double price;
    private double money;
    private ArrayList<Client>clients=new ArrayList<>();
    private int kidNumbers;
    private TreeSet<Attraction> extrAttr =new TreeSet<>();
    private TreeSet<Attraction> normAttr =new TreeSet<>();
    private ArrayList<Client>lostClients=new ArrayList<>();
    private Map<Beast.KIND,Double> beasts =new HashMap<>();
    private Map<Attraction.TYPE_ATR, Map<Beast, Set<Client>>>atractMap=new HashMap<>();
    private Map<Beast.TYPE_BEAST, HashMap<Beast.KIND,Double>> priceList=new HashMap<>();

    public Park(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public void addNormAtr(Attraction attraction){
        normAttr.add(attraction);
    }
    public void addExtrAtr(Attraction attraction){
        extrAttr.add(attraction);
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public void addLost(Client client){
        lostClients.add(client);
    }



    public void addBeast( Beast beast){
        if(! beasts.containsKey(beast.getKind())){
            beasts.put(beast.getKind(),0.0);
        }
//        beasts.get(beast.getKind()).
        beasts.put(beast.getKind(),beast.getMoney() );
    }

    public Attraction getRandomNormalAttr(){
        ArrayList<Attraction>list=new ArrayList<>(normAttr);
        Collections.shuffle(list);
      return list.get(new Random().nextInt(list.size()));
    }
    public Attraction getRandomExtremeAttr(){
        ArrayList<Attraction>list=new ArrayList<>(extrAttr);
        Collections.shuffle(list);
        return list.get(new Random().nextInt(list.size()));
    }
    public void info(){
        System.out.println(  "clients "+clients);
        System.out.println( "extreme "+extrAttr);
        System.out.println(normAttr+" normal");
        for (Map.Entry<Beast.KIND,Double> e:beasts.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println(  "lost " +lostClients);
    }
    public void accumulateBeastsByIncomes(Beast beast){
//        System.out.println("Справка с всички типове животни, подредени по акумулираните приходи.");
        if(! priceList.containsKey(beast.getTypeBeast())){
            priceList.put(beast.getTypeBeast(),new HashMap<>());
        }
        if(!priceList.get(beast.getTypeBeast()).containsKey(beast.getKind())){
            priceList.get(beast.getTypeBeast()).put(beast.getKind(),beast.getMoney());
        }
        double old=priceList.get(beast.getTypeBeast()).get(beast.getKind());
        priceList.get(beast.getTypeBeast()).put(beast.getKind(),(old+beast.getMoney()));
    }
    public void printIncomesByTyoe(){
        for (Map.Entry<Beast.TYPE_BEAST,HashMap<Beast.KIND,Double>> e:priceList.entrySet()){
            System.out.println(e.getKey()+":");
            for (Map.Entry<Beast.KIND,Double>e1:e.getValue().entrySet()){
                System.out.println("\t"+e1.getKey()+"-"+e1.getValue());
            }
        }
    }
    public void receivePayments(double payment) {
        this.money+=payment;
    }
    public void startAttractting(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                Attraction attraction = clients.get(i).choiceAnAttraction();
                attraction.addClient(clients.get(i));
                clients.get(i).setBeast(attraction.getBeast());
                if (clients.get(i).getKind().equals(Client.KIND.KID)) {
                    kidNumbers++;
                }
            }
        }

        for (Attraction attraction1 : extrAttr) {
            attraction1.attractClientFronList();
            attraction1.printClientsFromQueue();
        }
        for (Attraction attraction1 : normAttr) {
            attraction1.attractClientFronList();
            attraction1.printClientsFromQueue();
        }
        info();
        statistics();
        printIncomesByTyoe();
    }


    public void statistics(){
        stat1();
        stat2();
        stat3();
        stat4();
        stat5();
        stat6();
        stat7();
        stat8();
        stat9();

    }
    public void stat1(){
        System.out.println("Брой деца, посетили парка - "+ this.kidNumbers+"Num of children");
    }
    public void stat2(){
        Double incomes=beasts.entrySet().stream()
                .map(m->m.getValue())
                .reduce(0.0,(sum,el)->sum+el);
        System.out.println(" incomes of the Park "+incomes);
    }
    public void stat3(){
//        System.out.println("Името на най-посещаваната атракция нормална и на най-посещаваната екстремна ")
//
        ArrayList<Attraction>listNormal=new ArrayList<>(normAttr);
        listNormal.sort((o1, o2) -> Double.compare(o2.getBeast().getMoney(),o1.getBeast().getMoney()));
        System.out.println(listNormal.get(0).getBeast().getName()+":"+listNormal.get(0).getBeast().getMoney()+" the most visited normal attraction");

        ArrayList<Attraction>listExtreme=new ArrayList<>(extrAttr);
        listNormal.sort((o1, o2) -> Double.compare(o2.getBeast().getMoney(),o1.getBeast().getMoney()));
        System.out.println(listNormal.get(0).getBeast().getName()+":"+listNormal.get(0).getBeast().getMoney()+" the most visited extreme attraction");
    }
    public void stat4(){
//        System.out.println("Брой клиенти, които „не са се завърнали“ от парка (погълнати)");
        System.out.println("lost clients :"+lostClients.size());
    }
    public void stat5(){
        System.out.println("Брой души, които дяволите са взели на възрастни жени");
        lostClients.stream()
          .filter(p->p.getGender()== Client.GENDER.FEMALE)
          .filter(p->p.getKind()== Client.KIND.ADULT)
                .filter(p->p.getBeast().getKind()== Beast.KIND.DEVIL)
                .forEach(p1-> System.out.println(p1.getName()+" devil has taken their soul"));
    }
    public void stat6(){
        System.out.println("Имената на всички пенсионери, които са били изпепелени от драконите");
        lostClients.stream()
                .filter(p->p.getKind()== Client.KIND.PENTIONER)
                .filter(p->p.getBeast().getKind()== Beast.KIND.DRAGON)
                .forEach(p-> System.out.println(p.getName()+" изпепелени от драконите " ));
    }
    public void stat7(){
//        System.out.println(" Средната възраст на всички отвлечени клиенти от русалките.");
        long age=lostClients.stream()
                .filter(p->p.getBeast().getKind()== Beast.KIND.MARMAL)
                .map(p->p.getAge())
                .reduce(0,(sum,el)->sum+el);
        long num=lostClients.stream()
                        .filter(p->p.getBeast().getKind()== Beast.KIND.MARMAL)
                                .count();
        if(num!=0){
                System.out.println(age/num+" average age of all kidnapped by Mermaids");
        }
        else {
            System.out.println("No one was kidnapped by a Mermaid");
        }
    }
    public void stat8(){
        System.out.println(" Името на най-смъртоносния дракон");
        ArrayList<Double>list1=new ArrayList<>();
        Attraction attraction=null;
      Attraction attraction1=  extrAttr.stream()
                .filter(p->p.getBeast().getKind()== Beast.KIND.DRAGON)
                .sorted( (o1, o2) -> Double.compare((o2.getBeast().getMoney()),o1.getBeast().getMoney()))
                .collect(Collectors.toList()).get(0);
        System.out.println(attraction1.getBeast().getName()+" най-смъртоносния дракон");
    }
    public void stat9(){
        System.out.println("Процент „риск“ от екстp. атр. – съот. между броя клиенти, посетили \n" +
                "екстремна атракция и броя клиенти, които не са се завърнали оттам. ");
        int ratio=( lostClients.size()*100/clients.size());
        System.out.println( ratio+" ratio lost/clients");
    }


}
