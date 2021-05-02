package Inheritance_Homework;

public class InstructorManager extends UserManager{
    public void offeredCoursesList(Instructor instructor) {
        System.out.printf("Courses given by the %s instructor:\n", instructor.getFullName());
        for (String course: instructor.getCoursesOffered()) {
            System.out.println(course);
        }
    }

    public void certificatesList(Instructor instructor) {
        System.out.printf("Certificates owned by the %s instructor\n", instructor.getFullName());
        for (String certificate: instructor.getCertificates()) {
            System.out.println(certificate);
        }
    }
}
