package Academics.iitm_bs_diploma_2025.Questions.Oppe1.Live_coding_java.Question4;

import java.util.Scanner;

public class PrivateClassTest {
    // Define method getStudentsFee()
    public static Student[] getStudentsFee(Student[] sList) {
        ExamBranch obj = new ExamBranch();
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getBacklogs() == 0) {
                obj.getRegularFee().feeGenerate(sList[i]);
            } else {
                obj.getSuppleFee().feeGenerate(sList[i]);
            }
        }
        return sList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] sArr = new Student[3];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = new Student(sc.next(), sc.nextInt());
        }
        sArr = PrivateClassTest.getStudentsFee(sArr);
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
    }
}

interface Generatable {
    abstract void feeGenerate(Student s);
}

class Student {
    private String name;
    private double fee;
    private int backlogs;

    public Student(String name, int backlogs) {
        this.name = name;
        this.backlogs = backlogs;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public String toString() {
        return name + ", " + fee + ", " + backlogs;
    }
}

class ExamBranch {
    private class Regular implements Generatable {
        public void feeGenerate(Student s) {
            s.setFee(1500.00);
        }
    }

    private class Supple implements Generatable {
        public void feeGenerate(Student s) {
            if (s.getBacklogs() == 1)
                s.setFee(1500 + 500);
            else if (s.getBacklogs() == 2)
                s.setFee(1500 + 1000);
            else if (s.getBacklogs() >= 3)
                s.setFee(1500 + 2000);
        }
    }

    // Define method getRegularFee()
    public Generatable getRegularFee() {
        return new Regular();
    }

    // Define method getSuppleFee()
    public Generatable getSuppleFee() {
        return new Supple();
    }
}