package basics.controlStatementsAndOperators;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
//        Scan 3 integers and find the 2 largest ones ! -> Figure out the smallest

        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();


        /*

                In order for num2 to be the smallest (mst hold 2 conditions strictly)
                    1. num2 < num1
                    2. num2 < num3

                In order for num1 to be the smallest (mst hold 2 conditions strictly)
                    1. num1 < num2
                    2. num1 < num3

                In order for num3 to be the smallest (mst hold 2 conditions strictly)
                    1. num3 < num1
                    2. num3 < num2

        */

        /*if (num1 < num2) {
//            Can I say num1 is the smallest at this point? - No. Coz we did not look at the other options yet. That is num3.
            if (num1 < num3) {
                if (num1 < num4) {
                    num1 is smallest
                }
             }

        }*/


        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("Hey, user! \n" + num1 + " is the smallest");
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println(num2 + " is the smallest");
        } else {
            System.out.println(num3 + " is the smallest");
        }

    }

}
