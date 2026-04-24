package Academics.iitm_bs_diploma_2025.Questions.Oppe1.Live_coding_java.Question1.Oppe1_2023;

import java.util.*;

public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = { "Maths", "DL", "DSA", "DC" };
        Student s1 = new Student("Nandu", courses);
        Student s2 = new Student(s1);
        s2.setName(sc.next());
        s2.setCourses(1, sc.next());
        System.out.println(s1.getName() + ": " + s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}

class Student {
    String name;
    String[] courses;

    // ***** Define constructor(s) here
    Student(String name, String[] c) {
        this.name = name;
        this.courses = c;
    }

    Student(Student s) {
        this.name = s.name;
        int length = s.courses.length;
        this.courses = new String[length];
        for (int i = 0; i < length; i++) {
            this.courses[i] = s.courses[i];
        }
    }

    public void setName(String n) {
        name = n;
    }

    public void setCourses(int indx, String c) {
        courses[indx] = c;
    }

    public String getName() {
        return name;
    }

    public String getCourses(int indx) {
        return courses[indx];
    }
}
