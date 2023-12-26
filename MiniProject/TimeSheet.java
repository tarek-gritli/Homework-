import java.util.ArrayList;
public class TimeSheet implements ManageTimeSheet{
    ArrayList<Course> courses=new ArrayList<>();
    private String classConcerned;
    public TimeSheet(String classConcerned)
    {
        this.classConcerned=classConcerned;
    }
    public String getClassConcerned(){return classConcerned;}
    public void setClassConcerned(String c){classConcerned=c;}
    public void addCourse(Course c)
    {
        courses.add(c);
        System.out.println("Course "+c.getCourseName()+" added to timesheet of "+getClassConcerned());
    }
    public void removeCourse(Course c)
    {
        if(courses.contains(c))
        {
            courses.remove(c);
            System.out.println("Course "+c.getCourseName()+" removed from the timesheet of "+getClassConcerned());
            return;
        }
        System.out.println("Course "+c.getCourseName()+" not found in timesheet of "+getClassConcerned());
    }
    public void showTimeSheet()
    {
        if(courses.size()==0)
        {
            System.out.println("Timesheet empty");
            return;
        }
        System.out.println("Timesheet for class: "+getClassConcerned());
        for(Course c:courses)
        {
            System.out.println(c.toString());
        }
    }

}
