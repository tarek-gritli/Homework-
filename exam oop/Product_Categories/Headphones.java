package Product_Categories;

import java.util.Scanner;

public class Headphones extends Electronics{
    private boolean withNoiseCancellation;
    public Headphones(String id, String name, double price, String brand, String model, int manufactureYear, String country, boolean withNoiseCancellation,int q) {
        super(id, name, price, brand, model, manufactureYear, country,q);
        this.withNoiseCancellation=withNoiseCancellation;
    }
    //return headphones instance
    public static Headphones makeHeadphones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter headphones' id:");
        String id = sc.nextLine();
        System.out.println("Enter headphones' name:");
        String name = sc.nextLine();
        System.out.println("Enter headphones' price:");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading the price
        System.out.println("Enter headphones' quantity:");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the quantity
        System.out.println("Enter headphones' model:");
        String model = sc.nextLine();
        System.out.println("Enter headphones' manufacture year:");
        int manufactureYear = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the manufacture year
        System.out.println("Enter headphones' country of manufacture:");
        String country = sc.nextLine();
        System.out.println("Enter headphones' brand:");
        String brand = sc.nextLine();
        System.out.println("Enter headphones' noise cancellation technology:[1] for Noise cancellation, [0] for none");
        int noise = sc.nextInt();
        sc.nextLine();
        boolean n = (noise == 1);
        Headphones h = new Headphones(id, name, price, brand, model, manufactureYear, country, n, quantity);
        return h;
    }
    
    public boolean getNoiseCancellation(){return withNoiseCancellation;}
    public void setNoiseCancellation(boolean b){withNoiseCancellation=b;}
    public String toString()
    {
        String anc = getNoiseCancellation() ? "Active Noise Cancellation(ANC)" : "None";
        return "Headphones ID: "+getId()+" ,Name: "+getName()+" ,Brand:"+getBrand()+
        "\nModel: "+getModel()+" ,Manufacture year: "+getManufactureYear()+" ,Made in: "+getManufactureCountry()+" ,Noise Technology: "+anc+
        "\nPrice: "+getPrice();
    }
    public boolean equals(Headphones b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getBrand().equals(b.getBrand()) && getManufactureCountry().equals(b.getManufactureCountry())
        && getManufactureYear()==b.getManufactureYear() && getModel().equals(b.getModel()) && getNoiseCancellation()==b.getNoiseCancellation();
    }
}
