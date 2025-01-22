package Hash;

import java.util.HashMap;

public class count {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println("Result: " + longestSubstringWithKchars(s, k));
    }
    /*
    Example 1: You are given a string s and an integer k.
               Find the length of the longest substring that contains at most k distinct characters.
               For example, given s = "eceba" and k = 2, return 3.
               The longest substring with at most 2 distinct characters is "ece".
     */
    public static int longestSubstringWithKchars(String s, int k) {
        int max_len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right=0; right<s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                int curr = map.get(s.charAt(right));
                map.put(s.charAt(right), curr+1);
            } else {
                map.put(s.charAt(right), 1);
            }
            while (map.size()>k) {
                if (map.get(s.charAt(left))==1) {
                    map.remove(s.charAt(left));
                } else {
                    int curr = map.get(s.charAt(left));
                    map.put(s.charAt(left), curr-1);
                }
                left++;
            }
            max_len = Math.max(max_len, right-left+1);
        }
        return max_len;
    }
}
