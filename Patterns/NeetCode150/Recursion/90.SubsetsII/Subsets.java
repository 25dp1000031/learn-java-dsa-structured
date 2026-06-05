import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> res = Solution.subsetsWithDup(nums);
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }
}

class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        func(0, ds, nums, list);
        return list;
    }

    static void func(int ind, ArrayList<Integer> ds, int[] arr, List<List<Integer>> list) {
        int n = arr.length;
        if (ind == n) {
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        // take
        func(ind + 1, ds, arr, list);
        ds.remove(ds.size() - 1);
        // duplicate removal
        while (ind + 1 < arr.length && arr[ind] == arr[ind + 1]) {
            ind++;
        }
        // not take
        func(ind + 1, ds, arr, list);
    }
}