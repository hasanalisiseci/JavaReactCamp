package Course;

public class CourseManager {

    public void registerCourse(Course course) {
        String instructorName = course.instructor.firstName + " " + course.instructor.lastName;
        System.out.printf("\nYour registration to the course named %s by the instructor named %s has been completed.\n", course.name, instructorName);
        System.out.printf("Your progress level = %s%%  \n", course.progressLevel);
    }
}
