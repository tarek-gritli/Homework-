package Product_Categories;

import java.util.Scanner;

public class TV extends Electronics {
    private double screenSize;
    private String resolution; //it will be like 720p,1080p
    private boolean isSmart;
    public TV(String id, String name, double price, String brand, String model, int manufactureYear, String country,double screenSize, String resolution, boolean isSmart,int q) {
        super(id, name, price, brand, model, manufactureYear, country,q);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.isSmart = isSmart;
    }
    //add products in admin interface
    public static TV makeTV()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter TV's id:");
        String id=sc.nextLine();
        System.out.println("Enter TV's name:");
        String name=sc.nextLine();
        System.out.println("Enter TV's price:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter TV's quantity:");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter TV's model:");
        String model=sc.nextLine();
        System.out.println("Enter TV's manufacture year:");
        int manufactureYear=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter TV's country of manufacture:");
        String country=sc.nextLine();
        System.out.println("Enter TV's brand:");
        String brand=sc.nextLine();
        System.out.println("Enter TV's resolution:");
        String resolution=sc.nextLine();
        System.out.println("Enter TV's screen size:");
        double size=sc.nextDouble();
        sc.nextLine();
        System.out.println("Is the Tv smart?[1] for smart [0] for no:");
        int s=sc.nextInt();
        sc.nextLine();
        boolean smart = s==1;
        TV tv=new TV(id, name, price, brand, model, manufactureYear, country, size,resolution,smart,quantity);
        return tv;
    }
    public void setScreenSize(double s) { screenSize = s; }
    public double getScreenSize() { return screenSize; }
    public void setResolution(String r) { resolution = r; }
    public String getResolution() { return resolution; }
    public void setisSmart(boolean s) { isSmart = s; }
    public boolean isSmart(){return isSmart;}
    public String toString()
    {
        String smart = isSmart() ? "smart" : "not supported";
        return "TV ID: "+getId()+" ,Name: "+getName()+" ,Brand: "+getBrand() +
        "\nModel: "+getModel()+" ,Manufacture Year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+
        "\nScreen Size: "+getScreenSize()+" ,Resolution: "+getResolution()+" ,Smart Functionality: "+smart+
        "\nPrice: "+getPrice();
    }
    public boolean equals(TV b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getManufactureCountry().equals(b.getManufactureCountry())
        && getManufactureYear()==b.getManufactureYear() && getModel().equals(b.getModel()) && getResolution()==b.getResolution() && getScreenSize()==b.getScreenSize() && isSmart()==b.isSmart();
    }
}