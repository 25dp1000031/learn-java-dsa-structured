import java.util.*;

public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        Solution sol = new Solution();
        int[] res = sol.replaceElements(arr);
        for (Integer integer : res) {
            System.out.print(" " + integer + " ");
        }
    }
}

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int maxRight = -1;
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = maxRight;
            // update maxRight
            maxRight = Math.max(maxRight, arr[i]);
        }
        return ans;
    }
}