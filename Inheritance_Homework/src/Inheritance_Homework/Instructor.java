package Inheritance_Homework;

public class Instructor extends User {

    String[] coursesOffered;
    String[] certificates;

    public Instructor(int id, String fullName, String mailAddress, String[] coursesOffered, String[] certificates) {
        super(id, fullName, mailAddress);
        this.coursesOffered = coursesOffered;
        this.certificates = certificates;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }
}
