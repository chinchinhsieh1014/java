### HashMap
- Keys are unique; duplicate keys overwrite the existing value.
- Allows one null key and multiple null values. 
- Unordered; no guaranteed iteration order.
- https://leetcode.com/problems/two-sum/description/
- https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/
- https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/description/
- https://leetcode.com/problems/equal-row-and-column-pairs/description/
- https://leetcode.com/problems/ransom-note/description/
- https://leetcode.com/problems/isomorphic-strings/description/
  - map + set
- https://leetcode.com/problems/first-unique-character-in-a-string/description/
- 
### HashSet
- Stores unique elements (no duplicates).
- Allows one null value. 
- Unordered; no guaranteed iteration order.
- https://leetcode.com/problems/first-letter-to-appear-twice/description/
- https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
- https://leetcode.com/problems/missing-number/description/
  - Sort
- https://leetcode.com/problems/counting-elements/description/
  - Sort

### Collision
- different values have the same key
- fix
  - chaining: value is a linked list

### Check for existence
- O(1)

```java
public static void checkExistence(int[] arr) {
  // hashmap
  HashMap<Integer, Integer> map = new HashMap<>();
  map.containsKey(key);

  // hashset
  HashSet<Integer> set = new HashSet<>();
  set.contains(key);
}
```

### Counting
- track the frequency of things
```java
public static void count(int[] arr) {
  // hashmap
  HashMap<Integer, Integer> map = new HashMap<>();
  for (int i=0; i<arr.length; i++) {
    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
  }
}
```
- https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/
- https://leetcode.com/problems/intersection-of-multiple-arrays/description/
- https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/
- https://leetcode.com/problems/largest-unique-number/description/
- https://leetcode.com/problems/maximum-number-of-balloons/
- https://leetcode.com/problems/group-anagrams/description/
  - String
- https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description
- With Prefix
  - https://leetcode.com/problems/subarray-sum-equals-k/description/
  - Subarray Sum Equals K
    - curr=sum(nums[0..i])
    - want to find: 
      - sum(nums[j..i])=k
      - sum(nums[0..i])−sum(nums[0..j-1])=k
      - curr-sum(nums[0..j-1])=k
    - if curr-k in hashMap, there is at least one subarray ending at i with a sum of k.
  - https://leetcode.com/problems/count-number-of-nice-subarrays/description/
  - https://leetcode.com/problems/contiguous-array/description/
