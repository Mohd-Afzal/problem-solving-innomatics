package basics.functions;

import java.util.Scanner;

public class LearningFunctions {

    // where? Inside class or outside of the main function

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }


    public static int nCr (int n, int r) {

        // calculate factorial value

        // Calculaating nFact
//        int nFact = 1;
//        for (int i = 1; i <= n; i++) {
//            nFact *= i;
//        }
        int nFact = factorial(n);


        // calculating rFact
//        int rFact = 1;
//        for (int i = 1; i <= r; i++) {
//            rFact *= i;
//        }

        int rFact = factorial(r);

        // calculating nminurFact
//        int nminurFact = 1;
//        for (int i = 1; i <= (n-r); i++) {
//            nminurFact *= i;
//        }

        int nminurFact = factorial(n-r);

        int ans = nFact / (nminurFact) * rFact;
        return ans;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int r = s.nextInt();

        int ans = nCr(n, r);
        System.out.println(ans);

    }

}
