### Linked list
```java
public class Example {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }
    
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;
        ListNode head = one;
        //  0 --> 1 --> 2

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
```
- https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

### Double linked list
- each node contains a pointer to the previous node and a pointer to the next node.
```java
public class Example {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode (int val) {
            this.val = val;
        }
    }

    public static void addToEnd(ListNode nodeToAdd) {
        nodeToAdd.next = tail;
        nodeToAdd.prev = tail.prev;
        tail.prev.next = nodeToAdd;
        tail.prev = nodeToAdd;
    }

    public static void removeFromEnd() {
        if (head.next == tail) {
            return;
        }

        ListNode nodeToRemove = tail.prev;
        nodeToRemove.prev.next = tail;
        tail.prev = nodeToRemove.prev;
    }

    public static void addToStart(ListNode nodeToAdd) {
        nodeToAdd.prev = head;
        nodeToAdd.next = head.next;
        head.next.prev = nodeToAdd;
        head.next = nodeToAdd;
    }

    public static void removeFromStart() {
        if (head.next == tail) {
            return;
        }

        ListNode nodeToRemove = head.next;
        nodeToRemove.next.prev = head;
        head.next = nodeToRemove.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
}
```

### Dummy pointer
- traverse using a "dummy" pointer and to keep head at the head.
```java
int getSum(ListNode head) {
    int ans = 0;
    ListNode dummy = head;
    while (dummy != null) {
        ans += dummy.val;
        dummy = dummy.next;
    }

    // same as before, but we still have a pointer at the head
    return ans;
}
```

### Fast and slow pointers
```
// head is the head node of a linked list
function fn(head):
    slow = head
    fast = head

    while fast and fast.next:
        Do something here
        slow = slow.next
        fast = fast.next.next
```
- Find the Middle of a Linked List
  - https://leetcode.com/problems/middle-of-the-linked-list/description/
  - https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
- Detect a Cycle in a Linked List
  - https://leetcode.com/problems/linked-list-cycle/description/
- Find the Nth Node from End
  - https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
  - https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

### Reverse linked list
```text
1 -> 2 -> 3 -> 4
4 -> 3 -> 2 -> 1
```
- O(n)
```java
ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextNode = curr.next; // first, make sure we don't lose the next node
        curr.next = prev;              // reverse the direction of the pointer
        prev = curr;                   // set the current node to prev for the next node
        curr = nextNode;               // move on
    }

    return prev;
}
```
- https://leetcode.com/problems/swap-nodes-in-pairs/description/
- https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/editorial/
- 