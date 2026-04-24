package Academics.iitm_bs_diploma_2025.Questions.Oppe2.jan_2024;

import java.util.Scanner;

public class Q3_Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Airplane a1 = new Airplane(sc.nextLine(), sc.next(),

                new Engine(sc.next(), sc.nextInt()));

        Airplane a2 = a1.clone();
        sc.nextLine(); // Last escape character
        a2.setModel(sc.next());
        a2.setEngine(sc.next(), sc.nextInt());
        System.out.println(a1);
        System.out.println(a2);

        sc.close();
    }
}

class Airplane implements Cloneable {
    private String company;
    private String model;
    private Engine eng;

    public Airplane(String c, String m, Engine e) {
        company = c;
        model = m;
        eng = e;
    }

    public String toString() {
        return company + ": " + model + eng;
    }

    public void setEngine(String n, int num) {
        eng.setName(n);
        eng.setNumEngines(num);
    }

    public void setModel(String m) {
        model = m;
    }

    // Write code to implement the clone() method
    public Airplane clone() throws CloneNotSupportedException {
        Airplane obj = (Airplane) super.clone();
        obj.eng = this.eng.clone();
        return obj;
    }
}

class Engine implements Cloneable {
    private String name;
    private int numEngines;

    // Write code to implement the clone() method
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public Engine(String n, int num) {
        name = n;
        numEngines = num;
    }

    public void setName(String n) {
        name = n;
    }

    public void setNumEngines(int n) {
        numEngines = n;
    }

    public String toString() {
        return "[" + name + ", " + numEngines + "]";
    }
}
