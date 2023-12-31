package Interfaces;
import Shopping_Cart.ShoppingCart;
import Orders.Order;
import Product_Categories.*;
import Inventory.Inventory;
import Payment.Payment;
import java.util.Scanner;
public class UserInterface {
    //initiate customer's menu
    public void run(String username,Inventory inventory)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        ShoppingCart cart=new ShoppingCart();
        System.out.println("Hello Mr/Mrs "+username);
        do
        {
            System.out.println("1- View Products");
            System.out.println("2- Search Products");
            System.out.println("3- Filter Products");
            System.out.println("4- View Cart");
            System.out.println("5- Add to Cart");
            System.out.println("6- Remove from Cart");
            System.out.println("7- Clear cart");
            System.out.println("8- Place Order");
            System.out.println("9- Log Out");
            System.out.println("Enter your choice: ");
            if(sc.hasNextInt())
            {
                choice = sc.nextInt();
                sc.nextLine();
            }
            else choice=9;
            switch(choice)
            {
                case 1: viewProducts(inventory);break;
                case 2: searchProducts(username,inventory);break;
                case 3: filterProducts(username,inventory);break;
                case 4: viewCart(cart);break;
                case 5: addToCart(cart,inventory);break;
                case 6: removeFromCart(cart);break;
                case 7: clearCart(cart);break;
                case 8: placeOrder(username,cart);break;
                case 9: System.out.println("Thank you for visiting Mr/Mrs "+username+" !");break;
                default: System.out.println("Invalid Choice");break;
            }
        } while(choice!=9);
        //return to user authentication menu because customer logged out
        UserAuthentication ua=new UserAuthentication();
        ua.runUserAuthentication(inventory);
        
    }
    //view products in inventory
    public void viewProducts(Inventory inventory)
    {
        int page=1;
        int i=0;
        for(Product p:inventory.getInventory())
        {
            if(i%4==0)
            {
                System.out.println("Showing page "+page);
                i++;
                page++;
            }
            System.out.println(p.toString());
        }

    }
    //search for products by name or id
    public void searchProducts(String username,Inventory inventory)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Search Menu:");
        System.out.println("1- Search for product by name");
        System.out.println("2- Search for product by id");
        System.out.println("3- Quit");
        System.out.println("Enter your choice: ");
        if(sc.hasNextInt())
        {
            choice = sc.nextInt();
            sc.nextLine();
        }
        else choice=3;
        Product p;
        switch(choice)
        {
            case 1 : 
                System.out.println("Enter Product name: ");
                String productName=sc.nextLine();
                p=inventory.searchByNameId("", productName);
                if(p!=null)
                {
                    System.out.println(p.toString());
                }
                else{
                    System.out.println("No such product found!");
                }
                break;
            case 2:
                System.out.print("Enter product ID: ");
                String pid=sc.nextLine();
                p=inventory.searchByNameId(pid,"");
                if(p!=null)
                {
                    System.out.println(p.toString());
                }
                else{
                    System.out.println("No such product found!");
                }
                break;
            case 3 : 
                System.out.println("You exited!\nGoodbye!");
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        //return to customer's menu
        UserInterface ui=new UserInterface();
        ui.run(username, inventory);
        
    }
    //filter products by category,price range or brand
    public void filterProducts(String username,Inventory inventory)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Filter Options:");
        System.out.println("1- Filter by Category");
        System.out.println("2- Filter by Price");
        System.out.println("3- Filter by Brand");
        System.out.println("4- Quit!");
        System.out.println("Enter your choice: ");
        if(sc.hasNextInt())
        {
            choice = sc.nextInt();
            sc.nextLine(); //consume new line character
        }
        else choice=4;
        switch(choice)
        {
            case 1 : 
                System.out.println("Enter Category: ");
                String category=sc.nextLine();
                inventory.filterByCategory(category);
                break;
                
            case 2:
                System.out.print("Enter Min price: ");
                double minPrice=sc.nextDouble();
                sc.nextLine(); //consume new line character
                System.out.println("Enter Max price: ");
                double maxPrice=sc.nextDouble();
                sc.nextLine(); //consume new line character
                inventory.filterByPrice(minPrice,maxPrice);
                break;
            case 3 : 
                System.out.println("Enter Brand: ");
                String brand=sc.nextLine();
                inventory.filterByBrand(brand);
                break;
            case 4:
                System.out.println("You exited!\nGoodbye!");
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        //return to customer's menu
        UserInterface ui=new UserInterface();
        ui.run(username, inventory);
        
    }
    //display customer's shopping cart
    public void viewCart(ShoppingCart cart)
    {
        cart.printCart();
    }
    //add desired quantity to customer's shopping cart
    public void addToCart(ShoppingCart cart,Inventory inventory)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which Product do you want to add to your cart or update its quantity?");
        //it will ask for product id and product name because not all users know id of product
        System.out.println("Enter Product id (Leave empty if you do not know): ");
        String productId=sc.nextLine();
        System.out.println("Enter Product name: ");
        String productName=sc.nextLine();
        Product p=inventory.searchByNameId(productId, productName);
        if(p!=null)
        {
            System.out.println("How much do you want to add?");
            int quantity = sc.nextInt();
            sc.nextLine(); //consume new line character
            cart.addToCart(p, quantity);
        }
        else
        {
            System.out.println("Product not found!");
            System.out.println("Please Try Again!");
        }
        
    }
    //remove desired quantity from user's shopping cart
    public void removeFromCart(ShoppingCart cart)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which Product do you want to remove from your cart or update its quantity?");
        System.out.println("Enter Product id: ");
        String productId=sc.nextLine();
        Product p=cart.searchForProduct(productId);
        if(p!=null)
        {
            System.out.println("How much do you want to remove?");
            int quantity = sc.nextInt(); //consume new line character
            sc.nextLine();
            cart.removeFromCart(p, quantity);
        }
        else
        {
            System.out.println("Product not found!");
            System.out.println("Please Try Again!");
        }
        
    }
    //clear customer's shopping cart
    public void clearCart(ShoppingCart cart)
    {
        cart.clearCart();
    }
    //initiate payment process
    public void placeOrder(String username,ShoppingCart cart)
    {
        if(cart.cartIsEmpty())
        {
            System.out.println("Cart is empty!");
            return;
        }
        Order order=new Order(cart, username);
        Payment payment = new Payment(order);
        payment.pay();
    }
}
