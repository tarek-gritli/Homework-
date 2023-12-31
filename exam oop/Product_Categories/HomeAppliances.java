package Product_Categories;

import java.util.Scanner;

public class HomeAppliances extends Product {

    private String brand;
    private String model;
    private int manufactureYear;
    private String manufactureCountry;
    //many home appliances have a capacity like the washing machine,its capacity is in (kg),the refrigertor is in (litres)...etc
    private double capacity; 
    public HomeAppliances(String id, String name, double price, String brand, String model, int manufactureYear, double capacity,String country,int q) {
        super(id, name, price,q);
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.capacity = capacity;
        this.manufactureCountry=country;
    }
    //this will serve for adding products in admin interface  
    public static HomeAppliances makeHomeAppliances() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Home Appliances Product's id:");
        String id = sc.nextLine();
        System.out.println("Enter Home Appliances Product's name:");
        String name = sc.nextLine();
        System.out.println("Enter Home Appliances Product's price:");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading price
        System.out.println("Enter Home Appliances Product's quantity:");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading quantity
        System.out.println("Enter Home Appliances Product's model:");
        String model = sc.nextLine();
        System.out.println("Enter Home Appliances Product's brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Home Appliances Product's manufacture year:");
        int year = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading year
        System.out.println("Enter Home Appliances Product's manufacture country:");
        String country = sc.nextLine();
        System.out.println("Enter Home Appliances Product's capacity:");
        double capacity = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading capacity
        HomeAppliances ha = new HomeAppliances(id, name, price, brand, model, year, capacity, country, quantity);
        return ha;
    }        
    //getters and setters
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getManufactureYear() {return manufactureYear;}
    public void setmanufactureYear(int manufactureYear) {this.manufactureYear = manufactureYear;}
    public double getCapacity() {return capacity;}
    public void setCapacity(double capacity) {this.capacity = capacity;}
    public String getManufactureCountry(){return manufactureCountry;}
    public void setManufactureCountry(String country){this.manufactureCountry=country;}
    public String toString() {
        return "Home Appliances Product ID: "+getId()+" ,Name: "+getName()+" ,Brand: "+getBrand()
        +"\nModel: "+getModel()+" ,Manufacture Year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+
        "\nCapacity "+getCapacity()+" ,Price: "+getPrice();
    }
    public boolean equals(HomeAppliances b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getManufactureCountry().equals(b.getManufactureCountry())
        && getManufactureYear()==b.getManufactureYear() && getModel().equals(b.getModel()) && getCapacity()==b.getCapacity();
    }
}