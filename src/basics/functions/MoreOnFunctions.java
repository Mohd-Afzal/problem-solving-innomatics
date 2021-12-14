package basics.functions;

import java.util.Scanner;

public class MoreOnFunctions {
// Scope of a variable

    public static void increment(int a) {
        a = a + 1;
        System.out.println("In Increment's Scope: " + a);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); // 20

        System.out.println(a); // 20

        increment(a);

        System.out.println("In Main's Scope: " + a);


        {
            int b = 20;
            System.out.println(b);
            System.out.println("this is a block inside main block");
        }

//        System.out.println(a + " " + b);

    }

}
