package Patterns.NeetCode150.DynammicProgramming.Questions.DP_OnSubSequences.SubsetSumProblem;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        boolean res = Solution.isSubsetSum(arr, sum);
        System.out.println(res);
    }
}

class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        return SubsetSumEqualsTarget(n - 1, sum, arr);

    }

    static Boolean SubsetSumEqualsTarget(int index, int target, int[] arr) {
        // base case 1 : if we did found the target
        if (target == 0) {
            return true;
        }
        // base case 2 : if we searched but didnt think that the index itself is the
        // target
        if (index == 0) {
            return arr[index] == target;
        }

        // now the knapsack part
        // notTaken (excluding the index from the subset)
        boolean notTaken = SubsetSumEqualsTarget(index - 1, target, arr);
        // Taken
        boolean Taken = false;
        if (arr[index] <= target) {
            Taken = SubsetSumEqualsTarget(index - 1, target - arr[index], arr);
        }
        return notTaken || Taken;
    }
}