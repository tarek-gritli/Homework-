package Product_Categories;

import java.util.Scanner;

public class Clothing extends Product{
    private String color;
    private String size;
    private String brand;
    private String material;
    private String gender;
    public Clothing(String id, String name, double price, String color, String size, String material,String brand,String gender,int q) {
        super(id, name, price,q);
        this.color = color;
        this.size = size;
        this.material = material;
        this.gender = gender;
        this.brand=brand;
    }
    //return clothing instance
    public static Clothing makeClothing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter clothing's id:");
        String id = sc.nextLine();
        System.out.println("Enter clothing's name:");
        String name = sc.nextLine();
        System.out.println("Enter clothing's price:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter clothing's quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter clothing's color:");
        String color = sc.nextLine();
        System.out.println("Enter clothing's size:");
        String size = sc.nextLine();
        System.out.println("Enter clothing's material:");
        String material = sc.nextLine();
        System.out.println("Enter clothing's brand:");
        String brand = sc.nextLine();
        System.out.println("Enter clothing's gender:");
        String gender = sc.nextLine();
        Clothing c = new Clothing(id, name, price, color, size, material, brand, gender, quantity);
        return c;
    }
    
    public String getColor(){return color;}
    public void setColor(String c){color=c;}
    public String getSize(){return size;}
    public void setSize(String s){size = s; }
    public String getMaterial(){return material;}
    public void setMaterial(String m){material=m;}
    public String getGender(){return gender;}
    public void setGender(String g){gender=g;}
    public String getBrand(){return brand;}
    public void setBrand(String b){brand=b;}
    public String toString()
    {
        String gen = (getGender().toUpperCase()=="MALE" || getGender().toUpperCase()=="MEN") ? "Male's " : "Female's " ;
        return gen+"clothing ID: "+getId()+" ,Name: "+getName()+" ,Color: "+getColor()+
        "\nSize: "+getSize()+" ,Material: "+getMaterial()+
        "\nPrice: "+getPrice();
    }
    public boolean equals(Clothing b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getColor().equals(b.getColor())
        && getGender().equalsIgnoreCase(b.getGender()) && getMaterial().equals(b.getMaterial()) && getSize().equals(b.getSize());
    }
}
