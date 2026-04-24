package Academics.iitm_bs_diploma_2025.Questions.Oppe2.jan_2025;

import java.util.*;

public class Q2_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(sc.nextLine());
        try {
            myCar.accelerate(sc.nextDouble());
            myCar.accelerate(sc.nextDouble());
        } catch (SpeedLimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCar);
        sc.close();
    }
}

// Define class SpeedLimitException
class SpeedLimitException extends Exception {
    SpeedLimitException(String message) {
        super(message);
    }
}

class Car {
    private String model;
    private double speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0.0;
    }

    public void accelerate(double increment) throws SpeedLimitException {
        // Implement the method
        double new_speed = this.speed + increment;
        if (new_speed >= 120) {
            throw new SpeedLimitException("Speed limit exceeded, Max allowed is 120 km/h.");
        } else {
            this.speed = this.speed + increment;
        }
    }

    public String toString() {
        return "Car Model: " + model + ", Speed: " + speed + " km/h";
    }
}
