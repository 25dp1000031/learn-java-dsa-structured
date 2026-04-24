package Academics.iitm_bs_diploma_2025.Questions;

public class Question5_2025_feb {
    public static void main(String[] args) {
        Fruits f = new Fruits();
        f.display();
        Fruits a = new Grapes();
        a.display();
        Grapes g = new Grapes();
        g.display();
        // the thing is even if we create the grapes object anyhow be it with super() or
        // not super it will still call its superclass constructor as it java's way
        // showing that we are initializing the whole of class
        // in an multi level inheritance it will call the constructor of the
        // superclasses
        Bites b = new Bites();
        b.display();
    }

}

class Fruits {
    public Fruits() {
        System.out.println("Fruits Created !");
    }

    public void display() {
        System.out.println("Fruits !");
    }
}

class Grapes extends Fruits {
    public Grapes() {
        super();
        System.out.println("Grapes Created !");
    }

    public void display() {
        System.out.println("Grapes !");
    }
}

class Bites extends Grapes {
    public Bites() {
        System.out.println("took bites");
    }

    public void display() {
        System.out.println("showing bites !");
    }
}