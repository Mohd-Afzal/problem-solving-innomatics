public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // this is a single line comment

        /*
        * This is a multine comment
        *  */

        //DataTypes
        int container = 20; //Identifier
        System.out.println(container);

        container = 50;
        System.out.println(container);

        double decimalNumber = 45678.67;
        System.out.println(decimalNumber);

        char a = 't';
        a = 'p';

        System.out.println(a);

        String name = "Afzal";
        System.out.println(name);


        //Working with Integers
        int x = 10; // Assignment operator
        int y = 20;

        int p = x + y;
        System.out.println(p);

        p = y / 11;  // computes the quotient 20 / 11
        p = y % 11;  // spits out the remainder
        // multiplication *
        p = x * y;

        System.out.println(p);


        //Decision Making - Control Statements

//        if x > 10 - I want to print "X is greater than 10", else I would print "X is less than or equal to 10"

        if (x > 10) {
            System.out.println("X is greater than 10");
        } else {
            System.out.println("X is less than or equal to 10");
        }

        System.out.println("I am line 63 irrespective of what I have executed on the above statements");


        // 55 56 57(true) 58 62 63
        // 55 56 57(false) 62 63

        /*
        *   Assignment
        *           1. Figure out the Primitive DataTypes (byte, short, long, boolean, float, literals)
        *           2. Figure out a few Non-Primitive DataTypes (Arrays, Interface, Objects)
        *           3. Operators
        *                   1. Assignment Operator (=)
        *                   2. Logical Operators (!=, ==, &&, ||)
        *                   3. Relational Operators (<, >,)
        *                   4. Arithematic Operators
        *
        * */

    }
}
