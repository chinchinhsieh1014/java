package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // add
        // offer
        q.add(1);
        q.add(3);
        q.add(5);
        System.out.println("Queue: " + q);

        // remove
        // poll
        q.poll();
        System.out.println("Queue: " + q);

        // peek
        System.out.println("Head of the queue: " + q.peek());

        // isEmpty
        System.out.println("Is q empty: " + q.isEmpty());

        // size
        System.out.println("q size: " + q.size());
    }
}
