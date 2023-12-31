package Product_Categories;
import java.util.Scanner;
public class Security extends Product {
    //security products include: surveillance camera,sensors...
    private String brand;
    private String model;
    private int manufactureYear;
    private String manufactureCountry;
    //security products often have sensitivity
    //we will take sensitivity from a scale of 0 to 1 (0: low sensitivity,1: high sensitivity)
    private double sensitivity; 
    public Security(String id, String name, double price, String brand, String model, int manufactureYear, double sensitivity,String country,int q) {
        super(id, name, price,q);
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.sensitivity = sensitivity;
        this.manufactureCountry=country;
    }
    //it will serve for adding products in admin interface
    public static Security makeSecurity()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Security Product's id: ");
        String id=sc.nextLine();
        System.out.print("Enter Security Product's name: ");
        String name=sc.nextLine();
        System.out.print("Enter Security Product's price: ");
        double price =sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Security Product's quantity: ");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Security Product's model: ");
        String model=sc.nextLine();
        System.out.print("Enter Security Product's brand: ");
        String brand=sc.nextLine();
        System.out.print("Enter Security Product's manufacture year: ");
        int year=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Security Product's manufacture country: ");
        String country=sc.nextLine();
        System.out.print("Enter Security Product's sensitivity: ");
        double sensitivity=sc.nextDouble();
        sc.nextLine();
        Security s=new Security(id, name, price, brand, model, year, sensitivity,country,quantity);
        return s;
    }
    // getters and setters
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getManufactureYear() {return manufactureYear;}
    public void setManufactureYear(int manufactureYear) {this.manufactureYear = manufactureYear;}
    public double getSensitivity() {return sensitivity;}
    public void setSensitivity(double sensitivity) {this.sensitivity = sensitivity;}
    public String getManufactureCountry(){return manufactureCountry;}
    public void setManufactureCountry(String country){this.manufactureCountry=country;}
    public String toString() {
        return "Security Product ID: "+getId()+" ,Name: "+getName()+" ,Brand: "+getBrand() +
        "\nModel: "+getModel()+" ,Manufacture Year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+
        "\nSensitivity: "+getSensitivity()+"Price: "+getPrice();
    }
    public boolean equals(Security b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getManufactureCountry().equals(b.getManufactureCountry())
        && getManufactureYear()==b.getManufactureYear() && getModel().equals(b.getModel()) && getSensitivity()==b.getSensitivity();
    }
}