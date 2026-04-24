package Academics.iitm_bs_diploma_2025.Questions.Oppe2.jan_2024;

import java.util.Scanner;
import java.util.ArrayList;

//Define class PublicationYearOutOfBoundsException
class PublicationYearOutOfBoundsException extends Exception {
    public PublicationYearOutOfBoundsException(String t) {
        super("Publication year of \"" + t + "\" is outside the acceptable range");
    }
}

class Book {
    private String title;
    private int publicationYear;

    public Book(String t, int year) {
        title = t;
        publicationYear = year;
    }

    public String checkAndGetTitle() throws PublicationYearOutOfBoundsException {
        // Complete definition of method checkAndGetTitle
        if (publicationYear >= 2000 && publicationYear <= 2022) {
            return title;
        } else {
            throw new PublicationYearOutOfBoundsException(title);
        }
    }
}

public class Q2_Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Book b = new Book(sc.next(), sc.nextInt());
            bookList.add(b);
        }
        for (Book b : bookList) {
            try {
                String title = b.checkAndGetTitle();
                System.out.println(title);
            } catch (PublicationYearOutOfBoundsException pe) {
                System.out.println(pe.getMessage());
            }
        }
        sc.close();
    }
}