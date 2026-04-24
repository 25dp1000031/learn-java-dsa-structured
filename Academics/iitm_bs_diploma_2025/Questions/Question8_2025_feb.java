package Academics.iitm_bs_diploma_2025.Questions;

public class Question8_2025_feb {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.drive();
        v1.refuel();
        ((Fuel) v1).refuel();
    }
}

interface Vehicle {
    default void drive() {
        System.out.println("Vehicle is driving");
    }
}

interface Fuel {
    default void refuel() {
        System.out.println("Vehicle is refueling");
    }
}

class Car implements Fuel, Vehicle {
    public void drive() {
        System.out.println("Car is driving smoothly");
    }
}