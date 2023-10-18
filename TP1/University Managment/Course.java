public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    Course(int id,String name, Instructor instructor)
    {
        courseId=id;
        courseName=name;
        this.instructor=instructor;
    }
    public int getCourseId()
    {
        return this.courseId;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public Instructor getInstructor()
    {
        return this.instructor;
    }

}
