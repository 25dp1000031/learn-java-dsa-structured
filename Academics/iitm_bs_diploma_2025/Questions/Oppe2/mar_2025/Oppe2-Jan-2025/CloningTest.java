// Q1 - Cloning
import java.util.Scanner;

class Director implements Cloneable {
    private String name;
    private int experience;

    // Constructor to initialize Director
    public Director(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Overridden toString method
    public String toString() {
        return "Director: Name = " + name + ", Experience = " + experience + " years";
    }

    // Clone method for Director
    
}

class Movie implements Cloneable {
    private String title;
    private Director director;

    // Constructor to initialize Movie
    public Movie(String title, Director director) {
        this.title = title;
        this.director = director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    // Overridden toString method
    public String toString() {
        return "Movie: Title = " + title + ", " + director.toString();
    }

    // Clone method for Movie (deep copy)
    
}

public class CloningTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input for the first Movie object
            System.out.println("Enter movie title:");
            String title = scanner.nextLine();

            System.out.println("Enter director's name:");
            String directorName = scanner.nextLine();

            System.out.println("Enter director's experience (in years):");
            int directorExperience = scanner.nextInt();

            // Create the first Movie object using user input
            Director director = new Director(directorName, directorExperience);
            Movie m1 = new Movie(title, director);

            // Clone the first Movie object to create the second one
            Movie m2 = m1.clone();

            // Display original and cloned objects
            System.out.println("Original Movie: " + m1);
            System.out.println("Cloned Movie: " + m2);

            // Modify the cloned Movie object to demonstrate deep copying
            System.out.println("Enter new director's name for the cloned movie:");
            scanner.nextLine(); // Consume the leftover newline
            String newDirectorName = scanner.nextLine();

            System.out.println("Enter new director's experience (in years):");
            int newDirectorExperience = scanner.nextInt();

            // Update cloned Movie object's director
            m2.setDirector(new Director(newDirectorName, newDirectorExperience));

            // Display original and cloned objects after modification
            System.out.println("After modification:");
            System.out.println("Original Movie: " + m1);
            System.out.println("Cloned Movie: " + m2);
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning not supported: " + e.getMessage());
        }
    }
}