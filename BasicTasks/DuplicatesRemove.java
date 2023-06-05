package main.ArrayTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesRemove {
    public static void main(String[] args) {


        int[] arr = {1, 12, 1, 16, 8, 4, 4};
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i] );
        }
//        List<Integer>newList=list.stream().distinct().toList();
//        System.out.println(newList);

//        System.out.println(list);
//
    ArrayList<Integer>unique=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate=false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i!=j) {
                    duplicate = true;
                    break;
                }
            }
                if(!duplicate){
                    unique.add(list.get(i));

                }
        }
        System.out.println(unique);
        }



    }



