package basics.loops;

import java.util.Scanner;

public class PatternTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nRows = s.nextInt();
//        int diff = 1;

        int currRow = 1;
        while (currRow <= nRows) {

            // Print Spaces
            int spaces = 1;
            while (spaces <= (nRows - currRow)) { // diff -> currRow
                System.out.print(" ");
                spaces += 1;
            }

            // Print stars
            int stars = 1;
            while (stars <= currRow) {
                System.out.print("*");
                stars += 1;
            }

            System.out.println();
//            diff += 1;
            currRow += 1;
        }
    }

}
