package Array_String;

public class sliceWindow {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k1 = 8;
        System.out.println("result: " + longestSumKSubarray(arr1, k1));

        String s = "1101100111";
        System.out.println("result: " + longestOneSubarray(s));

        int[] arr2 = new int[] {3, -1, 4, 12, -8, 5, 6};
        int k2 = 4;
        System.out.println("result: " + largestSumKSubarray(arr2, k2));

    }

    /*
    Example 1: Given an array of positive integers nums and an integer k,
               find the length of the longest subarray whose sum is less than or equal to k.
     */
    public static int longestSumKSubarray(int[] arr, int k) {
        int ans = 0;
        int left = 0;
        int curr = 0;
        for (int right=0; right<arr.length; right++) {
            curr += arr[right];
            while (curr>k) {
                curr -= arr[left];
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }

    /*
    Example 2: You are given a binary string s (a string containing only "0" and "1").
               You may choose up to one "0" and flip it to a "1".
               What is the length of the longest substring achievable that contains only "1"?
     */
    public static int longestOneSubarray(String s) {
        int ans = 0;
        int left = 0;
        int flip = -1;
        for (int right=0; right<s.length(); right++) {
            if (s.charAt(right)=='0') {
                if (flip!=-1) {
                    left = flip+1;
                }
                flip = right;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }

    /*
    Example 3: Given an integer array nums and an integer k,
               find the sum of the subarray with the largest sum whose length is k.

     */
    public static int largestSumKSubarray(int[] arr, int k) {
        int curr = 0;
        int left = 0;
        // build the first window
        for (int i=0; i<k; i++) {
            curr += arr[i];
        }
        // update ans
        int ans = curr;
        for (int right=k; right<arr.length; right++) {
            curr -= arr[left];
            curr += arr[right];
            ans = Math.max(ans, curr);
        }
        return ans;
    }

}
