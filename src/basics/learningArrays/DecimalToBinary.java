package basics.learningArrays;

import java.util.Scanner;

public class DecimalToBinary {
    /*
    *
    *  https://leetcode.com/problems/palindrome-number/
    *  Binary to Decimal (Assignment)
    *  Square root (integer)
    *  Fibonacci Series
    *
    * */

    public static int reverse(int num) {
        int rev = 0;
        while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        return rev;
    }

    public static int decimalToBinary(int num) {
        //Special Case
        if (num == 0) {
            return 0;
        }

        int prev = 0;

        String ans = "";
        // Num is always positive
        while (num != 0) {
            int rem = num % 2;
            ans = rem + ans; // Building ans using string
            prev = prev * 10 + rem; // BuildRing the forward ans
            num /= 2;
        }

        System.out.println(prev);

        return (reverse(prev));

//        return ans; // Ans in String
    }


    public static void fibonacci(int n) {
        System.out.print("0 1 "); // 2 terms done

        int leftToPrint = n - 2;

        int start = 1;
        int first = 0;
        int second = 1;
        int ans = 9999999; // This is not our ans at this point.

        while (start <= leftToPrint) {

            ans = first + second;
            System.out.print(ans + " ");

            first = second;
            second = ans;

            start += 1;
        }

        return;
    }

    public static boolean isPalindrome(int num) {

        int duplicate = num;

        boolean flag = false;
        if (num < 0) {
            num *= -1;
            flag = true;
        }

        String rev = "";

        while (num != 0) {
            int rem = num % 10;
            rev = rev + rem;
            num /= 10;
        }

        if (flag) {
            rev += "-";
        }

//        System.out.println("Reverse : " + rev); // for 0 ""
        String numString = duplicate + ""; // 0
//        System.out.println("Original inString : " + numString);

        if (numString.equals(rev)) { // 0 with ""
            return true;
        }

        return false;
    }



    public static int duplicate(int[] arr) {
        int i = 0;

//        for (int i = 0; i < arr.length; i++)
//              for (int j = i + 1; j < arr.length; j++)
//                        arr[i] == arr[j]
//                                return arr[i]
        while (i < arr.length) {
            int numTOCheck = arr[i];

            int j = i+1;
            while (j < arr.length) {
                if (numTOCheck == arr[j]) {
                    return numTOCheck;
//                    return arr[i];
                }
                j += 1;
            }
            i += 1;
        }
        return 34567890;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println(decimalToBinary(s.nextInt()));

//        fibonacci(s.nextInt());

//        System.out.println(isPalindrome(0));

//        System.out.println(reverse(10000));


        int[] arr = {2, 0, 1, 1, 3};
        System.out.println(duplicate(arr));


    }

}
