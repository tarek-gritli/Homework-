package Payment;
import java.util.ArrayList;
public class Discounts {
    private ArrayList<Discount> discountCodes;
    //intitialize the list of discounts
    public Discounts()
    {
        discountCodes = new ArrayList<>();
        Discount c1=new Discount("HAPPY2024", 30);
        Discount c2=new Discount("NEW", 10);
        Discount c3=new Discount("TUNISIA",10);
        Discount c4 = new Discount("SALE50", 50);
        Discount c5 = new Discount("SALES", 70);
        discountCodes.add(c1);
        discountCodes.add(c2);
        discountCodes.add(c3);
        discountCodes.add(c4);
        discountCodes.add(c5);
    }
    //check if discount code is valid
    public boolean isValidDiscount(String code)
    {
        for(Discount discount:discountCodes)
        {
            if(code.equals(discount.getCode())) return true;
        }
        return false;
    }
    //return discount rate of a given code
    public int getDiscount(String code)
    {
        for(Discount discount:discountCodes)
        {
            if(code.equals(discount.getCode())) return discount.getDiscountRate();
        }
        return 0;
    } 

}
