package Accounts;
import java.util.ArrayList;
public class CustomerAccounts {
    private ArrayList<Customer> customers=new ArrayList<>();
    //initialize customers
    public CustomerAccounts()
    {
        Customer c1=new Customer("user1", "pass1", "user1@gmail.com");
        Customer c2 = new Customer("user2", "pass2", "user2@gmail.com");
        Customer c3 = new Customer("user3", "pass3", "user3@gmail.com");
        Customer c4 = new Customer("user4", "pass4", "user4@gmail.com");
        Customer c5 = new Customer("user5", "pass5", "user5@gmail.com");
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
    }
    //return customers arraylist
    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }
    //add customer to customers ArrayList
    public void addCustomer(Customer c)
    {
        customers.add(c);
    }
    //check if a given username and password combination correspond to any customer
    public boolean isCustomer(String username,String password)
    {
        for(Customer a:customers)
        {
            if(a.getUsername().equals(username) && a.getPassword().equals(password)) return true;
        }
        return false;
    }
}
