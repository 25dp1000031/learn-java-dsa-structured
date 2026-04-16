package Patterns.ApnaCollegeDSA.Arrays.Question_5;

public class Buy_And_Sell_Stock {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        s.maxProfit(prices);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;
        int diff = 0;
        for (int p : prices) {
            if (p < min_price) {
                min_price = p;
            }
            diff = p - min_price;
            max_profit = Math.max(max_profit, diff);
        }
        return max_profit;
    }
}