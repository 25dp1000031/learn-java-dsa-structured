package Java.UnderstandingBackendUsingSpringBoot.WhyAndWhatsOfSpringBoot.Jackson;

public class jackson {
    public static void main(String[] args) {
        Student s = new Student("aayush", "akukade10@gmail.com");
        System.out.println(s);
        // here this will print an object and not the getters
        // but while i will not be able to show it here
        // in the springboot webapps a jackson internally simply serializes all of the
        // getters
        // and simply return the getters
        // so in springboot it would rather than printing an object
        // it will rather print the actual content of the object via getters

    }
}

class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}