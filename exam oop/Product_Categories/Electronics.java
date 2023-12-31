package Product_Categories;
public abstract class Electronics extends Product{
    protected String brand;
    protected String model;
    protected int manufactureYear;
    protected String manufactureCountry;
    public Electronics(String id, String name, double price, String brand, String model, int manufactureYear,String country,int q)
    {
        super(id,name,price,q);
        this.brand=brand;
        this.model=model;
        this.manufactureYear=manufactureYear;
        this.manufactureCountry=country;
    }
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getManufactureYear() {return manufactureYear;}
    public void setManufactureYear(int manufactureYear) {this.manufactureYear = manufactureYear;}
    public String getManufactureCountry(){return manufactureCountry;}
    public void setManufactureCountry(String country){this.manufactureCountry=country;}
}
