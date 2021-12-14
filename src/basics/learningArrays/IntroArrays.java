package basics.learningArrays;

import java.util.Scanner;

public class IntroArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arrOne; // Declaration
//        System.out.println(arr);
        arrOne = new int[10]; // Initialization


        int[] arrTwo;
        arrTwo = arrOne; // Copied

        System.out.println(arrOne);
        System.out.println(arrTwo);

        arrTwo = new int[20];
        System.out.println(arrTwo);

        arrOne[2] = 100;
        System.out.println(arrTwo[2]);

    }

}
