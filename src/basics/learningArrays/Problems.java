package basics.learningArrays;

import java.util.Scanner;

public class Problems {

    static Scanner s = new Scanner(System.in); // Globally Available

    // Taking Array Input
    public static int[] inputArray() {
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    // Basic approach to Sort 0 1
    public static int[] sort01(int[] inputArray) {
        //Sort 0s and 1s in the inputArray
        int countOnes = 0;
        for (int i = 0; i< inputArray.length; i++) {
            if (inputArray[i] == 1) {
                countOnes += 1;
            }
        }

        // int countZeros = inputArray.length - countOnes;
        int endIndex = inputArray.length - 1;

        int[] outputArray = new int[inputArray.length];
        while (endIndex >= 0) {

            if (countOnes != 0) {
                outputArray[endIndex] = 1;  //countOnes
                countOnes --;
            }

            endIndex --;
        }

        return outputArray;
    }


    // Assignment
    public static void sort01_alt(int[] inputArray) {

        // Implement this

    }


    // Sort 0 1 using two pointer technique
    public static void sort01_twoPointerTech(int[] inputArray) {

        int nextZero = 0;
        int nextOne = inputArray.length - 1;

        int iteration = 0;
        while (nextZero < nextOne) {

            while (inputArray[nextZero] == 0 && nextZero < nextOne) {
                nextZero += 1;
            }

//            if (inputArray[nextZero] == 0) {
//                nextZero += 1;
//            }

            while (inputArray[nextOne] == 1 && nextOne > nextZero) {
                nextOne -= 1;
            }

//            if (inputArray[nextOne] == 1) {
//                nextOne -= 1;
//            }


            if (nextZero < nextOne) {
                int temp = inputArray[nextZero];
                inputArray[nextZero] = inputArray[nextOne];
                inputArray[nextOne] = temp;
            }

            nextZero += 1;
            nextOne -= 1;
        }

    }

    // To print array
    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
//        int[] arr = inputArray();
//
//        System.out.println("Before Sorting");
//        printArray(arr);
//
//        sort01_twoPointerTech(arr);
//
//        System.out.println("After Sorting");
//        printArray(arr);


//        boolean[] b = {false, true, true};
//        System.out.println(b.length);
//        printArray(b);


        char[] word = new char[10]; // default value of char array is a null (\0)
        word[0] = 'H';
        word[1] = 'e';
        word[2] = 'l';
        word[3] = 'l';
        word[4] = '0';
        System.out.println(word.length);
//        printArray(word); // We are printing using the typical loop

        System.out.println(word);


        String a = "Hello World";

        System.out.println(a.charAt(0)); // a[0]
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
        System.out.println(a.charAt(4));


        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }


    }
}
