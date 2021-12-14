package basics.recursion;

import java.util.Scanner;

public class LearningRecursion {

    static Scanner s = new Scanner(System.in);

    public static int factorial(int n) {
//        System.out.println(n);

//        Smallest sub-problem that can solved effortlessly
//        Base Case/Condition
        if (n == 0) {
            return 1;
        }

//        Induction Hypothesis
        int smallAns = factorial(n-1);


//        Induction step
        int myAns = n * smallAns;
        return myAns;
    }

    public static int fibonacci(int n) {
        // Special Condition
        if (n < 0) {
            System.out.println("Not a valid term for Fibonacci Series");
            // throw an exception
            return -0000;
        }

        // Base Case/condition or Breaking condition
        if (n == 0 || n == 1) {
            return n;
        }

        // Induction Hypothesis
        int smallAns1 = fibonacci(n-1);
        int smallAns2 = fibonacci(n-2);

        // Induction Step
        int myAns = smallAns1 + smallAns2;
        return myAns;
    }

    public static void printTill(int n) {
        // Special Case
        if (n <= 0) {
            System.out.println("Invalid Input!");
            // Throw an Exception
            return;
        }

        // Base Case
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }

        // Induction Hypothesis
        printTill(n-1);

        //Induction Step
        System.out.print(n + " ");
    }

    public static int stringLength(String str) {

        if (str.equals("")) {
            return 0;
        }

//        int smallLength = stringLength(str.substring(0, (str.length()-1)));
        int smallLength = stringLength(str.substring(1));
        int myLength = smallLength + 1;
        return myLength;
    }

    public static void printArrayForward(int[] arr) {
//        if (arr.length == 0) { // Cant write it this way coz not a string-> arr == ""
//            // Nothing to print
//            return;
//        }
//
//        int[] smallArr = new int[arr.length - 1];
//
//        for (int i = 0; i < smallArr.length; i++) {
//            smallArr[i] = arr[i];
//        }
//
//        printArrayForward(smallArr);
//        System.out.print(arr[arr.length - 1] + " "); // Print last element
        printArrayForward(arr, 0);
    }

    public static void printArrayForward(int[] arr, int start) {
        if (start == arr.length) {
            return;
        }

        System.out.print(arr[start] + " ");
        printArrayForward(arr, start + 1);
    }

//    public static void printArrayBackward(int[] arr, int start) {
//
//        System.out.println();
//    }

//    public static void printArrayBackward(int[] arr) {
//        // Your codes goes here.
//        printArrayBackward(arr, 0);
//    }


    public static int sumArray(int[] arr) {
        int ans = sumArray(arr, 0);
        return ans;
    }

    public static int sumArray(int[] arr, int start) {
        if (start == arr.length) {
            return 0;
        }

        int smallAns = sumArray(arr, start + 1);
        int myAns = arr[start] + smallAns;

        return myAns;
    }

    public static void main(String[] args) {
//        System.out.println(factorial(s.nextInt()));
//        System.out.println(fibonacci(7));

//        printTill(s.nextInt());

//        String word = "Afzal";

//        String sub_One = word.substring(5);
//        System.out.println(sub_One.length());
//        System.out.println(sub_One);
//
//        String sub_Two = word.substring(0, 0);
//        System.out.println(sub_Two.length());
//        System.out.println(sub_Two.charAt(0));
//        System.out.println(sub_Two);


//        System.out.println(stringLength(s.nextLine()));

        int[] arr = {2, 3, 5};
//        printArrayForward(arr);
        System.out.println(sumArray(arr));


    }

}
