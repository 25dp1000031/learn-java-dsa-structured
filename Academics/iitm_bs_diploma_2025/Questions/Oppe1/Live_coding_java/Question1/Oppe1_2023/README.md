# Problem Statement

```text
In a college, Student s1 chooses a set of courses. Student s2 also chooses all the courses
chosen by s1 except the second course, in place of which s2 chooses another course. Write a
program that defines two classes Student and Admission. Define copy constructor to create
s2 from s1 such that changing the values of instance variables of either s2 or s1 does not
affect the other one. The code takes name of student s2 and the new course chosen by s2 as
input.

• Class Student has/should have the following members.
  – Private instance variables String name and String[] courses to store name
    and courses chosen respectively
  – Define required constructor(s)
  – Accessor methods getName( ) and getCourses(int) to get the name of the
    student and the course at a specific index respectively.
  – Mutator methods setName(String) and setCourses(int,String) to set the
    name of the student and the course at a specific index respectively.

• Class Admission has method main that does the following.
  – Two objects of Student s1 and s2 are created. s2 is created using s1
  – name of Student s2 and second course chosen by s2 are updated by taking the
    input
  – Finally, name of s1, s2 and second course chosen by s1 and s2 are printed

What you have to do
• Define constructor(s) in class Student
```

## Question

```java
import java.util.*;

class Student {
    String name;
    String[] courses;
    //***** Define constructor(s) here

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

public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"Maths", "DL","DSA","DC"};
        Student s1 = new Student("Nandu", courses);
        Student s2 = new Student(s1);
        s2.setName(sc.next());
        s2.setCourses(1, sc.next());
        System.out.println(s1.getName() + ": " + s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}

```

## Input/Output

```text
Public test case 1:
Input:
Suba COA

Output:
Nandu: DL
Suba: COA

Public test case 2:
Input:
Pai CV

Output:
Nandu: DL
Pai: CV

Private test case 1:
Input:
Neha DS

Output:
Nandu: DL
Neha: DS

```

## Solution

```java
import java.util.*;

class Student {
    String name;
    String[] courses;

    public Student(String n, String[] c) {
        name = n;
        courses = c;
    }

    public Student(Student s) {
        this.name = s.name;
        this.courses = new String[s.courses.length];
        for (int i = 0; i < courses.length; i++) {
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

public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"Maths", "DL", "DSA", "DC"};
        Student s1 = new Student("Nandu", courses);
        Student s2 = new Student(s1);
        s2.setName(sc.next());
        s2.setCourses(1, sc.next());

        System.out.println(s1.getName() + ": " + s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}

```
