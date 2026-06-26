public class SumOfNnumbersUsingRecusionParameterisedVersion {
    public static void main(String[] args) {
        int n = 5;
        print(n, 0);
    }

    static void print(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        print(n - 1, sum + n);
    }
}
