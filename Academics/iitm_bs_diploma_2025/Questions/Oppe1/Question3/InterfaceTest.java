package Academics.iitm_bs_diploma_2025.Questions.Oppe1.Question3;

import java.util.*;

public class InterfaceTest {
    // Define method printUpdatedTeachList
    public static void printUpdatedTeachList(Teacher[] tList) {
        for (int i = 0; i < tList.length; i++) {
            tList[i].checkAndUpdateSalary();
            System.out.println(tList[i]);
        }
        // you could also create two loops for printing the objects but i prefer this
        // way ig o(n) thats why two loops would be like o(2n)
        // for (int i = 0; i < tList.length; i++) {
        // System.out.println(tList[i]);
        // ;
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher tArr[] = new Teacher[3];
        for (int i = 0; i < tArr.length; i++)
            tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
        InterfaceTest.printUpdatedTeachList(tArr);
    }
}

// Define interface Appraisable
interface Appraisable {
    default void appraisal(Teacher t) {
        t.setSalary(t.getSalary() + (t.getstuPassPer() / 100) * 5000);
    }
}

// Define interface SpecialAppraisable
interface SpecialAppraisable extends Appraisable {
    default void spAppraisal(Teacher t) {
        t.setSalary(t.getSalary() + (t.getstuPassPer() / 100) * 10000);
    }
}

class Teacher implements SpecialAppraisable {
    private String name;
    private double salary;
    private double stuPassPer;

    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getstuPassPer() {
        return stuPassPer;
    }

    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }

    public void checkAndUpdateSalary() {
        if (stuPassPer >= 60 && stuPassPer < 75)
            appraisal(this);
        else if (stuPassPer >= 75 && stuPassPer <= 100)
            spAppraisal(this);
    }
}
