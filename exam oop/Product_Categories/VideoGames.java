package Product_Categories;

import java.util.Scanner;

public class VideoGames extends Product {
    private String genre;
    private String platform;
    private String publisher;
    private String releaseDate;
    public VideoGames(String id, String name, double price, String genre, String platform,String publisher, String releaseDate,int quantity) {
        super(id, name, price,quantity);
        this.genre = genre;
        this.platform = platform;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }
    //will serve for adding products in inventory
    public static VideoGames makeVideoGames()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter VideoGame's id:");
        String id=sc.nextLine();
        System.out.println("Enter VideoGame's name:");
        String name=sc.nextLine();
        System.out.println("Enter VideoGame's price:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter VideoGame's quantity:");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter VideoGame's release date:");
        String releaseDate=sc.nextLine();
        System.out.println("Enter VideoGame's platform:");
        String platform=sc.nextLine();
        System.out.println("Enter VideoGame's publisher:");
        String publisher=sc.nextLine();
        System.out.println("Enter VideoGame's genre:");
        String genre=sc.nextLine();
        VideoGames s=new VideoGames(id, name, price, genre, platform, publisher, releaseDate,quantity);
        return s;
    }
    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}
    public String getPlatform() {return platform;}
    public void setPlatform(String platform) {this.platform = platform;}
    public String getPublisher() {return publisher;}
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public String getReleaseDate() {return releaseDate;}
    public void setReleaseDate(String releaseDate) {this.releaseDate = releaseDate;}
    public String toString() {
        return "Video Game ID: " + getId() + " ,Name: " + getName() + " ,Genre: " + getGenre() +
        "\nPlatform: " + getPlatform() +" ,Publisher: " + getPublisher() +" ,Release Date: " + releaseDate + 
        "\nPrice: " + getPrice();
    }
    public boolean equals(VideoGames b) {
        return getId().equals(b.getId()) && getName().equals(b.getName()) && getPrice()==b.getPrice()&& getGenre().equals(b.getGenre()) && (getPlatform()).equals(b.getPlatform())
        && getPublisher()==b.getPublisher() && getReleaseDate().equals(b.getReleaseDate());
    }
}
