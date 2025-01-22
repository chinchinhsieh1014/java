package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // small > big

        // add
        pq.add(50);
        pq.add(10);
        pq.add(40);
        System.out.println("Priority Queue: " + pq);

        // remove
        pq.poll();
        System.out.println("Priority Queue: " + pq);

    }
}
