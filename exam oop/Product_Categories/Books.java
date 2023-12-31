package Product_Categories;
import java.util.Scanner;
public class Books extends Product{
    private String author;
    private String language;
    private int publicationYear;
    private String publisher;
    public Books(String id,String name,double price,String language,int publicationYear,String publisher,String author,int q)
    {
        super(id, name, price,q);
        this.author=author;
        this.language=language;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }
    //create a book reference
    public static Books makeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book's id: ");
        String id = scanner.nextLine();
        System.out.print("Enter book's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter book's price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter book's language: ");
        String language = scanner.nextLine();
        System.out.print("Enter book's publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter book's publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter book's author: ");
        String author = scanner.nextLine();
        System.out.print("Enter the quantity of books: ");
        int q = scanner.nextInt();
        scanner.nextLine();
        // Create and return a new Books object
        return new Books(id, name, price, language, publicationYear, publisher, author, q);
    }
    
    
    public String getAuthor(){return author;}
    public void setAuthor(String a){author=a;}
    public String getLanguage(){return language;}
    public void setLanguage(String l){language = l; }
    public int getPublicationYear(){return publicationYear;}
    public void setPublicationYear(int y){publicationYear = y;}
    public String getPublisher(){return publisher;}
    public void setPublisher(String p){publisher=p;}
    public String toString()
    {
        return "Book ID: "+getId()+" ,Name: "+getName()+" ,Author: "+getAuthor()+
        "\nLanguage: "+getLanguage()+" ,Published on: "+getPublicationYear()+" by: "+getPublisher()+
        "\nPrice: "+getPrice();
    }
    //check if 2 books are the same
    public boolean equals(Books b) {
        return getId()==b.getId() && getName()==b.getName() && getPrice()==b.getPrice()&& getAuthor()==b.getAuthor() && getLanguage()==b.getLanguage()
        && getPublicationYear()==b.getPublicationYear() && getPublisher()==b.getPublisher();
    }
}
