package Array_String;

public class twoPointers {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean check = isSubsequence(s, t);
        System.out.println("Result: " + check);
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length()==0) {
            return true;
        }
        int p1 = 0;
        int p2 = 0;
        while (p2<t.length()) {
            if (t.charAt(p2)==s.charAt(p1)) {
                p1++;
            }
            if (p1==s.length()) {
                break;
            }
            p2++;
        }
        return p1==s.length();
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }

}
