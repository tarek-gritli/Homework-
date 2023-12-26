import java.util.ArrayList;
public class Department {
    private String name;
    ArrayList<Teacher> teachers=new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>();
    private Teacher chef;
    public Department(String n,Teacher chef) {
        this.name = n;
        this.chef=chef;
    }
    public String getDepName(){return name;}
    public Teacher getChef(){return chef;};
    public void setChef(Teacher t){chef=t;}
    public void addTeacher(Teacher t)
    {
        teachers.add(t);
        System.out.println("teacher "+t.getName()+" assigned to department of "+getDepName());
    }
    public void removeTeacher(Teacher t)
    {
        if(teachers.contains(t))
        {
            teachers.remove(t);
            System.out.println("teacher "+t.getName()+" removed from department of "+getDepName());
            return;
        }
        System.out.println("teacher "+t.getName()+" not assigned to department of "+getDepName());
    }
    public void addSubject(Subject s)
    {
        subjects.add(s);
        System.out.println("subject "+s.getName()+" added to department of "+getDepName());
    }
    public void removeSubject(Subject s) {
        if (subjects.contains(s)) {
            subjects.remove(s);
            System.out.println("subject " + s.getName() + " removed from department of " + getDepName());
            return;
        }
        System.out.println("subject " + s.getName() + " not assigned to department of " + getDepName());
    }

}
