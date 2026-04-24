// Q1 - Streams

// Write a Java program that, given as input title,publication year, and number of citations of some research articles, prints the filtered stream as per the conditions mentioned in method articleProcessor

/*
Method articleProcessor should take an ArrayList of ResearchArticle objects as input and return a filtered stream of recent and highly cited articles. 

The criteria for filtering are:
The article should be published as per the condition: (2023 - publication year ≤ 3)
The article should have more than 100 citations
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

class ResearchArticle {
    private String title;
    private int publicationYear;
    private int numCitations;

    public ResearchArticle(String title, int publicationYear, int numCitations) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.numCitations = numCitations;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumCitations() {
        return numCitations;
    }

    public String toString() {
        return "Title: " + title + ", Year: " + publicationYear + ", Citations: " + numCitations;
    }

    // complete the articleProcessor Method
    
    
}

class StreamTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ResearchArticle> articles = new ArrayList<>();

        System.out.println("Enter the number of research articles you want to input:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for article " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();  // title
            int year = scanner.nextInt();  // pub year
            int citations = scanner.nextInt();     // no fo citation
            scanner.nextLine(); // Consume the newline

            articles.add(new ResearchArticle(title, year, citations));
        }

        // Process the articles and display the filtered results
        Stream<ResearchArticle> filteredArticles = ResearchArticle.articleProcessor(articles);

        System.out.println("\nFiltered Articles (Recent and Highly Cited):");
        filteredArticles.forEach(System.out::println);

        scanner.close();
    }
}


