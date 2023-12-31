package Orders;
import Shopping_Cart.ShoppingCart;
import java.time.LocalDateTime;
public class Order {
    static int id=0;
    private ShoppingCart cart;
    private String user;
    private double totalPrice;
    private LocalDateTime orderTime; //will be useful to print the current time of the order
    public Order(ShoppingCart cart,String user)
    {
        this.cart=cart;
        this.user=user;
        orderTime = LocalDateTime.now();
        totalPrice=cart.getTotalPrice();
        id++;
    }
    //return order total
    public double getTotalPrice()
    {
        return totalPrice;
    }
    //this will be useful when dealing with discounts
    public void setTotalPrice(double price)
    {
        this.totalPrice=price;
    }
    //view ordered products
    public void printOrder()
    {
        System.out.println("Order ID: " + id);
        System.out.println("Customer: " + user);
        System.out.println("-----------------------------"); 
        cart.printCart();
        System.out.println("Total: " + getTotalPrice());
        System.out.println("Order time: " + orderTime);
    }
}
