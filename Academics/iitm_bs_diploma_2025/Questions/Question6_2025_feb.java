package Academics.iitm_bs_diploma_2025.Questions;

public class Question6_2025_feb {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.eat();
        // conversion of object ? what is this lmao
        ((Dog) obj).eat();
        ((Mammal) obj).sound();
    }

}

interface Animal {
    default void sound() {
        System.out.println("Animal Making Sound");
    }

    void eat();
}

interface Mammal extends Animal {
    default void sound() {
        System.out.println("Mammal Making Sound");
    }
}

class Dog implements Mammal {
    public void eat() {
        System.out.println("Dog eating ");
    }
}
