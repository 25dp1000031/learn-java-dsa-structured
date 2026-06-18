import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        Solution sol = new Solution();
        List<List<Integer>> list = sol.combinationSum(candidates, target);
        for (List<Integer> i : list) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        int sum = 0;
        func(ds, sum, 0, target, candidates, list);
        return list;
    }

    public void func(ArrayList<Integer> ds, int sum, int index, int target, int[] arr, List<List<Integer>> list) {
        int n = arr.length;
        if (sum > target) {
            return;
        }
        if (sum == target) {
            list.add(new ArrayList<>(ds));
            return;
        }
        if (index == n) {
            return;
        }
        sum += arr[index];
        ds.add(arr[index]);
        // take and stay there
        func(ds, sum, index, target, arr, list);
        // not take and move forward
        ds.remove(ds.size() - 1);
        sum -= arr[index];
        func(ds, sum, index + 1, target, arr, list);
    }
}