package main.ArrayTasks;

import java.util.Arrays;

public class ReverseWordOfSentence {
    public static void main(String[] args) {
        //Reverse words of a sentence
        String sent="This is a simple sentence";
        String[] arr=sent.split(" ");
        for (int i = 0; i < arr.length/2; i++) {
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        String s1= Arrays.toString(arr);
        System.out.println(s1);

        StringBuilder builder =new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            builder.append(" ");
            System.out.println(arr[i]);
        }
        builder.toString();
        System.out.println(builder);
    }
}
