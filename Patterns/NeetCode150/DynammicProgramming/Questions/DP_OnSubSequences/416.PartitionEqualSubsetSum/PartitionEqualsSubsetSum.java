public class PartitionEqualsSubsetSum {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 11, 5 };
        System.out.println(Solution.canPartition(nums));
    }
}

class Solution {
    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum /= 2;
        boolean res = knapSack(n - 1, sum, nums);
        return res;
    }

    public static boolean knapSack(int index, int target, int[] arr) {
        // base cases :
        if (target == 0)
            return true;
        if (index == 0)
            return (arr[index] == target);
        // Not Taken
        boolean notTaken = knapSack(index - 1, target, arr);
        boolean Taken = false;
        if (arr[index] <= target) {
            Taken = knapSack(index - 1, target - arr[index], arr);
        }
        return Taken || notTaken;
    }
}