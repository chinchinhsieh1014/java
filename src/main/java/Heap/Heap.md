- Priority queue
- Add an element in O(logn)
- Remove the minimum(maximum) element in O(logn)
- Find the minimum(maximum) element in O(1)
- Binary + Complete tree
- If a node is at index i, then its children are at indices 2i + 1 and 2i + 2.
- for repeatedly finding the maximum or minimum element.

### Min heap
- The smallest element in the tree is the root
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
```
- https://leetcode.com/problems/high-five/description/
  - hash map
- https://leetcode.com/problems/longest-subsequence-with-limited-sum/
- 
### Max heap
- The biggest element in the tree is the root
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```
- https://leetcode.com/problems/last-stone-weight/description/
- https://leetcode.com/problems/minimum-operations-to-halve-array-sum/description/
- https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/
  - num-num/2 (9-4=5)
- https://leetcode.com/problems/minimum-cost-to-connect-sticks/description/

### Top k
- sort the input and return top k -> O(n⋅logn)
- heap -> O(n⋅logk)
- k largest -> minheap
- https://leetcode.com/problems/top-k-frequent-elements/description/
  - + hashMap frequency
- https://leetcode.com/problems/find-k-closest-elements/description/
  - comparator
- https://leetcode.com/problems/kth-largest-element-in-an-array/description/
- https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
- https://leetcode.com/problems/k-closest-points-to-origin/description/
  - Double.Compare