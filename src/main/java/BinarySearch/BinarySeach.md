- O(logn) 
- input is sorted

1. left = 0
2. right = arr.length-1
3. While left <= right:
   - mid = (left + right) // 2
   - If arr[mid] = x, then the element has been found, return
   - If arr[mid] > x, right = mid - 1
   - If arr[mid] < x, left = mid + 1
4. If not found, the left pointer will be at the index where x would need to be inserted to maintain arr being sorted.
- https://leetcode.com/problems/binary-search/description/
- https://leetcode.com/problems/search-insert-position/description/
- https://leetcode.com/problems/search-a-2d-matrix/description/
  - right points to the possible row
  - matrix
- 
```java
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2; // avoid overflow
        if (arr[mid] == target) {
            // do something
            return mid;
        }
        if (arr[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    // target is not in arr, but left is at the insertion point
    return left;
}
```
- https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/
- https://leetcode.com/problems/sqrtx/description/
- 
### Duplicate elements
- the left-most index
```java
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] >= target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    return left;
}
```
- the right-most index
```java
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] > target) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    return left;
}
```