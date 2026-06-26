import java.util.*;

public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 2 };
        Solution sol = new Solution();
        List<List<Integer>> list = sol.permuteUnique(nums);
        for (List<Integer> l : list) {
            System.out.print(l + " ");
        }
    }
}

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        Stack<Integer> ds = new Stack<>();
        int n = nums.length;
        Arrays.sort(nums);
        func(ds, map, list, n, nums);
        return list;
    }

    public void func(Stack<Integer> ds, boolean[] map, List<List<Integer>> list, int n, int[] arr) {
        if (ds.size() == n) {
            list.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < n; i++) {

            if (i > 0 && arr[i] == arr[i - 1] && map[i - 1]) {
                continue;
            }
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