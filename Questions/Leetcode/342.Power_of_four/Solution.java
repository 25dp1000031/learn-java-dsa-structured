class Solution {
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.isPowerOfTwo(16));
        System.out.println(p.isPowerOfTwo(5));
        System.out.println(p.isPowerOfTwo(1));
    }
}

class Power {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}