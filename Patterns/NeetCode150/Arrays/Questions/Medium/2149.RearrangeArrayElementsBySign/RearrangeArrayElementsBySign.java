public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        Solution sol = new Solution();
        int[] res = sol.rearrangeArray(nums);
        for (int i : res) {
            System.out.print(" " + i + " ");
        }
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int positive = 0;
        int negative = 1;
        int ptr = 0;
        while (ptr < nums.length) {
            if (nums[ptr] > 0) {
                arr[positive] = nums[ptr];
                positive += 2;
            } else {
                arr[negative] = nums[ptr];
                negative += 2;
            }
            ptr++;
        }
        return arr;
    }

    public int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}

// does not seems to be preserving the relative order
class SolutionInPlace {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;
        int ptr = 0;
        while (ptr < nums.length && positive < nums.length && negative < nums.length) {
            if (nums[ptr] > 0) {
                if (ptr != positive) {
                    swap(nums, positive, ptr);
                }
                positive += 2;

            } else {
                if (ptr != negative) {
                    swap(nums, negative, ptr);
                }
                negative += 2;
            }
            ptr++;
        }
        return nums;
    }

    public int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}