package Product_Categories;

import java.util.Scanner;

public class Laptop extends Electronics {
    private String cpu;
    private String gpu;
    private int storage;
    public Laptop(String id, String name, double price, String brand, String model, int manufactureYear, String country, String cpu, String gpu, int storage,int q) {
        super(id, name, price, brand, model, manufactureYear, country,q);
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
    }
    //this will serve for adding products in inventory in admin interface
    public static Laptop makeLaptop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Laptop's id:");
        String id = sc.nextLine();
        System.out.println("Enter Laptop's name:");
        String name = sc.nextLine();
        System.out.println("Enter Laptop's price:");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading price
        System.out.println("Enter Laptop's quantity:");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading quantity
        System.out.println("Enter Laptop's model:");
        String model = sc.nextLine();
        System.out.println("Enter Laptop's manufacture year:");
        int manufactureYear = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading manufacture year
        System.out.println("Enter Laptop's country of manufacture:");
        String country = sc.nextLine();
        System.out.println("Enter Laptop's brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Laptop's storage:");
        int storage = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading storage
        System.out.println("Enter Laptop's gpu:");
        String gpu = sc.nextLine();
        System.out.println("Enter Laptop's cpu:");
        String cpu = sc.nextLine();
        Laptop l = new Laptop(id, name, price, brand, model, manufactureYear, country, cpu, gpu, storage, quantity);
        return l;
    }
    
    public void setCPU (String c) { cpu=c; }
    public String getCPU () { return cpu; }
    public void setGPU (String g) { gpu=g; }
    public String getGPU() {return gpu;}
    public int getStorage(){return storage;}
    public void setStorage(int s){storage=s;}
    public String toString()
    {
        return "Laptop ID: "+getId()+" ,Name: "+getName()+"Brand: "+getBrand() +
        "\nModel: "+getModel()+" ,Manufacture Year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+
        "\nCPU: "+getCPU()+" ,GPU: "+getGPU()+" ,Storage: "+getStorage()
        +"\nPrice: "+getPrice();
    }
    public boolean equals(Laptop b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getManufactureCountry().equals(b.getManufactureCountry())
        && getManufactureYear()==b.getManufactureYear() && getModel().equals(b.getModel()) && getStorage()==b.getStorage() && getCPU().equals(b.getCPU()) && getGPU().equals(b.getGPU());
    }

}