package dataStructures;

import java.util.LinkedList;
import java.util.Scanner;

class Entities<T> {
    LinkedListNode<T> head;
    LinkedListNode<T> tail;
}

public class UsingLinkedList {

    final static Scanner s = new Scanner(System.in);

    // Big O of getLinkedList - O(n squared) -> O(n)
    public static LinkedListNode<Integer> getLinkedList() {

        LinkedListNode<Integer> head = null; // Empty List
        LinkedListNode<Integer> tail = null; // Empty List

        int data = s.nextInt();

        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);

            // Two scenarios - newNode would become head itself or will not
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode; // tail = tail.next

//                // List already exists and I want to add the newNode to the end of the list
//                LinkedListNode temp = head;
//                while (temp.next != null) {
//                    temp = temp.next; // moving in the forward direction
//                }
//                temp.next = newNode; // at the last node/tail
            }

            data = s.nextInt();
        }

        return head;
    }

    // Big O of printLinkedList - O(n)
    public static void printLinkedList(LinkedListNode<Integer> head) {
        // I have the access to the beginning of the list
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
        // I dont!
    }

    public static int length(LinkedListNode<Integer> head){
        int len = 0;

        while (head != null) {
            len += 1;
            head = head.next;
        }

        return len;
    }

    // Print LL in reverse
    public static  void printReverse(LinkedListNode<Integer> head) {
        // Base Case
        if (head == null) {
            return;
        }

        // Hypothesis
        printReverse(head.next);

        //induction step
        System.out.print(head.data + " ");
    }

    // Reverse the Linked List - O(n squared)
    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {

        // Base Case/Condition
        if (head == null || head.next == null) {
            return head;
        }

        // Induction Hypothesis
        LinkedListNode<Integer> newHead = reverseLL(head.next);

        // Induction Step
        LinkedListNode<Integer> temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        head.next = null;

        return newHead;
    }

    // Reverse the Linked List - O(n)
    public static Entities<Integer> reverseLLModified(LinkedListNode<Integer> head) {
        // Base Case/condition
        if (head == null || head.next == null) {
            Entities<Integer> entities = new Entities<>();
            entities.head = head;
            entities.tail = head;

            return  entities;
        }

        // Hypothesis
        Entities<Integer> entities = reverseLLModified(head.next);

        // Induction Step
        entities.tail.next = head;
        head.next = null;
        entities.tail = head; // entities.tail = entities.tail.next

        return entities;

    }

    public static void main(String[] args) {
//        LinkedListNode newNode1 = new LinkedListNode(10);
//        LinkedListNode newNode2 = new LinkedListNode(20);
//        LinkedListNode newNode3 = new LinkedListNode(30);
//        LinkedListNode newNode4 = new LinkedListNode(40);
//
//        // nodeNode1 -> newNode2
//        newNode1.next = newNode2;
//        newNode2.next = newNode3;
//        newNode3.next = newNode4;
//
//        System.out.println(newNode1.data); // newNode1
//        System.out.println(newNode1.next.data); // newNode2
//        System.out.println(newNode1.next.next.data); // newNode3
//        System.out.println(newNode1.next.next.next.data); //newNode4
//        System.out.println(newNode1.next.next.next.next.data); //newNode4.next -> null.data


//        Creating Linked List Nodes using generics

//        LinkedListNode<Integer> newNode = new LinkedListNode<>(10);
//        LinkedListNode<Double> node = new LinkedListNode<>(10.56);
//        LinkedListNode<Character> charnode = new LinkedListNode<>('A');


//        LinkedListNode<Integer> head = getLinkedList();
//
////        LinkedListNode<Integer> newHead = reverseLL(head);
//        Entities<Integer> entities = reverseLLModified(head);
//        printLinkedList(entities.head);


        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // 10 20 30 40
        System.out.println(list.peek());

        int num = list.poll();
        System.out.println(num);
        System.out.println(list.peek());

    }
}
