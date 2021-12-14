package basics.loops;

public class Loops {
    public static void main(String[] args) {

//        Nested Loops
        int i = 1;
        while (i <= 2) {

            //Inner Loop
            int j = 1; // Counter initialization for inner loop
            while (j <= 3) {
                System.out.print(j);
                j = j + 1; // Manipulation of counter for the inner loops
            }

            System.out.println();
            i = i + 1;
        }

        // Row
        for (int x = 1; x <= 2; x = x + 1) {

            //Column
            for (int y = 1; y <= 3; y = y + 1) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
