class Solution2 {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = Next(slow);
            fast = Next(Next(fast));
        } while (slow != fast && fast != 1);
        return fast == 1;
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
