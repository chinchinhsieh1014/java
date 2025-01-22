package Linkedlist;
import javax.annotation.processing.SupportedSourceVersion;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }

    // add a node
    public static void addNode(ListNode prevNode, ListNode nodeToAdd) {
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd;
    }
    // delete a node
    public static void deleteNode(ListNode preNode) {
        preNode.next = preNode.next.next;
    }

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // add()
        fruits.add(0, "apple");
        fruits.add("orange");
        fruits.add("lime");
        fruits.addFirst("banana");
        fruits.addLast("strawberry");
        System.out.println(fruits);

        // get(index)
        String firstFruit = fruits.get(0);
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());

        // set(index, value)
        fruits.set(0, "pineapple");
        System.out.println(fruits);

        // remove
        fruits.remove(0);
        fruits.remove("banana");
        fruits.removeFirst();
        fruits.removeLast();

        // size
        int size = fruits.size();
        System.out.println(size);

        // for
        for(int i = 0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        ListIterator<String> iterator = fruits.listIterator(0);
        while (iterator.hasNext()) {
            var fruit = iterator.next();
            System.out.println(fruit);
        }

        // contains
        boolean hasCherry = fruits.contains("cherry");

        // clear
        fruits.clear();

        // use ListNode
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode head = one;
        one.next = two;
        two.next = three;
        while (head!= null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
