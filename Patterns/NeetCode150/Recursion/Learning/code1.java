package Patterns.NeetCode150.Recursion.Learning;

public record code1() {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println(1);
        print();
    }
}

// this code will give us a stack overflow since there is no limit to how much
// it needs to print and it will eventually run out of memory --> segmentation
// fault