package basics.controlStatementsAndOperators;

import java.util.Scanner;

public class CharacterCase {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // How to scan a single letter / character
        String word = s.next();
        char ch = word.charAt(0);

//        ch -> A to Z
//        if ((ch >= A) && (ch <= Z)) {
//                print(1)
//        } else if ((ch >= a) && (ch <= z)) {
//                print(0)
//       } else {
//                 print(-1)
//       }

        if ((ch >= 65) && (ch <= 90)) {
            System.out.println(1);
        } else if ((ch >= 'a') && (ch <= 'z')) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

//        char p = 97;  // char p = 'a';
//        int asciiValue = ((int)p); // convert p to it's integer format
//
//        int val = 674;
//        char exp = (char) val;
//        System.out.println(asciiValue + " " + p + " " + exp);
//
//
//        System.out.println((char)(5678 * 4));

//        String name = "Raghu"; This is not allowed
//        int val = (int) name;
    }

}
