import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        // example : arr : [2, -1, 3, -3, 4] and its prefix_arr : [2, 1, 4, 1, 5]
        // now the prefix of it would be [2], [2, -1], [2, -1, 3], [2, -1, 3, 4]
        // but would not be [-1, 3], [3, -3], [-1, 3, -3, 4] [3, -3, 4]
        int[] arr = { 2, -1, 3, -3, 4 };
        ExplanationOfPrefixSum eps = new ExplanationOfPrefixSum();
        int[] prefix_arr = eps.BuildPrefixSum(arr);
        for (int i : prefix_arr) {
            System.out.println(i);
        }
        System.out.println(eps.getPrefixSum(prefix_arr, 0, 2));
    }
}

class ExplanationOfPrefixSum {
    // given an array of values, design a data structure that can query the sum of
    // subarray of the values. [2, -1, 3, -3, 4]
    // Build prefix sum iteratively
    public int[] BuildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        return prefix;
    }

    public int getPrefixSum(int[] arr, int first, int second) {
        if (first == 0) {
            return arr[second];
        }
        return arr[second] - arr[first - 1];
    }
}

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
            if (getPrefix(nums, left, right) == k) {
                count++;
            } else if (getPrefix(prefix, left, right) > k) {
                left++;
            }
            right++;
        }

    }

    int getPrefix(int[] arr, int first, int second) {
        if (first == 0) {
            return arr[second];
        }
        return arr[second] - arr[first - 1];
    }
}