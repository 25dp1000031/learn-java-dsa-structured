public class MaximumPointsYouCanObtainFromCards {
    public static void main(String args[]){
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(Solution.maxScore(cardPoints, k));
    }
}

class Solution {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left = 0;
        int leftSum = 0;
        int rightSum = 0;
        int maxScore = 0;
        while(left < 3){
            leftSum += cardPoints[left];
            left ++;
        }
        maxScore = leftSum;
        for(int right = k - 1; right >= 0; right -- ){
            leftSum -= cardPoints[right];
            rightSum += cardPoints[n - (k - right)];
            maxScore = Math.max(maxScore, leftSum + rightSum);
        }
        return maxScore;
    }
}