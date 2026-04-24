// Q4 - Classes, Interfaces & Collections

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the Taxable interface
interface Taxable {
    double calculateTax();
}

// Define the Product class



// Define the Electronics class


// Define the Book class



// Define the Test class
public class Test {
    // Define the findMaxTax method
    public static <T extends Taxable> double findMaxTax(List<T> productList){
        double maxTax = 0;
        for (T product : productList){
            double tax = product.calculateTax();
            if (tax > maxTax){
                maxTax = tax;
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