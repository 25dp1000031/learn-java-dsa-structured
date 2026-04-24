package Academics.iitm_bs_diploma_2025.Questions.Oppe2.mar_2025;

// Exceptions - Q3

import java.util.Scanner;

public class Q3_Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] inputArray = new int[n];

        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        ArrayChecker arrayChecker = new ArrayChecker(inputArray);
        try {
            arrayChecker.checkForOddNumbers();
        } catch (OddNumberException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}

// Define the OddNumberException class
class OddNumberException extends Exception {
    // override to string
    public String toString() {
        return "Odd number found";
    }
    // OddNumberException(String message) {
    // super(message);
    // }

}

class ArrayChecker {
    private int[] numArr;

    public ArrayChecker(int[] numArr) {
        this.numArr = numArr;
    }

    // Define the checkForOddNumbers method
    public void checkForOddNumbers() throws OddNumberException {
        for (int i : numArr) {
            if (i % 2 != 0) {
                throw new OddNumberException();
            }
        }
        System.out.println("No odd numbers found.");
    }

}
