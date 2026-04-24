package Academics.iitm_bs_diploma_2025.Questions.Oppe2.mar_2025;

// Q4 - Classes, Interfaces & Collections

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the Taxable interface
interface Taxable {
    double calculateTax();
}

// Define the Product class
abstract class Product implements Taxable {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return 0.01 * price;
    }

    public String getName() {
        return name;
    }
}

// Define the Electronics class
class Electronics extends Product {

    Electronics(String name, double price) {
        super(name, price);
    }
}

// Define the Book class
class Book extends Product {
    Book(String name, double price) {
        super(name, price);
    }
}

// Define the Test class
public class Q4_Test {
    // Define the findMaxTax method
    public static <T extends Taxable> double findMaxTax(List<T> obj) {
        double maxTax = 0;
        for (T data : obj) {
            double Tax = data.calculateTax();
            if (Tax > maxTax) {
                maxTax = Tax;
            }
        }
        return maxTax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for Electronics object
        int numElectronics = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        List<Electronics> eList = new ArrayList<>();
        for (int i = 0; i < numElectronics; i++) {
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            eList.add(new Electronics(name, price));
        }

        int numBooks = scanner.nextInt(); // no of books
        scanner.nextLine(); // Consume newline

        List<Book> bList = new ArrayList<>();
        for (int i = 0; i < numBooks; i++) {
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            bList.add(new Book(name, price));
        }

        // Find and print maximum tax for Electronics and Books
        System.out.println(findMaxTax(eList));
        System.out.println(findMaxTax(bList));

        scanner.close();
    }
}