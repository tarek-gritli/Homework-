package Payment;
import Orders.*;
import java.util.Scanner;
public class Payment {
    private Order order;
    private boolean success=false;
    public Payment(Order order)
    {
        this.order=order;
    }
    
    //simulate payment process
    public void pay()
    {
        chooseShippingMethod();
        applyDiscount();
        int choice;
        System.out.println("Choose payment method: ");
        System.out.println("1- Credit Card");
        System.out.println("2- PayPal");
        System.out.println("3- Cancel");
        System.out.print("Choice: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            choice=sc.nextInt();
            sc.nextLine();
        }
        else choice=3;
        switch(choice)
        {
            case 1: creditCardProcess();break;
            case 2: paypalProcess();break;
            case 3: System.out.println("You cancelled Payment");success=false;break;
            default: System.out.println("Invalid Choice!");break;
        }
        if(success)
        {
            System.out.println("Payment Successful: ");
            order.printOrder();
        }
    }
    //various shipping methods and additional shipping fees
    public void chooseShippingMethod() {
        int shippingChoice;
        System.out.println("Choose shipping method: ");
        System.out.println("1- Standard Shipping, Fees: 24.99");
        System.out.println("2- Express Shipping, Fees: 34.99");
        System.out.println("3- Same Day Delivery, Fees: 54.99");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            shippingChoice=sc.nextInt();
            sc.nextLine();
        }
        else shippingChoice=1;
        String shippingMethod = "";
        double shippingFees=24.99;
        switch (shippingChoice) {
            case 1:
                shippingMethod = "Standard Shipping";
                shippingFees=24.99;
                break;
            case 2:
                shippingMethod = "Express Shipping";
                shippingFees=34.99;
                break;
            case 3:
                shippingMethod = "Same Day Delivery";
                shippingFees=54.99;
                break;
            default:
                shippingMethod="Standard Shipping";
                shippingFees=24.99;
                break;
        }

        if (!shippingMethod.equals("")) {
            System.out.println("Shipping Method: " + shippingMethod);
            System.out.println("Additional fees: "+shippingFees);
            order.setTotalPrice(order.getTotalPrice()+shippingFees);
        }else shippingMethod="Standard Shipping";
    }
    //apply discounts if the customer knows any coupon codes
    public void applyDiscount()
    {
        Scanner sc=new Scanner(System.in);
        Discounts d=new Discounts();
        String code;
        System.out.println("Enter Coupon Code: ");
        if (sc.hasNextLine()) {
            code = sc.nextLine();
    
            if (d.isValidDiscount(code)) {
                double discount = d.getDiscount(code);
                double oldPrice=order.getTotalPrice();
                System.out.println(discount/100);
                double discountedPrice=oldPrice*(discount/100);
                double newPrice=oldPrice-discountedPrice;
                String oldPriceFormatted = String.format("%.2f", oldPrice).replace(',', '.'); //rounding oldprice and keeping only 2 decimals after ,
                String newPriceFormatted = String.format("%.2f", newPrice).replace(',', '.'); //rounding newprice and keeping only 2 decimals after ,
                System.out.println("Congrats!\nDiscount of "+discount+"% applied!");
                System.out.println("Old price: "+oldPriceFormatted);
                System.out.println("New price after discount: "+ newPriceFormatted);
                order.setTotalPrice(Double.parseDouble(newPriceFormatted)); //setting total of order to newprice formatted(2 decimals after , )
            }
            else 
            {
                System.out.println("Invalid discount code!");
            }
        } 
        else 
        {
            System.out.println("No coupon code entered!");
        }
    }
    //pay by credit card
    public void creditCardProcess()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your credit card information: ");
        System.out.println("Card Number: ");
        String cardNumber = sc.nextLine();
        System.out.println("Name on the Card: ");
        String nameOnTheCard=sc.nextLine();
        System.out.println("Expiry date: ");
        String date=sc.nextLine();
        success=!cardNumber.equals("") && !date.equals("") && !nameOnTheCard.equals("");
    }
    //pay by paypal
    public void paypalProcess()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your paypal account information: ");
        System.out.println("Card Number: ");
        String cardNumber = sc.nextLine();
        System.out.println("Name on the Card: ");
        String nameOnTheCard=sc.nextLine();
        System.out.println("Expiry date: ");
        String date=sc.nextLine();
        System.out.println("Email: ");
        String email=sc.nextLine();
        success= !cardNumber.equals("") && !nameOnTheCard.equals("") && !date.equals("") && !email.equals("");
    }

}
