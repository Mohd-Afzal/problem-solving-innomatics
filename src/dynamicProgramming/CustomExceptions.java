package dynamicProgramming;

class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "QueueEmptyException";
    }
}

class QueueImplementation {
    private int[] queue;
    private int start;

    public QueueImplementation() {
        this.queue = new int[10];
        this.start = 0;
    }

    public int dequeue() throws QueueEmptyException {
        if (this.start == 0 || this.queue.length == 0) {
            // the queue is empty
            // throw an exception
            throw new QueueEmptyException();
        }

        int val = this.queue[this.start];
        this.start -= 1;
        return val;
    }

}

public class CustomExceptions {

    public static void main(String[] args) throws QueueEmptyException {
        QueueImplementation queue = new QueueImplementation();
//        try {
//            queue.dequeue();
//        } catch (QueueEmptyException q) {
//            System.out.println(q);
//        }

        queue.dequeue();
    }
}
