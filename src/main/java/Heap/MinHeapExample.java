package Heap;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // add
        minHeap.add(6);
        minHeap.add(9);
        minHeap.add(5);
        minHeap.add(64);
        minHeap.add(6);

        // retrieve
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
