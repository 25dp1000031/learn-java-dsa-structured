package Academics.iitm_bs_diploma_2025.Week2;

public class Practise {
    public static void main(String[] args) {
        System.err.println("inside main");
        A a1 = new C();
        a1.method();
        // A a2 = new C();
        // a2.method();
    }
}

interface A {
    public void method();
}

interface B extends A {

    default void method() {
        System.err.println("inside B and A");
    }

}

class C implements B {
    public void method() {
        System.out.println("inside C");
    }
}