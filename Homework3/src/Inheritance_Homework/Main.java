package Inheritance_Homework;

public class Main {
    public static void main (String []args) {
        String[] student1RegisteredCourses = {"Java-React","Flutter"};
        Student student1 = new Student(1,"Hasan Ali Şişeci","h.alisiseci@gmail.com", student1RegisteredCourses);

        String[] instructor1OfferedCourse = {"Java-React","C#-Angular","Flutter","Python"};
        String[]  instructor1Certificates = {"Microsoft Certified Trainer (MCT)" ,"PMP", "ITIL"};
        Instructor instructor1 = new Instructor(1,"Engin Demirog","e.demirog@gmail.com",instructor1OfferedCourse,instructor1Certificates);

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        userManager.addUser(student1);
        userManager.addUser(instructor1);
        studentManager.registeredCoursList(student1);
        instructorManager.offeredCoursesList(instructor1);
        instructorManager.certificatesList(instructor1);
    }
}
