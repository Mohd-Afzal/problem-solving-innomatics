package dataStructures;

import java.util.Stack;

public class StackUse {

    public static void createFrequencyTable(String str, int[] frequency) {
        // Linear time
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String str = "aaaaaaabbccccccdefgh";
        // a = 7, b 2, c 6

        int[] frequency = new int[257];

        createFrequencyTable(str, frequency);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        }

//        StackNode<Integer> stack = new StackNode<>();
////        stack.top();
////        stack.pop();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);
//
//
////        int top = stack.pop();
////
////        System.out.println(stack.top()); // 30
////        System.out.println(top); // 40
//
//        while (! stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//
//
//        // Inbuilt Stack from the Collection framework
//        Stack<Integer> secondStack = new Stack<>();
//
//        secondStack.push(10);
//        secondStack.push(20);
//        secondStack.push(30);
//        secondStack.push(40);
//
//        while (!secondStack.empty()) {
//            System.out.println(secondStack.pop());
//        }


    }
}
