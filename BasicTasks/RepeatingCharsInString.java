package main.ArrayTasks;

import java.util.ArrayList;

public class RepeatingCharsInString {
    public static void main(String[] args) {
        //11. Print repeated characters of String?
        String str="SimulationBarbaron";
        ArrayList<Character>chars=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char one=str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                char second=str.charAt(j);
                if(one==second && !chars.contains(one)){
                    chars.add(one);
                    System.out.println(one);
                    break;
                }
            }
        }
        System.out.println(chars);
    }
}
