class Solution {
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.isPowerOfTwo(27));
        System.out.println(p.isPowerOfTwo(0));
        System.out.println(p.isPowerOfTwo(-1));
    }
}

class Power {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}