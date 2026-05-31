import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = Solution.twoSum(nums, target);
        for (int i : res) {
            System.out.println(i + " ");
        }
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}