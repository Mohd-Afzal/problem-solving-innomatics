package dataStructures;

public class StackNode<T> {
    private LinkedListNode<T> head;
    private int size;

    public StackNode () {
        this.head = null;
        this.size = 0;
    }

    public void push(T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        newNode.next = this.head;
        this.head = newNode;

        this.size += 1;
    }

    public T pop() {
//        if (this.isEmpty) { your code goes here }
        if (this.head == null) {
            // Throw an Exception - UnderflowException
            System.out.println("The Stack is Empty!");
            return null;
        }

        T data = this.head.data;
        this.head = this.head.next;

        return data;
    }

    public T top() {
        if (this.isEmpty()) {
            // Throw an Exception - UnderflowException
            System.out.println("The Stack is Empty!");
            return null;
        }

        return this.head.data;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }

        return false;
    }

    public int getSize() {
        return this.size;
    }

}
