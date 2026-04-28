import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        QuestionOnPrefixSum q = new QuestionOnPrefixSum();
        System.out.println(q.subarraySum(nums, k));

    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            if (sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                count++;
            }

            right++;
        }
        return count;
    }
}

// wrong and inefficient

class QuestionOnPrefixSum {
    // 560. Subarray Sum Equals K

    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int left = 0;
        int right = 0;
        int count = 0;
        while (right < nums.length) {
            if (getPrefix(prefix, left, right) == k) {
                count++;
            } else if (getPrefix(prefix, left, right) > k) {
                left++;
            }
            right++;
        }
        return count;

    }

    int getPrefix(int[] arr, int first, int second) {
        if (first == 0) {
            return arr[second];
        }
        return arr[second] - arr[first - 1];
    }
}