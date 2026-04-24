import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> Set = new HashSet<>();

        while (n != 1) {
            if (Set.contains(n)) {
                return false;
            }
            Set.add(n);
            n = Next(n);
        }
        return true;
    }

    public int Next(int val) {
        int sum = 0;
        while (val > 0) {
            int digit = val % 10;
            int squared = digit * digit;
            sum += squared;
            val = val / 10;
        }
        return sum;
    }
}
