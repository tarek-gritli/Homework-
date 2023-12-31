package Product_Categories;

import java.util.Scanner;

public class Smartphone extends Electronics{
    private String os;
    private int ram;
    public Smartphone(String id, String name, double price, String brand, String model, int manufactureYear,String country,String os,int ram,int q)
    {
        super(id, name, price, brand, model, manufactureYear, country,q);
        this.os = os;
        this.ram=ram;
    }
    //this will serve for adding products in inventory in amdin interface
    public static Smartphone makeSmartphone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter smartphone's id:");
        String id = sc.nextLine();
        System.out.println("Enter smartphone's name:");
        String name = sc.nextLine();
        System.out.println("Enter smartphone's price:");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading price
        System.out.println("Enter smartphone's quantity:");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading quantity
        System.out.println("Enter smartphone's model:");
        String model = sc.nextLine();
        System.out.println("Enter smartphone's manufacture year:");
        int manufactureYear = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading manufacture year
        System.out.println("Enter smartphone's country of manufacture:");
        String country = sc.nextLine();
        System.out.println("Enter smartphone's brand:");
        String brand = sc.nextLine();
        System.out.println("Enter smartphone's os:");
        String os = sc.nextLine();
        System.out.println("Enter smartphone's ram:");
        int ram = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading ram
        Smartphone s = new Smartphone(id, name, price, brand, model, manufactureYear, country, os, ram, quantity);
        return s;
    }    
    //getters and setters
    public String getOs(){return os;}
    public int getRam(){return ram;}
    public void setOs(String os){this.os=os;}
    public void setRam(int ram){this.ram=ram;}
    public String toString()
    {
        return "Smartphone Product ID: "+getId()+" ,Name: "+getName()+" ,Brand: "+getBrand() + 
        "\nModel: "+getModel()+" ,Manufacture Year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+
        "\nOS: "+getOs()+",RAM: "+getRam()+
        "\nPrice: "+getPrice();
    }
    public boolean equals(Smartphone b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getManufactureCountry().equals(b.getManufactureCountry())
        && getManufactureYear()==b.getManufactureYear() && getModel().equals(b.getModel()) && getOs()==b.getOs() && getRam()==b.getRam();
    }
}
