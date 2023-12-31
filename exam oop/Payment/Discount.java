package Payment;

public class Discount {
    private String code;
    private int discountRate;
    public Discount(String code,int discountRate)
    {
        this.code=code;
        this.discountRate=discountRate;
    }
    public String getCode(){return code;}
    public int getDiscountRate(){return discountRate;}
}
