package packageFour;

import java.lang.reflect.Array;
import java.util.*;

public class UnderstandingCollection {

    public static ArrayList<Integer> getKMin(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= k; i++) {
            list.add(pq.remove());
        }

        return list;
    }


    public static void main(String[] args) {
//        Collection<Integer> list = new ArrayList<>();

//        Collection<Integer> pq = new PriorityQueue<>();
//        Queue<Integer> pq = new PriorityQueue<>();
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Default -> Min Heap

//        pq.add("Orange"); // 1st element to be inserted -> 1st element to be deleted as well in case of FIFO
//        pq.add("Pineapple"); // 2nd element to be inserted -> 2nd element to be deleted as well in case of FIFO
//        pq.add("Apple"); // 3rd element to be inserted -> 3rd element to be deleted as well in case of FIFO
//        pq.add("Apple"); // 4th element to be inserted -> 4th element to be deleted as well in case of FIFO

//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());

        int[] arr = {500, 2, 200, 100, 10, 8, 10, 3, 5, -10};
        int k = 5;

        ArrayList<Integer> kMinElements = getKMin(arr, k);

        for (int element : kMinElements) {
            System.out.print(element + " ");
        }



    }
}
