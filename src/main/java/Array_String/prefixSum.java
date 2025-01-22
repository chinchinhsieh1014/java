package Array_String;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 6, 3, 2, 7, 2};
        int[][] queries = new int[][] {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;
        System.out.println("result: " + Arrays.toString(isInLimit(arr1, queries, limit)));

    }

    /*
    Example 1: Given an integer array nums,
               an array queries where queries[i] = [x, y] and an integer limit,
               return a boolean array that represents the answer to each query.
               A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.

                For example, given nums = [1, 6, 3, 2, 7, 2],
                             queries = [[0, 3], [2, 5], [2, 4]],
                             and limit = 13, the answer is [true, false, true].
                             For each query, the subarray sums are [12, 14, 12].
                             [1, 7, 10, 12, 19, 21]
     */
    public static boolean[] isInLimit(int[] nums, int[][] queries, int limit) {
        boolean[] ans = new boolean[queries.length];
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        // takes O(n) to build the prefix sum array
        for (int i=1; i<nums.length; i++) {
            prefix[i] = prefix[i-1]+nums[i];
        }
        // takes O(m) to build the ans array
        for (int i=0; i<queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int q = 0;
            if (left==0) {
                q = prefix[right];
            } else {
                q = prefix[right]-prefix[left-1];
            }
            ans[i] = q < limit;
        }
        return ans;
    }
}
