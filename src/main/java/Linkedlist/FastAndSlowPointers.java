package Linkedlist;

import org.w3c.dom.NodeList;

public class FastAndSlowPointers {

    public static class NodeList {
        int val;
        NodeList next;
        NodeList (int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // create a linked list
        NodeList one = new NodeList(1);
        NodeList two = new NodeList(2);
        NodeList three = new NodeList(3);
        NodeList four = new NodeList(4);
        NodeList five = new NodeList(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        NodeList head = one;
        System.out.println("Result: "+middleVal(head));

        int k = 2;
        System.out.println("Result: "+kthNodeFromTheEnd(head, k).val);

    }

    /*
    Example 1: Given the head of a linked list with an odd number of nodes head,
               return the value of the node in the middle.

               For example, given a linked list that represents 1 -> 2 -> 3 -> 4 -> 5, return 3.
     */
    public static int middleVal(NodeList head) {
        NodeList slow = head;
        NodeList fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    /*
    Example 3: Given the head of a linked list and an integer k, return the kth node from the end.

    For example, given the linked list that represents 1 -> 2 -> 3 -> 4 -> 5 and k = 2,
                 return the node with value 4, as it is the 2nd node from the end.
     */
    public static NodeList kthNodeFromTheEnd(NodeList head, int k) {
        NodeList slow = head;
        NodeList fast = head;
        while(k>0) {
            fast = fast.next;
            k--;
        }
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
