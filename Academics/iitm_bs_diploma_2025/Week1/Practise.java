package Academics.iitm_bs_diploma_2025.Week1;

public class Practise {
    public static void main(String[] args) {
        System.err.println("inside main");
        A a1 = new A();
        a1.method();
        // A a2 = new C();
        // a2.method();
    }
}

class A {
    void method() {
        System.out.println("inside A");
    }
}

class B extends A {
    @Override
    void method() {
        System.err.println("inside B");
    }

}

class C extends B {
    void method() {
        super.method();
        System.out.println("inside C");
    }
}