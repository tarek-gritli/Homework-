package Accounts;
import java.util.ArrayList;
public class AdminAccounts {
    private ArrayList<AdminAccount> admins = new ArrayList<>();
    //initialize admins 
    public AdminAccounts()
    {
        AdminAccount admin1=new AdminAccount("1111","admin1","admin1@gmail.com");
        AdminAccount admin2 = new AdminAccount("2222", "admin2", "admin2@gmail.com");
        AdminAccount admin3 = new AdminAccount("3333", "admin3", "admin3@gmail.com");
        AdminAccount admin4 = new AdminAccount("4444", "admin4", "admin4@gmail.com");
        AdminAccount admin5 = new AdminAccount("5555", "admin5", "admin5@gmail.com");
        admins.add(admin1);
        admins.add(admin2);
        admins.add(admin3);
        admins.add(admin4);
        admins.add(admin5);
    }
    //check if a given username and password correspond to any existing admin 
    public boolean isAdmin(String username,String password)
    {
        for(AdminAccount a:admins)
        {
            if(a.getUsername().equals(username) && a.getPassword().equals(password)) return true;
        }
        return false;
    }
}
