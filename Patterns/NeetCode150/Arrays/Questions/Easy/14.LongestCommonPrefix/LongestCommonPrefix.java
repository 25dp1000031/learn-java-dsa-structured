
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        Solution sol = new Solution();
        String res = sol.longestCommonPrefix(strs);
        System.out.println(res);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }
}