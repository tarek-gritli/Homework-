package Product_Categories;

import java.util.Scanner;

public class PetSupplies extends Product{
    private String petConcerned;
    public PetSupplies(String id,String name,double price,String petConcerned,int q) {
        super(id, name, price,q);
        this.petConcerned = petConcerned;
    }
    //return PetSupplies instance
    public static PetSupplies makePetSupplies()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Pet Supplies Product's id:");
        String id=sc.nextLine();
        System.out.println("Enter Pet Supplies Product's name:");
        String name=sc.nextLine();
        System.out.println("Enter Pet Supplies Product's price:");
        double price = sc.nextDouble();
        sc.nextLine(); // consume new line character
        System.out.println("Enter Pet Supplies Product's quantity:");
        int quantity=sc.nextInt();
        sc.nextLine(); // consume new line character
        System.out.println("Enter Pet Supplies Product's petConcerned:");
        String petConcerned=sc.nextLine();
        PetSupplies ps=new PetSupplies(id, name, price, petConcerned,quantity);
        return ps;
    }
    public String getPetConcerned(){return petConcerned;}
    public void setPetConcerned(String p){petConcerned=p;}
    public String toString()
    {
        return "Pet Supplies Product ID: "+getId()+" ,Name: "+getName()+" ,Made for: "+getPetConcerned()+
        "\nPrice: "+getPrice();
    }
    public boolean equals(PetSupplies b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getPetConcerned().equals(b.getPetConcerned());
    }
}
