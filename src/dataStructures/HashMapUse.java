package dataStructures;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapUse {

    private static Scanner s = new Scanner(System.in);

    public static char highestFrequency(String word) {
        //        Map(Interface) -> HashMap| Concrete Implementation of Map

        /* ----- Creating a HashMap ----- */
//        Map<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        // Creating entries in the map
        for (int i = 0; i < word.length(); i++) {
            char eachCharacter = word.charAt(i);
            if (map.containsKey(eachCharacter)) {
                // Key exists in the map
                int currentValue = map.get(eachCharacter);
                map.put(eachCharacter, (currentValue + 1));
            } else {
                map.put(eachCharacter, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (char key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        // return the highest freq char

        return '\0';
    }

    public static void main(String[] args) {

        highestFrequency("abaacaadefbgb");

    }
}

