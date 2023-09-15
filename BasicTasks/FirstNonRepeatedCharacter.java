package main.ArrayTasks;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        //The first non-repeated character of String
        String str="etnnewsletter";

        for (int i = 0; i < str.length()-1; i++) {
            boolean repeated=false;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                System.out.println(str.charAt(i)+" has not repetition");
                break;
            }
        }
    }
}
