import java.util.*;

public class CombinationSumIICleaner {
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
        Arrays.sort(candidates);
        func(ds, 0, target, candidates, list);
        return list;
    }

    public void func(ArrayList<Integer> ds, int index, int target, int[] arr, List<List<Integer>> list) {
        int n = arr.length;
        if (target == 0) {
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
            if (arr[i] > target)
                break;
            ds.add(arr[i]);
            func(ds, i + 1, target - arr[i], arr, list);

            ds.remove(ds.size() - 1);
        }

    }
}

