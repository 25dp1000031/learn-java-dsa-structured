public class Main {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        Solution s = new Solution();
        int[] arr = s.twoSum(numbers, target);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                int[] arr = { l + 1, r + 1 };
                return arr;
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        int[] arr = { 0, 0 };
        return arr;
    }
}