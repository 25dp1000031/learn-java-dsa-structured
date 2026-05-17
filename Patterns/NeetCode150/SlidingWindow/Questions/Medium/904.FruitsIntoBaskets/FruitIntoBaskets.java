import java.util.*;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = { 1, 2, 1 };
        int res = Solution.totalFruit(fruits);
        System.out.println(res);
    }
}

class Solution {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLenCount = 0;
        int n = fruits.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            int currLen = right - left + 1;
            maxLenCount = Math.max(maxLenCount, currLen);
        }
        return maxLenCount;
    }
}