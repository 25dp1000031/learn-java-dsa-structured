import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        Solution sol = new Solution();
        System.out.println(sol.findContentChildren(g, s));
    }
}

class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0; // for g
        int right = 0; // for s
        while (left < g.length && right < s.length) {
            if (g[left] <= s[right]) {
                left++;
            }
            right++;
        }
        return left;
    }
}