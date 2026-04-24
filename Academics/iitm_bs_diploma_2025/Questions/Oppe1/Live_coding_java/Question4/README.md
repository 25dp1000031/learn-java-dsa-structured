# Problem Statement

```text
4. Write a Java program that accepts list of student objects and updates the regular fees, based on the number of backlogs that each student has.

• An interface Generatable that has the following member:
  – Abstract method abstract void feeGenerate(Student s)

• Class Student that has the following members:
  – String name, double fee and int backlogs as private instance variable.
  – Constructor to initialize the name and backlogs.
  – Mutator method to update the fee
  – Accessor method to access the backlogs
  – Override method toString() that returns name, fee and backlogs of the Student as a single concatenated string (each separated by comma(,))

• Class ExamBranch that has the following members:
  – A private inner class Regular that implements the interface Generatable and  overrides method public void feeGenerate(Student s) that, in turn, initializes the regular student fee as 1500.
  – A private inner class Supple that implements the interface Generatable and overrides method public void feeGenerate(Student s) that, in turn, has the following functionality.
    ∗ If the student backlogs == 1, then update the student fee to 2000.
    ∗ Else, if the student backlogs == 2, then update the student fee to 2500.
    ∗ Else, if the student backlogs >= 3, then update the student fee to 3500.
  – You should define method getRegularFee() that returns an object of Regular class.
  – You should define method getSuppleFee() that returns an object of Supple class.

• Class PrivateClassTest has the following members:
  – You should define method public static Student[] getStudentsFee(Student sList[]) that does the following:
    ∗ Iterates over array sList such that in each iteration, invoke method feeGenerate(Student s) on each Student object from Regular class, if student backlogs == 0. Else, invoke method feeGenerate(Student s) on each Student object from Supple class.
  – main method has the following functionality
    ∗ Creates and initializes an array sArr of three Student objects
    ∗ Invokes method getStudentsFee(sArr) to get the updated details of each Student after the fee is updated
    ∗ Prints the updated list
```

## Question

```java
import java.util.Scanner;
interface Generatable{
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
class ExamBranch{
    private class Regular implements Generatable{
        public void feeGenerate(Student s) {
            s.setFee(1500.00);
        }
    }
    private class Supple implements Generatable{
        public void feeGenerate(Student s) {
            if(s.getBacklogs() == 1)
                s.setFee(1500 + 500);
            else if(s.getBacklogs() == 2)
                s.setFee(1500 + 1000);
            else if(s.getBacklogs() >=3 )
                s.setFee(1500 + 2000);
        }
    }

    // Define method getRegularFee()
    // Define method getSuppleFee()
}
public class PrivateClassTest {
    // Define method getStudentsFee()

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
```

```text

Public test case 1:
Input: Ananya 0 Acharya 4 Ashok 2
Output: Ananya, 1500.0, 0
        Acharya, 3500.0, 4
        Ashok, 2500.0, 2

Public test case 2:
Input: Sharath 1 Shekar 0 Shhin 0
Output: Sharath, 2000.0, 1
        Shekar, 1500.0, 0
        Shhin, 1500.0, 0

Private test case 1:
Input: Bharath 3 Bharani 4 Balaji 5
Output: Bharath, 3500.0, 3
        Bharani, 3500.0, 4
        Balaji, 3500.0, 5

```

## Solution

```java
import java.util.Scanner;

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
            if (s.getBacklogs() == 1) s.setFee(1500 + 500);
            else if (s.getBacklogs() == 2) s.setFee(1500 + 1000);
            else if (s.getBacklogs() >= 3) s.setFee(1500 + 2000);
        }
    }

    public Generatable getRegularFee() {
        return new Regular();
    }
    public Generatable getSuppleFee() {
        return new Supple();
    }
}

public class PrivateClassTest {
    public static Student[] getStudentsFee(Student sList[]) {
        ExamBranch obj;
        for (int i = 0; i < sList.length; i++) {
            if (sList[i].getBacklogs() == 0) {
                obj = new ExamBranch();
                obj.getRegularFee().feeGenerate(sList[i]);
            } else {
                obj = new ExamBranch();
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
```
