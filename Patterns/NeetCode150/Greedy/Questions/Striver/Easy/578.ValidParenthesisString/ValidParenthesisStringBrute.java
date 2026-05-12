import java.util.*;

public class ValidParenthesisStringBrute {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        if (sol.checkValidString(input)) {
            System.out.println("Valid parenthesis string");
        } else {
            System.out.println("Invalid parenthesis string");
        }
    }
}

class Solution {
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else if (c == ')') {
                close++;
            } else {
                star++;
            }
        }
        if (open == close) {
            return true;
        } else {
            int diff = Math.abs(open - close);
            if (star == diff) {
                return true;
            } else {
                return false;
            }
        }
    }
}