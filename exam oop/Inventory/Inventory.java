package Inventory;
import Product_Categories.*;
import java.util.ArrayList;
public class Inventory {
    private ArrayList<Product> inventory;
    //initialize inventory with instances of products
    public Inventory() {
        inventory = new ArrayList<>();
        Books book1 = new Books("001", "The Catcher in the Rye", 19.99, "English", 1951, "Little, Brown and Company", "J.D. Salinger", 10);
        Books book2 = new Books("002", "To Kill a Mockingbird", 24.99, "English", 1960, "J.B. Lippincott & Co.", "Harper Lee", 15);
        Camera c1 = new Camera("C001", "High-Resolution Camera", 499.99, "Sony", "Alpha-7", 2023, "Japan", 24.0, 10);
        Camera c2 = new Camera("C002", "Professional DSLR Camera", 1299.99, "Canon", "EOS-1D X Mark III", 2022, "USA", 20.0, 5);
        Clothing clothing1 = new Clothing("CL001", "Casual T-Shirt", 19.99, "Blue", "Medium", "Cotton", "BrandX", "Unisex", 50);
        Clothing clothing2 = new Clothing("CL002", "Formal Shirt", 39.99, "White", "Large", "Polyester", "BrandY", "Male", 30);
        Headphones headphones1 = new Headphones("HP001", "Wireless Over-Ear Headphones", 89.99, "Sony", "WH-1000XM4", 2021, "Japan", true, 20);
        Headphones headphones2 = new Headphones("HP002", "In-Ear Earbuds", 49.99, "Apple", "AirPods Pro", 2020, "USA", false, 30);
        HomeAppliances homeAppliance1 = new HomeAppliances("HA001", "Washing Machine", 499.99, "Samsung", "WF45K6500AW", 2022, 8.5, "South Korea", 15);
        HomeAppliances homeAppliance2 = new HomeAppliances("HA002", "Refrigerator", 799.99, "LG", "LFXS26596S", 2021, 26.2, "USA", 10);
        Laptop laptop1 = new Laptop("LT001", "Gaming Laptop", 1299.99, "Alienware", "M15 R5", 2023, "USA", "Intel i7", "NVIDIA RTX 3080", 1024, 5);
        Laptop laptop2 = new Laptop("LT002", "Business Laptop", 899.99, "Dell", "Latitude 7420", 2022, "USA", "Intel i5", "Integrated", 512, 10);
        OfficeSupplies officeSupply1 = new OfficeSupplies("OS001", "Ballpoint Pens", 5.99, "BIC", "Blue", "Plastic", "Stationery", 50);
        OfficeSupplies officeSupply2 = new OfficeSupplies("OS002", "Notebooks", 8.99, "Moleskine", "Black", "Paper", "Stationery", 30);
        PetSupplies petSupply1 = new PetSupplies("PS001", "Dog Food", 15.99, "Dogs", 20);
        PetSupplies petSupply2 = new PetSupplies("PS002", "Cat Toys", 9.99, "Cats", 15);
        Security securityProduct1 = new Security("SEC001", "Surveillance Camera", 89.99, "ABC Security", "ModelX", 2022, 0.8, "USA", 10);
        Security securityProduct2 = new Security("SEC002", "Motion Sensors", 19.99, "XYZ Tech", "SensorZ", 2021, 0.9, "Canada", 15);
        Smartphone smartphone1 = new Smartphone("SP001", "TechPhone", 599.99, "TechCo", "ModelA", 2023, "USA", "Android", 8, 20);
        Smartphone smartphone2 = new Smartphone("SP002", "SmartGadget", 799.99, "GadgetTech", "ModelB", 2022, "China", "iOS", 12, 15);
        TV tv1 = new TV("TV001", "SmartTV", 899.99, "TechVision", "ModelX", 2023, "South Korea", 55.0, "4K", true, 10);
        TV tv2 = new TV("TV002", "UltraVision", 1299.99, "UltraTech", "ModelZ", 2022, "Japan", 65.0, "8K", true, 8);
        VideoGames game1 = new VideoGames("VG001", "The Quest", 49.99, "Role-Playing", "PlayStation 5", "GameStudios", "2022-07-15", 20);
        VideoGames game2 = new VideoGames("VG002", "Galactic Battles", 39.99, "Action", "Xbox Series X", "GalaxyGames", "2023-01-30", 15);
        inventory.add(book1);
        inventory.add(book2);
        inventory.add(c1);
        inventory.add(c2);
        inventory.add(clothing1);
        inventory.add(clothing2);
        inventory.add(headphones1);
        inventory.add(headphones2);
        inventory.add(homeAppliance1);
        inventory.add(homeAppliance2);
        inventory.add(laptop1);
        inventory.add(laptop2);
        inventory.add(officeSupply1);
        inventory.add(officeSupply2);
        inventory.add(petSupply1);
        inventory.add(petSupply2);
        inventory.add(securityProduct1);
        inventory.add(securityProduct2);
        inventory.add(smartphone1);
        inventory.add(smartphone2);
        inventory.add(tv1);
        inventory.add(tv2);
        inventory.add(game1);
        inventory.add(game2);

    }
    public ArrayList<Product> getInventory(){return inventory;}
    //filter products by category for customers
    public void filterByCategory(String category)
    {
        System.out.println("Filtered by Category: " + category);
        for(Product p:inventory)
        {
            //check if product's class name is equal to the category given by user input
            if(p.getClass().getSimpleName().equalsIgnoreCase(category.replaceAll("\\s", ""))) 
            {
                System.out.println(p.toString());
            }
        }
    }
    //filter products by price range for customers
    public void filterByPrice(double minPrice,double maxPrice)
    {
        System.out.print("Filtered by Price: " + minPrice+" TND to " + maxPrice+" TND");
        for(Product p:inventory)
        {
            if(p.getPrice()>=minPrice && p.getPrice()<=maxPrice)
            {
                System.out.println(p.toString());
            }
        }
    }
    //filter products by brand for customers
    public void filterByBrand(String brand)
    {
        System.out.println("Products with the Brand " + brand);
        for(Product p:inventory)
        {
            if(p instanceof Electronics && ((Electronics)p).getBrand().equals(brand)) System.out.println(p.toString());
            else if(p instanceof HomeAppliances && ((HomeAppliances)p).getBrand().equals(brand)) System.out.println(p.toString());
            else if(p instanceof Clothing && ((Clothing)p).getBrand().equals(brand)) System.out.println(p.toString());
            else if(p instanceof OfficeSupplies && ((OfficeSupplies)p).getBrand().equals(brand)) System.out.println(p.toString());
            else if(p instanceof Security && ((Security)p).getBrand().equals(brand)) System.out.println(p.toString());

        }

    }
    //search for product by name or id
    public Product searchByNameId(String id,String name)
    {
        for(Product p:inventory)
        {
            if(p.getName().equalsIgnoreCase(name)||p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }
    //add product to inventory
    public void addProduct(Product p) {
        for(Product product:inventory)
        {
            if(p.equals(product))
            {
                int existingQuantity=product.getQuantity();
                product.setQuantity(existingQuantity+p.getQuantity());
                System.out.println("Inventory updated successfully!");
                System.out.println("Added "+p.getQuantity()+" to "+p.toString());
                return;
            }
        }
        inventory.add(p);
        System.out.println(p.toString()+" ,Quantity: "+p.getQuantity()+ "added successfully to inventory!");
    }
    //remove product from inventory
    public void removeProduct(String id) {
        for(Product p:inventory)
        {
            if(p.getId().equals(id))
            {
                inventory.remove(p);
                System.out.println(p.toString()+" removed successfully from inventory");
                return;
            }
        }
        System.out.println("No such product found in Inventory");
        
    }
    //clear inventory
    public void clearInventory()
    {
        inventory.clear();
        System.out.println("Inventory cleared!");
    }
    //check if a product is low in stock (quantity<=10)
    public boolean isLowStock(Product product) {
        return product.getQuantity() <= 10;
    }
    //check if a product is out-of-stock
    public boolean isOutOfStock(Product product) {
        return product.getQuantity() == 0;
    }
    //print low-stock products
    public void checkLowStock()
    {
        for (Product p : inventory) {
            if (isLowStock(p) && !isOutOfStock(p)) {
                System.out.println(p.toString() +" ,Quantity: "+p.getQuantity()+" is low in stock.");
            }
        }
    }
    //print ou-of-stock products
    public void checkOutOfStock() {
        for (Product p : inventory) {
            if (isOutOfStock(p)) {
                System.out.println(p.toString() + " is out of stock.");
            }
        }
    }
    //update product's price in inventory based on id
    public void update(String id,double newPrice)
    {
        for(Product p:inventory)
        {
            if(p.getId().equals(id))
            {
                p.setPrice(newPrice);
                System.out.println("Price for " + p.toString() + " changed successfully!");
            }
        }
    }
}