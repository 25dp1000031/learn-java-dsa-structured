import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && i > 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[j - 1] && j > 0) {
                    continue;
                }
                int k = j + 1;
                int m = nums.length - 1;
                while (k < m) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));
                        k++;
                        m--;
                        while (nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (nums[m] == nums[m - 1]) {
                            m--;
                        }
                    } else if (sum > target) {
                        m--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return res;
    }
}