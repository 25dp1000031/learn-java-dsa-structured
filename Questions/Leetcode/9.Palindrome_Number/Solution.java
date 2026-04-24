public class Solution {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
    }
}

class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original_x = x;
        int rev_x = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            rev_x = (rev_x * 10) + digit;
        }
        return original_x == rev_x;
    }
}