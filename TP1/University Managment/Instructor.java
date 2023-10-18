public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    Instructor(int id,String fname,String lname)
    {
        instructorId=id;
        firstName=fname;
        lastName=lname;
    }
    public int getInstructorId()
    {
        return this.instructorId;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }

}
