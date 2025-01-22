## String
- https://leetcode.com/problems/robot-bounded-in-circle/description/
  - +math
- https://leetcode.com/problems/reformat-date/description/
- https://leetcode.com/problems/word-pattern/description/
```java
public static void charArray(String str) {
  char[] chars = str.toCharArray();
  Arrays.sort(chars);
  String sortedstr = new String(chars);
}
```

### Subsequence
- a set of elements of an array/string that keeps the same relative order but doesn't need to be contiguous.
- `ace`is a subsequence of `abcde` while `aec` is not 
### Subarray / Substring
- a contiguous section of the array/string.
- For example, with the array `[1, 2, 3, 4]`, the subarrays (grouped by length) are:
  - `[1]`,`[2]`,`[3]`,`[4]`
  - `[1, 2]`,`[2, 3]`,`[3, 4]`
  - `[1, 2, 3]`,`[2, 3, 4]`
  - `[1, 2, 3, 4]`
- Number of subarrays: **right - left + 1**
### Subset
- any set of elements from the original array or string. The order doesn't matter and neither do the elements being beside each other.

### StringBuild
```java
public static void buildString(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 5; i++) {
        sb.append(arr[i]);
    }
    String s = sb.toString();
}
```
### Two Pointers
```java
// the same array
// O(n)
public static void twoPointer(int[] arr) {
    int left = 0;
    int right = arr.length-1;

    while (left<right) {
        // Do some more logic here
        //     1. left++
        //     2. right--
        left ++;
        right --;
    }
}
```
- https://leetcode.com/problems/3sum/description/
  - HashMap
  - Two pointers
- https://leetcode.com/problems/3sum-closest/description/
- https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
  - Slice window
  - has more algorithm ways to solve it
- https://leetcode.com/problems/sum-of-square-numbers/description/
  - Math.sqrt(c);
- https://leetcode.com/problems/next-greater-element-i/description/
- https://leetcode.com/problems/next-greater-element-iii/description/
  - https://www.youtube.com/watch?v=fOeD3CW2c7c
  - https://www.youtube.com/watch?v=quAS1iydq7U&t=2s
- https://leetcode.com/problems/container-with-most-water/description/
  - greedy
- https://leetcode.com/problems/merge-sorted-array/description

```java
// different arrays
// O(m+n)
public static void pointersTwoArray(int[] arr1, int[] arr2) {
    int i = 0;  // point to arr1
    int j = 0;  // point to arr2

    while (i<arr1.length && j<arr2.length) {
        // Do some more logic here
        // 1. i++
        // 2. j++
        i++;
        j++;
    }
    // make sure both iterables are exhausted
    while (i < arr1.length) {
        // Do some more logic here
        i++;
    }
    while (j < arr2.length) {
        // Do some logic here depending on the problem
        j++;
    }
}
```
- https://leetcode.com/problems/minimum-common-value/description/

### Slice Window
```java
public static void sliceWindow(int[] arr) {
    int left = 0;
    boolean WINDOW_IS_INVALID = false;
    for (int right = 0; right < arr.length; right++) {
        
        // Do some logic to "add" element at arr[right] to window

        while (WINDOW_IS_INVALID) {
            // Do some logic to "remove" element at arr[left] from window
            left++;
        }

        // Do some logic to update the answer
    }
}
```
```java
// Fixed Size Slice Window
public static void fixedSizeSliceWindow(int[] arr, int k) {
    //  some data to track the window
    int curr = 0;

    // build the first window
    for (int i = 0; i < k; i++) {
        // Do something with curr or other variables to build first window
    }

    // answer variable, probably equal to curr here depending on the problem
    int ans = 0;
    for (int i = k; i < arr.length; i++) {
        // Add arr[i] to window
        // Remove arr[i - k] from window
        // Update ans
    }

    return ans;
}
```
- https://leetcode.com/problems/subarray-product-less-than-k/description/
  - has other ways to do it
  - edge cases
- https://leetcode.com/problems/maximum-average-subarray-i/description/
- https://leetcode.com/problems/max-consecutive-ones-iii/description/
- https://leetcode.com/problems/k-radius-subarray-averages/description/
  - edge cases
  - prefix sum
- https://leetcode.com/problems/minimum-size-subarray-sum/description/
- https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
  - slice window + HashMap
- https://leetcode.com/problems/minimum-window-substring/description/
- https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/description/
- https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/description/
- https://leetcode.com/problems/find-and-replace-pattern/description/
- 

### Prefix Sum
```java
public static void prefix(int[] arr) {
    int[] prefix_arr = new int[nums.length];
    prefix_arr[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        prefix_arr[i] = nums[i] + prefix_arr[i - 1];
    }
}
```
- prefix[i] is the sum of all elements up to the index i (inclusive).
- allow us to find the sum of any subarray in O(1)
- https://leetcode.com/problems/number-of-ways-to-split-array/ (edge cases)
- https://leetcode.com/problems/running-sum-of-1d-array/description/
- https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/
- https://leetcode.com/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=prefix-sum
- 