package basics.learningArrays;

import java.util.Scanner;

public class FehToCel {

    public static int fahrenheitToCelcius(int feh) {
        // Cel = (F − 32) * 5/9
        int partOne = feh - 32;
        double secondPart = (double)5 / 9;
        return ((int)(partOne * secondPart));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int start = s.nextInt();
        int end = s.nextInt();
        int jump = s.nextInt();

        while (start <= end) {
            int cel =  fahrenheitToCelcius(start);
            System.out.println(start + "\t" + cel);
            start += jump;
        }

    }
}
