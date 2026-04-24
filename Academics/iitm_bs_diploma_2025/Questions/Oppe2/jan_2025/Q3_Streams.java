package Academics.iitm_bs_diploma_2025.Questions.Oppe2.jan_2025;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.*;

public class Q3_Streams {
    // Define method getEligibleStream here
    public static Stream<Student> getEligibleStream(ArrayList<Student> sList) {
        Stream<Student> sStream = sList.stream().filter((s -> s.getIncome() < 100000 && s.getAvgCGPA() > 7.5));
        return sStream;
    }

    // Define method updateScholarshipStatus here
    public static void updateScholarshipStatus(List<Student> eList) {
        for (Student es : eList) {
            if (es.getAvgCGPA() > 9) {
                es.setScholarshipStatus("grade-1 scholarship");
            } else {
                es.setScholarshipStatus("grade-2 scholarship");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sList = new ArrayList<Student>();
        Student s;
        for (int i = 0; i < 4; i++) {
            s = new Student(sc.next(), sc.nextDouble(), sc.nextDouble());
            sList.add(s);
        }
        List<Student> eList = getEligibleStream(sList).collect(Collectors.toList());
        updateScholarshipStatus(eList);
        for (Student es : eList)
            System.out.println(es);
        sc.close();
    }
}

class Student {
    private String name, scholarshipStatus;
    private double avgCGPA, income;

    public Student(String n, double a, double i) {
        name = n;
        avgCGPA = a;
        income = i;
        scholarshipStatus = "not eligible";
    }

    public String toString() {
        return name + " : " + avgCGPA + " : "
                + income + " : " + scholarshipStatus;
    }

    public double getAvgCGPA() {
        return avgCGPA;
    }

    public double getIncome() {
        return income;
    }

    public void setScholarshipStatus(String ss) {
        scholarshipStatus = ss;
    }
}
