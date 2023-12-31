package Shopping_Cart;
import Product_Categories.*;
import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private HashMap<Product, Integer> cart;
    public ShoppingCart() {
        cart = new HashMap<>();
    }
    //return hashmap
    public HashMap<Product,Integer> getCart()
    {
        return cart;
    }
    //check if cart is empty
    public boolean cartIsEmpty()
    {
        return cart.isEmpty();
    }
    //search for product in cart based on id
    public Product searchForProduct(String id)
    {
        for(Product p:cart.keySet())
        {
            if(p.getId().equals(id)) return p;
        }
        return null;
    }
    //add product to cart + updating quantity
    public void addToCart(Product p, int quantity) {
        if(p.getQuantity()==0)
        {
            System.out.println("This product is currently out of stock");
            return;
        }
        if (cart.containsKey(p)) {
            int existingQuantity = cart.get(p);
            if(existingQuantity+quantity>p.getQuantity())
            {
                System.out.println("You can only have "+p.getQuantity());
            }
            else cart.put(p, existingQuantity + quantity);
        } else {
            if(quantity>p.getQuantity())
            {
                System.out.println("You can only get "+p.getQuantity());
                cart.put(p,p.getQuantity());
                quantity=p.getQuantity();//if there were 10 books in inventory and the customer wants to order 80
                //it should be printing that 10 books added successfully to cart and not 80
                p.setQuantity(0);
            }
            else 
            {
                cart.put(p,quantity);
                p.setQuantity(p.getQuantity()-quantity);
            }
        }
        System.out.println(quantity + " " + p.toString() + " added successfully to cart");
    }
    //remove product from cart + updating quantity
    public void removeFromCart(Product p, int quantity) {
        if (cart.containsKey(p)) {
            int existingQuantity = cart.get(p);
            if (existingQuantity <= quantity) {
                cart.remove(p);
                p.setQuantity(existingQuantity); //reset the quantity of the product in inventory
                quantity=existingQuantity; //when printing in this case it should print quantity of product removed successfully from cart which is the existing quantity from before
            } else {
                cart.put(p, existingQuantity - quantity);
                p.setQuantity(quantity); //reset quantity of product in inventory
            }
            System.out.println(quantity + " " + p.toString() + " removed successfully from cart");
        } else {
            System.out.println("Product not found in cart");
        }
    }
    //total of cart
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product p : cart.keySet()) {
            totalPrice += p.getPrice() * cart.get(p);
        }
        return totalPrice;
    }
    //clear cart
    public void clearCart()
    {
        cart.clear();
        System.out.println("Cart cleared!");
    }
    //Printing the contents of the shopping cart
    public void printCart() {
        if(cart.isEmpty())
        {
            System.out.println("Cart is empty");
            return;
        }
        System.out.println("Contents of cart: ");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.toString() + " Quantity: " + quantity);
        }
    }
}