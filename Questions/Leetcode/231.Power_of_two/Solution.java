class Solution {
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.isPowerOfTwo(1));
        System.out.println(p.isPowerOfTwo(16));
        System.out.println(p.isPowerOfTwo(3));
        System.out.println(p.isPowerOfTwo(0));
    }
}

class Power {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}