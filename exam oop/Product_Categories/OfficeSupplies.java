package Product_Categories;

import java.util.Scanner;

public class OfficeSupplies extends Product {
    private String brand;
    private String color;
    private String material;
    private String category;

    public OfficeSupplies(String id, String name, double price, String brand, String color, String material,String category,int q) {
        super(id, name, price,q);
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.category = category;
    }
    //add products in the admin interface
    public static OfficeSupplies makeOfficeSupplies()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Office Supplies' Product's id:");
        String id=sc.nextLine();
        System.out.println("Enter Office Supplies' Product's name:");
        String name=sc.nextLine();
        System.out.println("Enter Office Supplies' Product's price:");
        double price = sc.nextDouble();
        sc.nextLine(); // consume new line character
        System.out.println("Enter Office Supplies' Product's quantity:");
        int quantity=sc.nextInt();
        sc.nextLine(); // consume new line character
        System.out.println("Enter Office Supplies' Product's color:");
        String color=sc.nextLine();
        System.out.println("Enter Office Supplies' Product's brand:");
        String brand=sc.nextLine();
        System.out.println("Enter Office Supplies' Product's material:");
        String material=sc.nextLine();
        System.out.println("Enter Office Supplies' Product's category:");
        String category=sc.nextLine();
        OfficeSupplies os=new OfficeSupplies(id, name, price, brand, color, material,category,quantity);
        return os;
    }
    public String getBrand() { return brand; }
    public void setBrand(String b) { brand = b; }
    public String getColor() { return color; }
    public void setColor(String c) { color = c; }
    public String getMaterial() { return material; }
    public void setMaterial(String m) { material = m; }
    public String getCategory() { return category; }
    public void setCategory(String c) { category = c; }
    public String toString() {
        return "Office Supply ID: " + getId() + " ,Name: " + getName() + " ,Brand: " + getBrand() +
        "\nColor: " + getColor() + " ,Material: " + getMaterial() +" ,Category: " + getCategory() + 
        "\nPrice: " + getPrice();
    }
    public boolean equals(OfficeSupplies b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getColor().equals(b.getColor())
        && getMaterial().equals(b.getMaterial()) && getCategory().equals(b.getCategory());
    }
}