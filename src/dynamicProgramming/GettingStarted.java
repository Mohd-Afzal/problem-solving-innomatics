package dynamicProgramming;

import java.sql.SQLClientInfoException;

public class GettingStarted {

    private static int fibIterative(int n) {
        int[] fibArray = new int [n + 1];

        // Base Cases
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }

    private static int fibMemo(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (memo[n] != Integer.MIN_VALUE) {
            return memo[n];
        }

        int prevTermOne;
        if (memo[n - 1] != Integer.MIN_VALUE) {
            prevTermOne = memo[n - 1];
        } else {
            int ans = fibMemo(n - 1, memo);
            memo[n - 1] = ans;
            prevTermOne = ans;
        }

        int prevTermTwo;
        if (memo[n - 2] != Integer.MIN_VALUE) {
            prevTermTwo = memo[n - 2];
        } else {
            int ans = fibMemo(n - 2, memo);
            memo[n - 2] = ans;
            prevTermTwo = ans;
        }

        memo[n] = prevTermOne + prevTermTwo;

        return memo[n];
    }

    public static int fib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Integer.MIN_VALUE;
        }

        return fibMemo(n, memo);

//        if (n == 0 || n == 1) {
//            return n;
//        }
//
//        int prevTermOne = fib(n - 1);
//        int prevTermTwo = fib(n - 2);
//
//        int myTerm = prevTermOne + prevTermTwo;
//
//        return myTerm;
//        return fib(n-1) + fib(n - 2);
    }

    public static void main(String[] args) {
//        System.out.println(fib(55));
//        System.out.println(fibIterative(55));

        // Exception Handling
        int a = 10;
        int b = 0;
        int arr[] = {2, 3, 4, 5};
        try {
            for (int i = 0; i <= 4; i++) {
                System.out.println(arr[i]);
            }

            int div = a / b;
            System.out.println(div);
            //SQL Exception
            // Not going to be run post line 81
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Hey! There was an exception! Executing lines afterwards!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello World!");
        // Will be executed after line 81 as well coz we handled the exception using try catch!





    }
}
