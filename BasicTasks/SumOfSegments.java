package main.Pretest.Taskss;

import java.util.ArrayList;

public class Otsechki2 {
    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        arrayList.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        arrayList.add(list1);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(6);
        arrayList.add(list4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(10);
        arrayList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(9);
        arrayList.add(list3);



        int sum = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            ArrayList<Integer>prev=new ArrayList<>();
            prev=arrayList.get(i-1);
            ArrayList<Integer>curr=new ArrayList<>();
            curr=arrayList.get(i);
            System.out.println(prev);
            System.out.println(curr);
            int start=prev.get(0);
            int end=prev.get(1);
            int newStart=curr.get(0);
            int newEnd=curr.get(1);

            if(newStart<end){
                newStart=end;
            }
            if(newEnd<end){
                newEnd=end;
            }
            sum=sum+newStart-end;
        }
        System.out.println(sum);
    }
}
