package basics.learningArrays;

import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int num) {
        int factor = 2;
        while (factor < num) {
            if (num % factor == 0) {
                //Completely divides and factor is a "factor" of "num"
                return false;
            }
            factor += 1;
        }

        // It is prime
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[s.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        // Given a number figure out whether or not it is a prime?
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
