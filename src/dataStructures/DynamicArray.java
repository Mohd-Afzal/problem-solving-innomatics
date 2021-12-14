package dataStructures;

public class DynamicArray {
    private int[] arr;
    private int size;
    private int next;
    private int capacity;

    public DynamicArray() {
        this.capacity = 3;
        this.arr = new int[capacity];
        this.size = 0;
        this.next = 0;
    }

    // O(arr.length)
    private void resize() {
        int[] temp = this.arr;

        this.capacity *= 2;
        this.arr = new int[this.capacity]; // this.arr.length

        for (int i = 0; i < temp.length; i++) {
            this.arr[i] = temp[i];
        }
    }

    public void add(int data) {
        if (this.getSize() == this.capacity) {
            this.resize();
        }

        this.arr[this.next] = data;
        this.next += 1;
        this.size += 1;
    }

    public int get(int index) {
        if (index >= this.size) {
            // Throw an EXCEPTION
            System.out.println("Array Index is not in range! Please specify a valid index");
            return Integer.MIN_VALUE;
        }

        int data = this.arr[index];
        return data;
    }

    // getters and setters
    public int getSize() {
//        if (this.next == 0) {
//            return  0;
//        }
//        int size = this.next + 1;
//        return  size;

        return this.size;
    }

    public int delete() {

        // When the array is empty
//        if (this.next == 0) {}
//        if (this.size == 0) {}

        if (this.getSize() == 0) {
            // Throw an EXCEPTION
            System.out.println("Array is empty! You can not delete.");
            return Integer.MIN_VALUE;
        }

        int removedData = this.arr[this.next - 1];
        this.arr[this.next - 1] = Integer.MIN_VALUE;
        this.next -= 1;
        this.size -= 1;

        return removedData;
    }

    // getters and setters
    public int getCapacity() {
        return this.capacity;
    }


}
