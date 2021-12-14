package basics.learningArrays;

import java.util.Scanner;

public class MultiDimentionalArray {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

//        int[][] arr = new int[3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//            int[] innerArray = arr[i];
//            for (int j = 0; j < innerArray.length; j++) {
////                System.out.print(innerArray[j] + " ");
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] jaggedArray = new int[3][];
//
//        for (int i = 0; i < jaggedArray.length; i++) {
//            int size = s.nextInt();
//            jaggedArray[i] = new int[size];
//        }
//
//        for (int i = 0; i < jaggedArray.length; i++) {
//            for (int j = 0; j < jaggedArray[i].length; j++) {
//                System.out.print(jaggedArray[i][j] + " ");
//            }
//            System.out.println();
//        }


        int[][] matrix = {
                {1, 2, 3},
                {2},
                {5, 6, 7, 8, 10}
        };

        System.out.println(matrix.length);
        System.out.println(matrix[1].length);

    }

}
