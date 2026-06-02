public class PrintFactorialOfNUsingRecurisonParameterized {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        print(n, i);
    }

    static void print(int n, int factorial) {
        if (n < 1) {
            System.out.println(factorial);
            return;
        }
        factorial *= n;
        print(n - 1, factorial);
    }
}
