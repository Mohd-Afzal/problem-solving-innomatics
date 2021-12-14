package dataStructures;

import java.util.ArrayList;

public class DynamicArrayUse {

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        arr.add(50);
//
//        for (int i = 0; i < arr.getSize(); i++) {
//            System.out.print(arr.get(i) + " ");
//        }

//        System.out.println(arr.getSize());
//        arr.size = 10;
//        System.out.println(arr.getSize());
//        arr.arr = new int[10000];


        // Integer, Float, Double, Short, Boolean -> Wrapper Classes
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
