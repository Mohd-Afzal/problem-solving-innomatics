package basics.loops;

import java.util.Scanner;

public class PatternOne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nRows = s.nextInt();

        // Printing the Rows
        int currRow = 1;
        while (currRow <= nRows) {

            // Printing the column values
            int currCol = 1;
            int toPrint = 65; // Do I really need this?
            while (currCol <= currRow) {
                System.out.print((char)toPrint);
                toPrint += 1;
                currCol += 1;
            }

            System.out.println();
            currRow += 1;
        }
    }
}
