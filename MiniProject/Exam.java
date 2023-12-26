import java.util.ArrayList;
public class Exam {
    private double coeff;
    private String type;
    private String title;
    ArrayList<Teacher> teachers = new ArrayList<>();
    public Exam(double c,String ty,String t)
    {
        coeff=c;
        type=ty;
        title=t;
    }
    public double getCoeff(){return coeff;}
    public String getType(){return type;}
    public String getTitle(){return title;}
    public void setCoeff(double c){coeff=c;}
    public void setType(String t){type=t;}
    public void setTitle(String t){title=t;}
    //add teacher to the list of exam's teachers
    public void addTeacher(Teacher t){
        System.out.println("Teacher "+t.getName()+" added to exam "+getTitle()+" preparators");
        teachers.add(t);
    }
    public void removeTeacher(Teacher t)
    {
        if(teachers.contains(t))
        {
            teachers.remove(t);
            System.out.println("Teacher "+t.getName()+" removed from exam "+getTitle()+" preparators");
            return;
        }
        System.out.println("Teacher "+t.getName()+" is not in the list!");
    }
}
