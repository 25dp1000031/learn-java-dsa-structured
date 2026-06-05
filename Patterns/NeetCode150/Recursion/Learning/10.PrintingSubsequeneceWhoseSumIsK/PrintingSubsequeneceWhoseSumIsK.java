import java.util.ArrayList;

public class PrintingSubsequeneceWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int target = 2;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        func(arr, 0, 0, arr.length, target, ds, ans);
        for (ArrayList<Integer> i : ans) {
            System.out.println(i);
        }
    }

    static void func(int[] arr, int ind, int sum, int n, int target, ArrayList<Integer> ds,
            ArrayList<ArrayList<Integer>> ans) {
        if (ind == n) {
            if (sum == target) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(arr[ind]);
        sum += arr[ind];
        func(arr, ind + 1, sum, n, target, ds, ans);
        ds.remove(ds.size() - 1);
        sum -= arr[ind];
        func(arr, ind + 1, sum, n, target, ds, ans);
    }
}
