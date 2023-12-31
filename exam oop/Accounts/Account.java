package Accounts;
public abstract class Account {
    protected String username;
    protected String password;
    protected String email;
    public Account(String username,String password,String email)
    {
        this.username=username;
        this.password=password;
        this.email=email;
    }
    //getters and setters
    public String getUsername(){return username;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public void setUsername(String u){username=u;}
}
