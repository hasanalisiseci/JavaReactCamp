package Inheritance_Homework;

public class Student extends User{
    private String[] registeredCourses;
    private int registerCoursesCount;

    public Student(int id, String fullName, String mailAddress, String[] registeredCourses) {
        super(id, fullName, mailAddress);
        this.registeredCourses = registeredCourses;
        this.registerCoursesCount = registeredCourses.length;
    }

    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public int getRegisterCoursesCount() {
        return registerCoursesCount;
    }

    public void setRegisterCoursesCount(int registerCoursesCount) {
        this.registerCoursesCount = registerCoursesCount;
    }

}
