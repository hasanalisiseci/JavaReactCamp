package Inheritance_Homework;

public class StudentManager extends UserManager {
    public void registeredCoursList(Student student) {
        System.out.printf("The courses the student with the %s id is enrolled in:\n", student.getId());
        for (String course: student.getRegisteredCourses()) {
            System.out.println(course);
        }
    }
}
