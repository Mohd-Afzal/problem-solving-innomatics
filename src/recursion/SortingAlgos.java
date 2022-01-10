package recursion;

import java.util.Arrays;

public class SortingAlgos {

    public static int[] mergeSortedArrays(int[] first, int[] second) {
        int[] output = new int[first.length + second.length];

        int firstIndex = 0;
        int secondIndex = 0;
        int outputIndex = 0;

        while(firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                output[outputIndex] = first[firstIndex];
                outputIndex++;
                firstIndex++;
            } else if (second[secondIndex] < first[firstIndex]) {
                output[outputIndex] = second[secondIndex];
                secondIndex++;
                outputIndex++;
            } else {
                // Both the values are equal
                output[outputIndex] = first[firstIndex];
                outputIndex++;
                output[outputIndex] = second[secondIndex];
                outputIndex++;

                firstIndex++; secondIndex++;
            }
        }

        while (firstIndex < first.length) {
            output[outputIndex] = first[firstIndex];
            outputIndex ++;
            firstIndex ++;
        }

        while (secondIndex < second.length) {
            output[outputIndex] = second[secondIndex];
            outputIndex ++;
            secondIndex ++;
        }

        return output;
    }

    public static void mergeSortedArraysRec(int[] first, int[] second, int[] arr) {
        int firstIndex = 0;
        int secondIndex = 0;
        int outputIndex = 0; // for arr

        while(firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                arr[outputIndex] = first[firstIndex];
                outputIndex++;
                firstIndex++;
            } else if (second[secondIndex] < first[firstIndex]) {
                arr[outputIndex] = second[secondIndex];
                secondIndex++;
                outputIndex++;
            } else {
                // Both the values are equal
                arr[outputIndex] = first[firstIndex];
                outputIndex++;
                arr[outputIndex] = second[secondIndex];
                outputIndex++;

                firstIndex++; secondIndex++;
            }
        }

        while (firstIndex < first.length) {
            arr[outputIndex] = first[firstIndex];
            outputIndex ++;
            firstIndex ++;
        }

        while (secondIndex < second.length) {
            arr[outputIndex] = second[secondIndex];
            outputIndex ++;
            secondIndex ++;
        }
    }

    public static void mergeSort(int[] arr) {
        // Special Case
        if (arr.length == 0) {
            return;
        }

        // Base Case
        if (arr.length == 1) {
            return;
        }

        int firstHalfLength = arr.length / 2;
        int secondHalfLength = arr.length - firstHalfLength;

        int firstHalf[] = new int[firstHalfLength];
        int secondHalf[] = new int[secondHalfLength];

        int k = 0; // to traverse over the input array(arr)
        for (int i = 0; i < firstHalfLength; i++) {
            firstHalf[i] = arr[k];
            k++;
        }

        for (int i = 0; i < secondHalfLength; i++) {
            secondHalf[i] = arr[k];
            k++;
        }

        // Induction Hypothesis
        mergeSort(firstHalf);
        mergeSort(secondHalf);

        // Induction step
        mergeSortedArraysRec(firstHalf, secondHalf, arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] first = {5, 10, 20};
        int[] second = {2, 7, 9, 15, 21, 100, 200, 300};

        int[] arr = {100, 5, -10, 20, -5, 8, -20, 30, 90, -100};

//        printArray(mergeSortedArrays(first, second));

//        Arrays.sort(arr); // nlogn
        mergeSort(arr);
        printArray(arr);
    }
}
