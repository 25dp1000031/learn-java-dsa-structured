import java.util.*;

public class MinimumOperationsToMakeAllArrayElementsEqual {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 6, 8 };
        int[] queries = { 1, 5 };
        List<Long> res = Solution.minOperations(nums, queries);
        for (Long long1 : res) {
            System.out.print(long1 + " ");
        }
    }
}

class Solution {
    public static List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> res = new ArrayList<>();
        for (int i : queries) {
            int[] temp = nums;
            long count = (long) 0;
            for (int j : temp) {
                count += (long) (Math.abs(j - i));
            }
            res.add(count);
        }
        return res;
    }
}