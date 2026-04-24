package Academics.iitm_bs_diploma_2025.Questions;

public class Question10_2025_feb {
    public static void main(String[] args) {
        Fan obj = new SmartFan();
        obj.turnOn();
        obj.turnOn(3);
    }
}

class Appliance {
    public void turnOn() {
        System.out.println("Turn on Appliance");
    }
}

class Fan extends Appliance {
    public void turnOn() {
        System.out.println("Turn on Fan");
    }

    public void turnOn(int speed) {
        System.out.println("Set Fand Speed to : " + speed);
    }
}

class SmartFan extends Fan {
    public void turnOn() {
        super.turnOn();
        System.out.println("Turn on smart fan with default settings");
    }
}