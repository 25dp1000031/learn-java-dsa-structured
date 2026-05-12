import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        Solution sol = new Solution();
        List<List<Integer>> res = new ArrayList<>();
        res = sol.permute(nums);
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }
}

class Solution {
    public void recurPermutation(List<List<Integer>> ans, List<Integer> ds, boolean marked[], int[] nums) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!marked[i]) {
                marked[i] = true;
                ds.add(nums[i]);
                recurPermutation(ans, ds, marked, nums);
                ds.remove(ds.size() - 1);
                marked[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean marked[] = new boolean[nums.length];
        recurPermutation(ans, ds, marked, nums);
        return ans;
    }
}