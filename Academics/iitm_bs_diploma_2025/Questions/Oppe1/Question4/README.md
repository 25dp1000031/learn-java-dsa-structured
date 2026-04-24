# Problem Statement

```text
Complete the Java program that takes as input 4 Shop objects and the list of Shop objects
with attributes: shop name, and number of items sold (nsold). 

The program should:
• Add each shop name as a key and the number of items sold as a value to a map.
• After adding all objects to the map, display the shop name that has sold the maximum number of items.

Requirements:

• Class Shop:
  – Private instance variables: String name, int nsold
  – Constructor to initialize the name and nsold
  – Accessor methods for all instance variables

• Class MapTest:
  – Define method:
    public static void printShopName(ArrayList<Shop> sList)
    that:
    ∗ Iterates over sList and populates a Map with shop names and their total items sold.
    ∗ Prints the shop name with the maximum total items sold.

  – The main method:
    ∗ Creates a list of 4 Shop objects (input from user).
    ∗ Calls printShopName(list) to determine and print the top-selling shop.

```

## Question

```java
import java.util.*;

class Shop {
    private String name;
    private int nsold;

    public Shop(String s, int ns) {
        this.name = s;
        this.nsold = ns;
    }

    public String getName() {
        return name;
    }

    public int getItemSold() {
        return nsold;
    }
}

public class MapTest {
    public static void printShopName(ArrayList<Shop> sList) {
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        String shop = "";
        int sold = 0;

        // Write your code here

        System.out.println(shop + " : " + sold);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> list = new ArrayList<Shop>();
        for (int i = 0; i < 4; i++) {
            list.add(new Shop(sc.next(), sc.nextInt()));
        }
        printShopName(list);
    }
}

```

## Input/Output

```text
Public test case 1:
Input:
SuperBazar 30
More 40
Shopsy 30
More 30

Output:
More : 70

Public test case 2:
Input:
Lulu 40
Lulu 34
DLF 54
DLF 67

Output:
DLF : 121

Private test case 1:
Input:
HiLITE 56
Sarath-City 40
Z-Square 54
World-Trade 43

Output:
HiLITE : 56

Private test case 2:
Input:
Mantri-Square 56
Mantri-Square 76
Mantri-Square 11
Phoenix 590

Output:
Phoenix : 590

```

## Solution

```java
import java.util.*;

class Shop {
    private String name;
    private int nsold;

    public Shop(String s, int ns) {
        this.name = s;
        this.nsold = ns;
    }

    public String getName() {
        return name;
    }

    public int getItemSold() {
        return nsold;
    }
}

public class MapTest {
    public static void printShopName(ArrayList<Shop> sList) {
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        String shop = "";
        int sold = 0;

        for (Shop s : sList) {
            m.put(s.getName(), m.getOrDefault(s.getName(), 0) + s.getItemSold());
        }

        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() > sold) {
                shop = entry.getKey();
                sold = entry.getValue();
            }
        }

        System.out.println(shop + " : " + sold);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> list = new ArrayList<Shop>();
        for (int i = 0; i < 4; i++) {
            list.add(new Shop(sc.next(), sc.nextInt()));
        }
        printShopName(list);
    }
}

```
