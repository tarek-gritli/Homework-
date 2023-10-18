import java.util.ArrayList;
import java.util.Scanner;

public class TestUni {
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
        System.out.print("le prénom de l'instructeur :");
        String instructorFirstName = Sc.nextLine();
        System.out.print("le nom de l'instructeur :");
        String instructorLastName = Sc.nextLine();
        System.out.print("l'id de l'instructeur :");
        int id = Sc.nextInt();
        Sc.nextLine();
        Instructor hamma= new Instructor(id, instructorFirstName, instructorLastName);
        System.out.print("le nom du cours :");
        String name = Sc.nextLine();
        System.out.print("l'id du cours :");
        int courseId = Sc.nextInt();
        Sc.nextLine();
        Course maths = new Course(courseId, name, hamma);
        Student hammadi = new Student(1,"hammadi","ben younes");
        hammadi.enroll(maths);
        Instructor lotfi = new Instructor (107,"lotfi","abdelltif");
        Course fr = new Course(105, "french", lotfi);
        hammadi.enroll(fr);
        ArrayList<Course> arr = hammadi.getCourses();
        System.out.println("Courses for: "+hammadi.getFirstName()+" : ");
        for(Course course :arr)
        {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Instructor: " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println();
        }


    }
}
