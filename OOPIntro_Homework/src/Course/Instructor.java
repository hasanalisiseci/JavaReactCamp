package Course;

public class Instructor {
    int id;
    String firstName;
    String lastName;
    String graduationSchool;

    public Instructor() {
        System.out.println("Instructor object created but property not assigned");
    }

    public Instructor(int id, String firstName, String lastName, String graduationSchool) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationSchool = graduationSchool;
    }
}
