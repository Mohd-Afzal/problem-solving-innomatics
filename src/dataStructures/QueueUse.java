package dataStructures;

public class QueueUse {

    public static void main(String[] args) {
        QueueNode<Integer> queue = new QueueNode<>();

//        Integer data = queue.dequeue();
//        System.out.println(data);

        System.out.println(queue.isEmpty());

        queue.enqueue(10);

//        System.out.println(queue.isEmpty());
//
//        Integer data = queue.dequeue();
//        System.out.println(data);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

    }
}
