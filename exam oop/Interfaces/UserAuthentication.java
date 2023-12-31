package Interfaces;
import java.util.Scanner;
import Inventory.Inventory;
import Accounts.*;
public class UserAuthentication {
    //simulate sign in/sign up menu
    public void runUserAuthentication(Inventory inventory)
    {
        CustomerAccounts customers=new CustomerAccounts();
        AdminAccounts admins=new AdminAccounts();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Welcome!");
        System.out.println("1- Login");
        System.out.println("2- Sign up if you don't have an account!");
        System.out.println("3- Quit");
        System.out.print("Your choice: ");
        if(sc.hasNextInt())
        {
            choice=sc.nextInt();
            sc.nextLine();
        }
        else choice=3;
        switch (choice)
        {
            case 1: loginInterface(inventory,customers,admins);break;
            case 2: createAccount(inventory,customers);break;
            case 3: System.out.println("Thank you for visiting!");break;
            default: System.out.println("Invalid Choice!");break;
        }
        
    }
    //ask user to provide username and password and then verify credentials
    public void loginInterface(Inventory inventory,CustomerAccounts customers,AdminAccounts admins)
    {
        String username="";
        String password="";
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter your username: ");
            username=sc.nextLine();
            System.out.print("Enter your password: ");
            password=sc.nextLine();
        } while (username.isEmpty() && password.isEmpty());
        //check if it's an admin logging in
        if(admins.isAdmin(username,password))
        {
            //redirect admin to admin interface
            AdminInterface mi=new AdminInterface();
            mi.run(username,inventory);
        }
        //check if it's a customer logging in
        else if(customers.isCustomer(username, password))
        {
            UserInterface ui=new UserInterface();
            ui.run(username,inventory);
        }
        //wrong credentials
        else
        {
            System.out.println("Incorrect username or password!");
            UserAuthentication ua=new UserAuthentication();
            ua.runUserAuthentication(inventory); //redirect user to sign in / sign up page
        }
        
    }
    //create accounts for new users
    public void createAccount(Inventory inventory,CustomerAccounts customers)
    {
        String email="";
        String username="";
        String password="";
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter your email address: ");
            email=sc.nextLine();
            System.out.print("Enter username: ");
            username=sc.nextLine();
            System.out.print("Enter your password: ");
            password=sc.nextLine();
        } while (username.isEmpty() && password.isEmpty() && email.isEmpty());
        Customer acc=new Customer(username,password,email);
        //add customer to customers' arraylist
        customers.addCustomer(acc);
        System.out.println("Account created successfully!");
        //redirect customer to customer interface
        UserInterface ui=new UserInterface();
        ui.run(username,inventory);
        
    }
}
