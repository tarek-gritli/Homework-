public class Test {
    public static void main(String[] args) {
        Student s1=new Student ("ahmed ahmed",94722586,"beb saadoun","ahmed@gmail.com",1,"GL2");
        Student s2=new Student("ali ali", 25487936, "marsa", "ali@gmail.com", 2, "RT3");
        Student s3=new Student("salah salah", 58963248, "manzah", "salah@gmail.com", 3, "MPI");
        Subject subj1=new Subject("Mathematics");
        Subject subj2=new Subject("Computer Science");
        Department dep1=new Department("Genie mathematique & informatique", null);
        Teacher t1=new Teacher("fatma", "address1", 12345678, 0, "email", subj1);
        dep1.setChef(t1);
        Teacher t2=new Teacher("Sana", "adr2", 87654321, 1, "email2", subj2);
        dep1.addTeacher(t2);
        LectureHall l1=new LectureHall(8, 150, true);
        LectureHall l2=new LectureHall(7, 150, false);
        Course c1 = new Course("Mathematics","Maths Signal",50,8);
        Course c2=new Course("Computer Science","OOP",55,9);
        t1.giveCourse(l2, c1);
        s3.attendLectureHall(l2);
        s3.leaveLectureHall(l2);
        t2.giveInteractiveCourse(l1, c2);
        s2.attendLectureHall(l1);
        Clubs club1=new Clubs("ACM","Competitive Programming");
        Clubs club2=new Clubs("Lions","Charity");
        s1.enrollInClub(club1);
        s2.enrollInClub(club2);
        s2.enrollInClub(club1);
        Parking p=new Parking("Parking A",278,1);
        s3.park(p);
        TimeSheet time=new TimeSheet("GL2");
        time.addCourse(c2);
        time.addCourse(c1);
        time.showTimeSheet();
        Exam e1=new Exam(4.5,"DS","Maths Signal");
        e1.addTeacher(t1);
        AdministrationEmployee ae1=new AdministrationEmployee("samir", null, 0, null, 2, "Headmaster");
        ae1.park(p);
    }
}