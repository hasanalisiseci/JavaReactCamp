package Course;

public class Course {
    int id;
    String name;
    String codeLangUsed;
    Instructor instructor;
    int progressLevel;


    public Course() {
        System.out.println("Course object created but property not assigned");
    }

    public Course(int id, String name, String codeLangUsed, Instructor instructor) {
        this.id = id;
        this.name = name + " (" + codeLangUsed + ")";
        this.codeLangUsed = codeLangUsed;
        this.instructor = instructor;
        this.progressLevel = 0;
    }
}
