import java.util.ArrayList;
public class Clubs {
    private String clubName;
    private String clubField;
    ArrayList<Student> members = new ArrayList<>();
    public Clubs(String name, String field) {
        this.clubName=name;
        this.clubField=field;
    }
    public String getClubName(){return clubName;}
    public String getClubField(){return clubField;}
    public void setClubName(String s){clubName=s;}
    public void setClubField(String s){clubField=s;}
    
}
