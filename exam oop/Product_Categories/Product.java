package Product_Categories;
public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int quantity;
    //constructor
    public Product(String id, String name, double price,int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity=quantity;
    }
    //getters
    public String getId() {return id;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity(){ return  quantity;}
    //setters
    public void setId(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity){this.quantity=quantity;}
}