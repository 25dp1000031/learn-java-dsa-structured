import java.util.Arrays;
import java.util.HashMap;

public class ReplaceElementsByItsRankInTheArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = { 1, 5, 8, 15, 8, 25, 9 };

        int[] res = obj.replaceWithRank(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}

class Solution {
    public int[] replaceWithRank(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i : sortedArr) {
            if (!map.containsKey(i)) {
                map.put(i, rank);
                rank++;
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}