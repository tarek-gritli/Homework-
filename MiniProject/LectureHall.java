public class LectureHall {
    private int lectureHallId;
    private int capacity;
    private boolean hasProjector;

    public LectureHall(int id,int capacity,boolean hasP) {
        lectureHallId=id;
        this.capacity = capacity;
        hasProjector = hasP;
    }

    public int getLectureHallId() {return lectureHallId;}
    public void setLectureHallId(int lectureHallId) {this.lectureHallId = lectureHallId;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public boolean getProjector(){return hasProjector;}
    public void setProjector(boolean hasP){hasProjector=hasP;}
    public void giveCourses(Teacher teacher,Course c) {
        System.out.println("Teacher "+teacher.getName()+" is giving "+c.getCourseName()+" course in Lecture Hall "+getLectureHallId());
    }
    public void giveInteractiveCourse(Teacher t,Course c)
    {
        if(getProjector())
        {
            System.out.println("Teacher "+t.getName()+" is giving an interactive course of "+c.getCourseName()+" course in Lecture Hall "+getLectureHallId());
        }
    }
}