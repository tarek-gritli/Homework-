package Interfaces;
import java.util.Scanner;
import Accounts.*;
import Product_Categories.*;
import Inventory.Inventory;
public class AdminInterface {
    //initialize interface and present menu
    public void run(String username,Inventory inventory)
    {
        System.out.println("Greetings, sir! Wishing you a wonderful day, Mr." + username + "!");
        int choice;
        Scanner sc=new Scanner(System.in);
        CustomerAccounts customers=new CustomerAccounts();
        do
        {
            System.out.println("1- View Products");
            System.out.println("2- Add Product To Inventory");
            System.out.println("3- Update Product");
            System.out.println("4- Delete Product From Inventory");
            System.out.println("5- Clear Inventory");
            System.out.println("6- Check low-stock products");
            System.out.println("7- Check out-of-stock products");
            System.out.println("8- Send ads to customers");
            System.out.println("9- Log Out");
            System.out.print("Enter your choice: ");
            if(sc.hasNextInt())
            {
                choice=sc.nextInt();
                sc.nextLine(); //consume new line character
            }
            else choice=9;
            switch(choice)
            {
                case 1:
                    //display products in inventory 
                    for(Product p:inventory.getInventory())
                    {
                        System.out.println(p.toString());
                    }
                    break;
                case 2:
                    //add product to inventory based on category
                    chooseCategoryAndAdd(username,inventory);
                    break;
                case 4:
                    //delete product from inventory
                    delete(inventory);
                    break;
                case 3:
                    //update price of product in inventory
                    updateInventory(inventory);
                    break;
                case 5:
                    //clear inventory
                    inventory.clearInventory();
                    break;
                case 6:
                    //check low-stock products and print them
                    inventory.checkLowStock();
                    break;
                case 7:
                    //check out-of-stock products and print them
                    inventory.checkOutOfStock();
                    break;
                case 8:
                    //send ads to customers' emails
                    sendAds(customers);
                    break;
                case 9:
                    //log out
                    System.out.println("Logging Out!");
                    break;
                default: 
                    System.out.println("Invalid Choice! Please Enter Again.");
                    break;
            }
        } while(choice!=9);
        //if you log out you will be redirected to userAuthentication menu 
        UserAuthentication ua=new UserAuthentication();
        ua.runUserAuthentication(inventory);
    }
    public void chooseCategoryAndAdd(String username,Inventory inventory)
    {
        int choice;
        do{
            System.out.println("Which category?");
            System.out.println("1- Books");
            System.out.println("2- Electronics");
            System.out.println("3- Clothing");
            System.out.println("4- Home Appliances");
            System.out.println("5- Office Supplies");
            System.out.println("6- Pet Supplies");
            System.out.println("7- Security");
            System.out.println("8- Video Games");
            System.out.println("9- Return to main menu");
            System.out.print("Your choice: ");
            Scanner sc=new Scanner(System.in);
            if(sc.hasNextInt())
            {
                choice=sc.nextInt();
                sc.nextLine(); //consume new line character
            }
            else choice=9;
            switch(choice)
            {
                case 1 : 
                    Books b=Books.makeBook();
                    inventory.addProduct(b);
                    break;
                case 2:
                    //menu for electronics products since there are types within electronics
                    int choice2;
                    do{
                        System.out.println("Electronics Category:");
                        System.out.println("1- Camera");
                        System.out.println("2- Smartphone");
                        System.out.println("3- TV");
                        System.out.println("4- Laptop");
                        System.out.println("5- Headphones");
                        System.out.println("6- Return to categories menu");
                        System.out.println("Your choice: ");
                        if(sc.hasNextInt())
                        {
                            choice2 = sc.nextInt();
                            sc.nextLine(); //consume new line character
                        }
                        else choice2=6;
                        switch(choice2)
                        {
                            case 1: 
                                Camera c=Camera.makeCamera();
                                inventory.addProduct(c);
                                break;
                            case 2:
                                Smartphone s=Smartphone.makeSmartphone();
                                inventory.addProduct(s);
                                break;
                            case 3:
                                TV tv=TV.makeTV();
                                inventory.addProduct(tv);
                                break;
                            case 4:
                                Laptop l=Laptop.makeLaptop();
                                inventory.addProduct(l);
                                break;
                            case 5:
                                Headphones h=Headphones.makeHeadphones();
                                inventory.addProduct(h);
                                break;
                            case 6:
                                System.out.println("Returning to categories menu!");
                                break;
                            default:
                                System.out.println("Invalid Choice!\nPlease Try Again!");
                                break;
                        }
                    }while(choice2!=6);
                    break;
                case 3:
                    Clothing c=Clothing.makeClothing();
                    inventory.addProduct(c);
                    break;
                case 4:
                    HomeAppliances ha=HomeAppliances.makeHomeAppliances();
                    inventory.addProduct(ha);
                    break;
                case 5:
                    OfficeSupplies os=OfficeSupplies.makeOfficeSupplies();
                    inventory.addProduct(os);
                    break;
                case 6:
                    PetSupplies ps=PetSupplies.makePetSupplies();
                    inventory.addProduct(ps);
                    break;
                case 7:
                    Security sec=Security.makeSecurity();
                    inventory.addProduct(sec);
                    break;
                case 8:
                    VideoGames vg=VideoGames.makeVideoGames();
                    inventory.addProduct(vg);
                    break;
                case 9:
                    System.out.println("Returning to main menu");
                    break;

            }
        } while(choice!=9);
        //return to main menu of admin interface
        AdminInterface ai=new AdminInterface();
        ai.run(username,inventory);
    }
    public void delete(Inventory inventory)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Product's id: ");
        String productID=sc.nextLine();
        inventory.removeProduct(productID);
    }
    //update product price in inventory based on product id 
    public void updateInventory(Inventory inventory)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product id: ");
        String productId = sc.nextLine();
        System.out.println("Enter new price: ");
        double price = sc.nextDouble();
        sc.nextLine(); //consume new line character
        inventory.update(productId,price);
    }
    //send ads to customers' emails
    public void sendAds(CustomerAccounts customers)
    {
        for(Customer c:customers.getCustomers())
        {
            System.out.println("Sending ads to: "+c.getEmail());
        }
    }
}
