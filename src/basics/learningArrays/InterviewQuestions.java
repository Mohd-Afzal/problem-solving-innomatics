package basics.learningArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions {

    private static Scanner s = new Scanner(System.in);

    // Taking Array Input
    public static int[] inputArray() {
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static int pairSum(int[] inputArray, int sum) {
        // Assuming array is always sorted

        int startIndex = 0;
        int endIndex = inputArray.length - 1;

        int totalPairs = 0;

        while (startIndex < endIndex) {

            int currentSum = inputArray[startIndex] + inputArray[endIndex];
            int currentPairs = 0;

            if (currentSum < sum) {
                startIndex += 1; // moving to the next larger weight from the left
            } else if (currentSum > sum) {
                endIndex -= 1; // moving to the next smaller weight from the last
            } else { // currentSum == sum

                // Duplicates
                if (inputArray[startIndex] != inputArray[endIndex]) {
                    int leftCount = 1;
                    int rightCount = 1;

                    int leftIndex = startIndex + 1;
                    int rightIndex = endIndex - 1;

                    // move left and count the duplicates
                    while (leftIndex < rightIndex && inputArray[startIndex] == inputArray[leftIndex]) {
                        leftCount += 1;
                        leftIndex += 1;
                    }

                    //move right and count the duplicates
                    while (rightIndex > startIndex && inputArray[endIndex] == inputArray[rightIndex]) {
                        rightCount += 1;
                        rightIndex -= 1;
                    }

                    startIndex = leftIndex;
                    endIndex = rightIndex;

                    currentPairs = leftCount * rightCount;

                } else {
                    // Duplicates but all the values are same

                    int totalValues = (endIndex - startIndex) + 1;
                    currentPairs = (totalValues * (totalValues - 1)) / 2;

                    startIndex = endIndex;
                }

                totalPairs += currentPairs;
            }

        }

        return totalPairs;
    }

    public static int binarySearch(int[] arr, int target) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {

            int mid = (startIndex + endIndex) / 2;

            if (target < arr[mid]) {
                endIndex = mid - 1;
            } else if (target > arr[mid]) {
                startIndex = mid + 1;
            } else { // arr[mid] == target
                return mid;
            }
        }

        return -1;
    }
    
    public static void bubbleSort(int[] arr) {

        int iteration = 0;

        while (iteration < arr.length) {

            // takes one element to the correct position - largest
            int currentIndex = 0;

            while (currentIndex < arr.length - 1) {

                int nextIndex = currentIndex + 1;

                if (arr[currentIndex] > arr[nextIndex]) {
                    int temp = arr[nextIndex];
                    arr[nextIndex] = arr[currentIndex];
                    arr[currentIndex] = temp;
                }

                currentIndex += 1;
            }

            iteration += 1;
        }

    }

    public static boolean isPalindrome(String word) {
        int startIndex = 0;
        int endIndex  = word.length() - 1;

        while (startIndex <= endIndex) {
            if (word.charAt(startIndex) != word.charAt(endIndex)) {
                return false;
            }
            startIndex += 1;
            endIndex -= 1;
        }
        return true;
    }

    public static void printSubstring(String word) {
        int start = 0;
        while (start < word.length()) {

            int end = start;
            String prevSubString = "";
            while (end < word.length()) {
                String currSubString = prevSubString + word.charAt(end);
                System.out.println(currSubString);
                prevSubString = currSubString;

                end += 1;
            }
            start += 1;
        }

    }

    public static String[] returnSubString(String word) {
        // todo
        return null;
    }


    public static String[] returnSubString(int a) {
        return null;
    }

    // Print int array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr = inputArray();
//        System.out.println(pairSum(arr, s.nextInt()));
//        System.out.println(binarySearch(arr, s.nextInt()));

//        bubbleSort(arr);
//        printArray(arr);


        /* Strings */

        String word = s.next();
//        System.out.println(word.charAt(0)); // word[0]
//        System.out.println(isPalindrome(word));

        printSubstring(word);




    }
}
