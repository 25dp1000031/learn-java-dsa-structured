import java.util.Arrays;

public class CandyBrute {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] ratings = { 1, 0, 5 };
        System.out.println("Minimum candies required: " + obj.candy(ratings));
    }
}

class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 1; i < candies.length; i++) {
            if (ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        // right to left pass
        for (int i = candies.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        // total candies required
        int sum = 0;
        for (int i : candies) {
            sum += i;
        }
        return sum;
    }
}