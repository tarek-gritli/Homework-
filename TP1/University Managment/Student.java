import java.util.ArrayList;



public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    Student(int id,String fname,String lname)
    {
        studentId=id;
        firstName=fname;
        lastName=lname;
        courses=new ArrayList<>();
    }
    public int getStudentId()
    {
        return this.studentId;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }
    public void enroll (Course course)
    {
        courses.add(course);
    }
}
