public class CountNumberofNiceSubarrays {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 1, 1 };
        int k = 3;
        int res = Solution.numberOfSubarrays(nums, k);
        System.out.println(res);
    }
}

class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int[] arr, int k) {
        int left = 0;
        int arrayCount = 0;
        int oddCount = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                oddCount++;
            }
            while (oddCount > k) {
                if (arr[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }
            arrayCount += right - left + 1;
        }
        return arrayCount;
    }
}