# Problem Statement

```text
Complete the Java program to demonstrate the use of abstract classes and interfaces.
You have to complete the definition of classes JuniorRS and SeniorRS to obtain the
output as given in the public test cases.

• Interface IResearchScholar has two methods:
  – public void teaches(String str)
  – public void studies(String str)

• Define classes JuniorRS and SeniorRS such that:
  – JuniorRS implements IResearchScholar
  – SeniorRS extends JuniorRS

• Class InterAbstrTest extends SeniorRS, and has the main method.
  – An object of JuniorRS invokes the method studies
  – An object of SeniorRS invokes methods studies and teaches

```

## Question

```text
No Question Template Given
```

## Input/Output

```text
Test Case 1:
Input:
Python
Java

Output:
TA studies Python
TA studies Java
TA teaches Java

Test Case 2:
Input:
Cloud computing
Data Mining

Output:
TA studies Cloud computing
TA studies Data Mining
TA teaches Data Mining

```

## Solution

```java
import java.util.Scanner;

interface IResearchScholar {
    public void teaches(String str);
    public void studies(String str);
}

abstract class JuniorRS implements IResearchScholar {
    public void studies(String str1) {
        System.out.println("TA studies " + str1);
    }
}

class SeniorRS extends JuniorRS {
    public void teaches(String str) {
        System.out.println("TA teaches " + str);
    }
}

public class InterAbstrTest extends SeniorRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        JuniorRS jrs = new InterAbstrTest();
        SeniorRS srs = new InterAbstrTest();

        jrs.studies(str1);
        srs.studies(str2);
        srs.teaches(str2);

        sc.close();
    }
}

```
