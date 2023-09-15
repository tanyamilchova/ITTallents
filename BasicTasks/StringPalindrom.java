package main.ArrayTasks;

public class StringPalindrom {
    public static void main(String[] args) {

        String str="sovos";
        String string="";
        for (int i = str.length()-1; i >= 0; i--) {
            string=string.concat(String.valueOf(str.charAt(i)));
        }
        if(string.equals(str)) {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not a palindrom");
        }
    }
}
