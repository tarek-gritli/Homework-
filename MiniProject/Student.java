public class Student extends Person implements Park,ClubEnrollment,AttendCourses
{
    private int studentId;
    private String filiere;
    public Student(String name,int phoneNumber,String address,String email,int studentId,String filiere)
    {
        super(name,address,phoneNumber,email);
        this.studentId=studentId;
        this.filiere=filiere;
    }
    public int getStudentId() {return studentId;}
    public void setStudentId(int studentId) {this.studentId = studentId;}
    public String getFiliere() {return filiere;}
    public void setFiliere(String filiere) {this.filiere = filiere;}
    public void park(Parking p)
    {
        if(!p.isFull())
        {
            System.out.println("Student "+getName()+" parking in "+p.getName());
            p.setAvailable(p.getAvailable()-1);
        }
        else{
            System.out.println("Parking is full");
        }
    }
    public void enrollInClub(Clubs c)
    {
        if(c.members.contains(this))
        {
            System.out.println("Student "+this.getName()+" is already a member of club "+c.getClubName());
            return;
        }
        c.members.add(this);
        System.out.println("Student "+getName()+" enrolled in club "+c.getClubName());

    }
    public void unenrollFromClub(Clubs c)
    {
        if(c.members.contains(this))
        {
            System.out.println("Student "+ getName()+" removed from club "+c.getClubName());
            c.members.remove(this);
            return;
        }
        System.out.println("Student "+getName()+" not member of club "+c.getClubName());
    }
    public void attendLectureHall(LectureHall l)
    {
        System.out.println("Student "+getName()+" attending lecture hall "+l.getLectureHallId());
    }
    public void leaveLectureHall(LectureHall l)
    {
        System.out.println("Student "+getName()+" leaving lecture hall "+l.getLectureHallId());
    }

}