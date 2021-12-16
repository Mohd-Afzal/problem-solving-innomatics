package dataStructures;

public class QueueNode<T> {
    private LinkedListNode<T> head; // front
    private LinkedListNode<T> tail; // back
    private int size;

    public QueueNode() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert -> enqueue
    public void enqueue(T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);

        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
            this.size += 1;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
        this.size += 1;
        return;
    }

    // remove -> dequeue
    public T dequeue() {
        if (this.isEmpty()) {
            // Throw an Exception
            System.out.println("Queue is Empty!");
            return null;
        }

//        if (this.getSize() == 1) -> there is just one element in the queue
        if (this.head == this.tail && !this.isEmpty()) {
            T data = this.head.data;
            this.head = null;
            this.tail = null;
            this.size -= 1;
            return data;
        }

        T data = this.head.data;
        this.head = this.head.next;
        this.size -= 1;
        return data;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.head == null && this.tail == null) {
            return true;
        }

        return false;
    }

}
