package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // add
        maxHeap.add(6);
        maxHeap.add(9);
        maxHeap.add(5);
        maxHeap.add(64);
        maxHeap.add(6);

        // retrieve
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");

        }
    }
}
