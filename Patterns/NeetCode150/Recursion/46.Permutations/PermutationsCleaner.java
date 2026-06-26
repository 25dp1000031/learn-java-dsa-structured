import java.util.*;

public class PermutationsCleaner {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        Solution sol = new Solution();
        List<List<Integer>> list = sol.permute(nums);
        for (List<Integer> l : list) {
            System.out.print(l + " ");
        }
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        Stack<Integer> ds = new Stack<>();
        int n = nums.length;
        func(ds, map, list, n, nums);
        return list;
    }

    public void func(Stack<Integer> ds, boolean[] map, List<List<Integer>> list, int n, int[] arr) {
        if (ds.size() == n) {
            list.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!map[i]) {
                ds.push(arr[i]);
                map[i] = true;
                func(ds, map, list, n, arr);
                map[i] = false;
                ds.pop();
            }
        }
    }
}