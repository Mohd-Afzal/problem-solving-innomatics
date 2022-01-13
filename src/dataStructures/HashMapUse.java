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

//        Set<Character> keys = map.keySet();
//        for (char key : keys) {
//            System.out.println(key + " : " + map.get(key));
//        }

//        O(1) -> fetching the values -> using array indexing
        int maxFrequency = 0; char maxFreqCharacter = '\0';
        for (int i = 0; i < word.length(); i++) {
            char eachCharacter = word.charAt(i); // O(1) operation
            int frequency = map.get(eachCharacter); // Value of eachCharacter in word will be at least 1

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFreqCharacter = eachCharacter;
            }
        }

        return maxFreqCharacter;
    }

    public static void main(String[] args) {

        System.out.println(highestFrequency("ggabaacagggadefbggbgggg"));

    }
}

