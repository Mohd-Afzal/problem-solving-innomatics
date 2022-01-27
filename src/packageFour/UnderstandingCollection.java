package packageFour;

import java.util.*;

class Decreasing implements Comparator<Integer> {
    @Override
    public int compare(Integer numOne, Integer numTwo) {
        if (numOne - numTwo < 0) {
            return 1;
        } else if (numOne - numTwo > 0) {
            return -1;
        }
        return 0;
    }
}

class Employee implements Comparable<Employee> {
    int priority;
    String name;
    long salary;
    int empId;

    public Employee(int priority, String name, long salary, int empId) {
        this.priority = priority;
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.priority - employee.priority < 0) {
            return 1;
        } else if (this.priority - employee.priority > 0) {
            return -1;
        }
        return 0;
    }

    //    public void display() {
//        System.out.println(this.empId + " " + this.name + " " + this.salary + " " + this.priority);
//    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                ", priority=" + priority +
                '}';
    }
}

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
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Decreasing()); // Max Heap
//        pq.add(50);
//        pq.add(10);
//        pq.add(30);
//        pq.add(20);
//        pq.add(40);

//        System.out.println(pq.peek());

//        pq.add("Orange"); // 1st element to be inserted -> 1st element to be deleted as well in case of FIFO
//        pq.add("Pineapple"); // 2nd element to be inserted -> 2nd element to be deleted as well in case of FIFO
//        pq.add("Apple"); // 3rd element to be inserted -> 3rd element to be deleted as well in case of FIFO
//        pq.add("Apple"); // 4th element to be inserted -> 4th element to be deleted as well in case of FIFO

//        System.out.println(pq.remove()); // Removes the current minimum
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.poll()); // Same as that of remove() but in this case if the PQ is empty, it returns NULL

//        int[] arr = {500, 2, 200, 100, 10, 8, 10, 3, 5, -10};
//        int k = 5;
//        ArrayList<Integer> kMinElements = getKMin(arr, k);
//        for (int element : kMinElements) {
//            System.out.print(element + " ");
//        }

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(50);
//        list.add(40);
//        list.add(1000);
//        list.add(20);
//        list.add(10);
//
//        for (Integer val : list) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//
//        // How to sort a collection?
//        Collections.sort(list, new Decreasing());
////        Collections.reverse(list);
//
//        for (Integer val : list) {
//            System.out.print(val + " ");
//         }

//        Employee employee = new Employee(10, "Afzal", 10000, 2894);
//        System.out.println(employee);
//        employee.display();

        PriorityQueue<Employee> pq = new PriorityQueue<>(); // default PQ - min PQ/heap
        pq.add(new Employee(100000, "Swanand", 40000, 2897));
        pq.add(new Employee(10000, "Swati", 30000, 2896));
        pq.add(new Employee(1000, "Subhash", 20000, 2895));
        pq.add(new Employee(100, "Afzal", 10000, 2894));

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

//        System.out.println("Hello World");
    }
}
