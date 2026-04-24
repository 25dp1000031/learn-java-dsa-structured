# Java OPPE2 Question / PYQ (Jan 2025)

---

## Q1
### Problem Statement:  
Write a Java program that, given as input title, publication year, and number of citations of some research articles, prints the filtered stream as per the conditions mentioned in method `articleProcessor`. Complete the program as specified below.  

Class **ResearchArticle** has/should have the following members:  
- Private instance variables - **String title, int publicationYear,** and **int numCitations**  
- A constructor to initialize instance variables  
- Method **toString** to print in the format shown in the test cases  
- Accessor methods for **publicationYear** and **numCitations**  
- Method **articleProcessor** should take an **ArrayList** of **ResearchArticle** objects as input and return a filtered stream of recent and highly cited articles. The criteria for filtering are:  
  - The article should be published as per the condition: **(2023 - publication year ≤ 3)**  
  - The article should have more than **100 citations**  

Class **StreamTest** has the following members:  
- Method **main** creates an **ArrayList** of **ResearchArticle** objects by taking input in the order of **title, publicationYear,** and **numCitations** then invokes the method **articleProcessor** to filter articles and finally display those articles.  

#### What you have to do:  
- Define method **articleProcessor** in class **ResearchArticle**.  

---

## Q2
### Problem Statement:  
Complete the Java program to create two objects **m1** and **m2** of type **Movie**. **m2** should be created from **m1** using cloning such that any later changes to **m2** do not affect **m1**.  

Class **Director** implements **Cloneable** interface and has/should have the following members:  
- Instance variables **String name** and **int experience**  
- Constructor to initialize the instance variables  
- Mutator methods as needed  
- Overridden method **toString()**  
- Method **clone()**, to be implemented  

Class **Movie** implements **Cloneable** interface and has/should have the following members:  
- Instance variables **String title** and **obj** of type **Director**  
- Constructor to initialize the instance variables  
- Mutator methods as needed  
- Overridden method **toString()**  
- Method **clone()**, that achieves deep copy during cloning, to be implemented  

Class **CloningTest** contains the **main** method that takes the inputs and invokes appropriate methods to achieve the functionality.  

#### What you have to do:  
- Implement method **clone()** in class **Director**  
- Implement method **clone()** in class **Movie**  

---

## Q3  
### Problem Statement:  
Write a Java program that takes an integer array as input and throws a user-defined exception if any element in the array is an odd number.  

Define a checked exception **OddNumberException** as follows:  
- Override method **toString** to return the string **Odd number found** (to be printed if the array contains any odd number)  

Class **ArrayChecker** has the following members:  
- A private instance variable **numArr** of type array of **int**  
- A constructor that initializes the **numArr**  
- Method **checkForOddNumbers** that prints **No odd numbers found** if all the elements in **numArr** are even, otherwise, it should throw an **OddNumberException**  

Class **ExceptionTest** has the **main** method, which takes an integer array as input, creates an **ArrayChecker** object, and invokes **checkForOddNumbers** inside a **try-catch** block.  

#### What you have to do:  
- Implement the **OddNumberException** class  
- Implement the **checkForOddNumbers** method in **ArrayChecker**  

---

### **Q4**  
**Problem Statement:**  
Write a program that takes as input a list of **Electronics** objects and **Book** objects, and prints the highest tax among all the **Electronics** objects and **Book** objects.  

- Interface **Taxable** has method **public abstract double calculateTax();**  
- Class **Product** implements **Taxable**, and has the following members:  
  - Instance variables **name, price**  
  - Constructor to initialize instance variables  
  - Method **public double calculateTax()** that computes **0.01 * price** and returns it  
- Class **Electronics** is a child class of **Product**  
- Class **Book** is a child class of **Product**  
- Class **Test** has the following members:  
  - Method **findMaxTax** that has a single parameter that can hold either a list of **Electronics** objects or **Book** objects at a time and returns the highest tax of the objects in the list.  
  - Method **main()** takes as input two objects of **Electronics**, and two objects of **Book**, stores them in **eList** and **bList** respectively, invokes the method **findMaxTax** using both **eList** and **bList** separately, and prints the values returned by the method **findMaxTax**.  

#### **What you have to do:**  
- Define class **Electronics**  
- Define class **Book**  
- Define method **findMaxTax** in class **Test**  

