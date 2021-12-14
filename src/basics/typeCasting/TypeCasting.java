package basics.typeCasting;

public class TypeCasting {

    public static void main(String[] args) {

        /*
        * Primitive Data Types
        *   1. Int
        *   2. byte
        *   3. short
        *   4. long
        *   5. float
        *   6. double
        *   7. boolean
        *   8. char
        * */

//        byte b = 127; //-128 to 127
//        short s = -32768;
////        int i = 2147483648; out of integer's limit
//
//        float f = 345.78F;
//        double d = 45678.67;

//        System.out.println(s);


//        Type casting

        double d = 34;
        int n = (int)d; // Explicit typecasting
        float f = (float)345.78; // Explicit typecasting

        long p = 23456789035678L; // Explicit typecasting
        int b = (int)p; // Explicit typecasting

        char ch = (char) 65; // Explicit typecasting

        short a = 10;
        int x = a; // Implicit typecasting
        long y = a; // Implicit typecasting

        long z = 78; // Implicit typecasting

        System.out.println(p + " " + b);

    }

}
