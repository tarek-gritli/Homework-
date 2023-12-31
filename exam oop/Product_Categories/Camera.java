package Product_Categories;

import java.util.Scanner;

public class Camera extends Electronics{
    private double resolution;
    public Camera(String id,String name,double price,String brand,String model,int manufactureYear,String country,double resolution,int q)
    {
        super(id, name, price, brand, model, manufactureYear, country,q);
        this.resolution = resolution;
    }
    //return camera instance
    public static Camera makeCamera() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter camera's id:");
        String id = sc.nextLine();
        System.out.println("Enter camera's name:");
        String name = sc.nextLine();
        System.out.println("Enter camera's price:");
        double price = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("Enter camera's quantity:");
        int quantity = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter camera's model:");
        String model = sc.nextLine();
        System.out.println("Enter camera's manufacture year:");
        int manufactureYear = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter camera's country of manufacture:");
        String country = sc.nextLine();
        System.out.println("Enter camera's brand:");
        String brand = sc.nextLine();
        System.out.println("Enter camera's resolution:");
        double resolution = sc.nextDouble();
        sc.nextLine();
        Camera c = new Camera(id, name, price, brand, model, manufactureYear, country, resolution, quantity);
        return c;
    }
    
    public double getResolution(){return resolution;}
    public void setResolution(double res){this.resolution=res;}
    public String toString()
    {
        return "Camera ID: "+getId()+" ,Name: "+getName()+" ,Brand: "+getBrand()+
        "\nModel: "+getModel()+" ,Manufacture year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+
        "\nResolution: "+getResolution()+" megapixels "+" Price: "+getPrice();
    }
    public boolean equals(Camera b) {
        return getId()==b.getId() && getName()==b.getName() && getPrice()==b.getPrice()&& getBrand()==b.getBrand() && getManufactureCountry()==b.getManufactureCountry()
        && getManufactureYear()==b.getManufactureYear() && getModel()==b.getModel() && getResolution()==b.getResolution();
    }
}
