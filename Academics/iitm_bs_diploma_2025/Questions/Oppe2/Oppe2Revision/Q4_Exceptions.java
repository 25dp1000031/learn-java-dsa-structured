package Academics.iitm_bs_diploma_2025.Questions.Oppe2.Oppe2Revision;

import java.util.Scanner;

//DEFINE a user-defined exception: InvalidAgeException
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q4_Exceptions {
    // DEFINE method isEligibletoVote
    public static boolean isEligibletoVote(int age) throws InvalidAgeException {
        if (age > 18) {
            return true;
        } else {
            throw new InvalidAgeException("Invalid age to vote.");
        }
    }

    // DEFINE method isEligibletoWriteUPSC
    public static boolean isEligibletoWriteUPSC(int age) throws InvalidAgeException {
        if (age <= 32) {
            return true;
        } else {
            throw new InvalidAgeException("Invalid age to Write UPSC.");
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
            isEligibletoVote(age);
            isEligibletoWriteUPSC(age);
            System.out.println("Eligible to vote and to write UPSC");
        } catch (InvalidAgeException ie) {

            System.out.println(ie.getMessage());
        }
        sc.close();
    }
}