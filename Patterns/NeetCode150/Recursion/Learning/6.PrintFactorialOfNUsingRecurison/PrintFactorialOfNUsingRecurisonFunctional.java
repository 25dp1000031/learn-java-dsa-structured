public class PrintFactorialOfNUsingRecurisonFunctional {
    public static void main(String[] args) {
        int n = 5;
        int res = print(n);
        System.out.println(res);
    }

    static int print(int n) {
        if (n < 1) {
            return 1;
        }
        return n * print(n - 1);
    }
}
