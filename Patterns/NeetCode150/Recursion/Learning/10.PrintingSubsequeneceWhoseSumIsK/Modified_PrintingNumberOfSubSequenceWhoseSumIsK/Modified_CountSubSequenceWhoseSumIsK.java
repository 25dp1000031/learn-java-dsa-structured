import java.util.ArrayList;

public class Modified_CountSubSequenceWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int target = 2;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        int res = func(arr, 0, 0, arr.length, target, ds, ans);
        System.out.println(res);
        // for (ArrayList<Integer> i : ans) {
        // System.out.println(i);
        // }
    }

    static int func(int[] arr, int ind, int sum, int n, int target, ArrayList<Integer> ds,
            ArrayList<ArrayList<Integer>> ans) {
        if (ind == n) {
            if (sum == target) {
                ans.add(new ArrayList<>(ds));
                return 1;
            }
            return 0;
        }
        ds.add(arr[ind]);
        sum += arr[ind];
        int left = func(arr, ind + 1, sum, n, target, ds, ans);
        ds.remove(ds.size() - 1);
        sum -= arr[ind];
        int right = func(arr, ind + 1, sum, n, target, ds, ans);
        return left + right;
    }
}
