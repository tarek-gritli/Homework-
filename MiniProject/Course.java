public class Course extends Subject{
    private String courseName;
    private int volH;
    private int credits;
    public Course(String Subjectname,String courseName,int volH,int credits)
    {
        super(Subjectname);
        this.courseName=courseName;
        this.credits=credits;
        this.volH=volH;
    }
    public String getCourseName() {return courseName;}
    public int getVolH() {return volH;}
    public int getCredits() {return credits;}
    public void setVolH(int volH) {this.volH = volH;}
    public void setCourseName(String c) {courseName=c;}
    public void setCredits(int credits) {this.credits = credits;}
    public String toString()
    {
        return "Course "+getCourseName()+"{hourly volume: "+getVolH()+",credits: "+getCredits()+"}";
    }
}
