package main.ArrayTasks;

import java.util.ArrayList;
import java.util.Iterator;

public class StringAnagram {
    public static void main(String[] args) {

        String str = "banana";
        String str2 = "nabana";
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str2.charAt(i));
        }
        System.out.println(characters);
        if (str.length() == str2.length()) {
            for (int i = 0; i < str.length(); i++) {
                for (Iterator<Character> it = characters.iterator(); it.hasNext(); ) {
                    Character ch = it.next();
                    if (str.charAt(i) == ch) {
                        it.remove();
                    }
                }
            }
            System.out.println(characters);
        }
    }
}
