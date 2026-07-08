package Patterns.NeetCode150.Recursion.UnknownQuestion.SubsetType;

import java.util.ArrayList;

// i dont remember clearly but this was asked in infosys sp dsp
public class UnknownQuestion {
    public static void main(String[] args) {
        int[] arr = { 30, 60, 90 };
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Solution sol = new Solution();
        sol.func(list, ds, 0, arr);
        list.forEach(x -> System.out.print(x + " "));
    }
}

class Solution {
    public void func(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ds, int index, int[] arr) {
        if (index == arr.length) {
            if (!ds.isEmpty()) {
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(arr[index]);
        func(list, ds, index + 1, arr);
        ds.remove(ds.size() - 1);
        func(list, ds, index + 1, arr);
    }
}