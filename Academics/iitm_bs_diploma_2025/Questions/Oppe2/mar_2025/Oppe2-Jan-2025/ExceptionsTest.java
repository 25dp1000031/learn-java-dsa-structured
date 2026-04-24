// Exceptions - Q3

import java.util.Scanner;

// Define the OddNumberException class
class OddNumberException extends Exception{
    // override to string

}


class ArrayChecker {
    private int[] numArr;

    public ArrayChecker(int[] numArr) {
        this.numArr = numArr;
    }

    // Define the checkForOddNumbers method
    public void checkForOddNumbers() throws OddNumberException{
        for (int num : numArr){
            if (num % 2 !=0){
                throw new OddNumberException();
            }
            System.out.println("No odd numbers found");
        }
    }
    
}

public class ExceptionsTest {
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
    

