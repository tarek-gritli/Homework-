public class Teacher extends Person implements Park,Teach{
    private int teacherId;
    private Subject subject;

    public Teacher(String name, String address, int phoneNumber, int teacherId,String email, Subject subject) {
        super(name, address, phoneNumber,email);
        this.teacherId = teacherId;
        this.subject = subject;
    }
    public int getTeacherId() {return teacherId;}
    public void setTeacherId(int teacherId) {this.teacherId = teacherId;}
    public Subject getSubject() {return subject;}
    public void setSubject(Subject subject) {this.subject = subject;}
    public void park(Parking p)
    {
        if(!p.isFull())
        {
            System.out.println("Teacher "+getName()+" parking in "+p.getName());
            p.setAvailable(p.getAvailable()-1);
        }
        else{
            System.out.println("Parking is full");
        }
    }
    public void giveCourse(LectureHall l,Course c) {
        System.out.println("Teacher "+getName()+" is giving "+c.getCourseName()+" course in Lecture Hall "+l.getLectureHallId());
    }
    public void giveInteractiveCourse(LectureHall l,Course c)
    {
        if(l.getProjector())
        {
            System.out.println("Teacher "+getName()+" is giving an interactive course of "+c.getCourseName()+" in Lecture Hall "+l.getLectureHallId());
        }
    }

}   

