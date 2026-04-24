package Academics.iitm_bs_diploma_2025.Questions.Oppe2.jan_2024;

import java.util.*;
import java.util.stream.*;

public class Q1_Streams {
    public static void main(String[] args) {
        ArrayList<Patient> Patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Patient obj = new Patient(sc.next(),
                    sc.nextInt(), sc.next());

            Patients.add(obj);
        }
        Stream<Patient> filteredStream = Patient.patientProcessor(Patients);
        filteredStream.forEach(System.out::println);
        sc.close();
    }
}

class Patient {
    private String name;
    private int age;
    private String chronicCondition;

    public Patient(String n, int a, String cC) {
        name = n;
        age = a;
        chronicCondition = cC;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int getage() {
        return age;
    }

    public String getchronicCondition() {
        return chronicCondition;
    }

    // define method patientProcessor
    public static Stream<Patient> patientProcessor(ArrayList<Patient> patients) {
        return patients.stream().filter(p -> p.getage() < 30 && p.getchronicCondition().equals("Diabetes"));
    }
}