import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Solution sol = new Solution();
        List<List<Integer>> list = sol.combinationSum2(candidates, target);
        for (List<Integer> i : list) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        int sum = 0;
        Arrays.sort(candidates);
        func(ds, sum, 0, target, candidates, list);
        return list;
    }

    public void func(ArrayList<Integer> ds, int sum, int index, int target, int[] arr, List<List<Integer>> list) {
        int n = arr.length;
        if (sum == target) {
            list.add(new ArrayList<>(ds));
            return;
        }
        if (index >= n) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (sum + arr[i] > target)
                break;
            sum += arr[i];
            ds.add(arr[i]);
            func(ds, sum, i + 1, target, arr, list);

            ds.remove(ds.size() - 1);
            sum -= arr[i];
        }

    }
}