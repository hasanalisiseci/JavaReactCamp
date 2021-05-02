package Course;

public class Main {
   public static void main (String[] args)  {
       Instructor instructor1 = new Instructor(1,"Engin", "Demirog","METU");
       Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı","Java + React",instructor1);

       Instructor instructor2 = new Instructor(1,"Engin", "Demirog","METU");
       Course course2 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı","C# + Angular",instructor1);

       System.out.println("Courses");
       Course[] courses = {course1, course2};
       for (Course course:courses) {
           System.out.println(course.name);
       }


       CourseManager courseManager = new CourseManager();
       courseManager.registerCourse(course1);
       courseManager.registerCourse(course2);

       courseManager.progressToCourse(course1);
       courseManager.progressToCourse(course1);

   }
}
