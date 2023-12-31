package App;
import Interfaces.*;
import Inventory.*;
public class App {
    public void runApp()
    {
        Inventory inventory=new Inventory();
        UserAuthentication ua=new UserAuthentication();
        ua.runUserAuthentication(inventory);
    }
}
