public class solution {
    public static void main(String[] args) {
        temp t = new temp();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        double ans = t.solution(nums, 4);
        System.err.println(ans);
    }
}

class temp {
    double solution(int[] nums, int k) {
        int left = 0;
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i - left + 1 == k) {
                max_sum = Math.max(max_sum, sum);
                sum -= nums[left];
                left++;
            }
        }
        double res = (double) max_sum / k;

        return res;
    }
}