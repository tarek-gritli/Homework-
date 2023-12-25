import java.util.ArrayList;
public class Library {
    private ArrayList<Book> libraryInventory;
    public Library()
    {
        libraryInventory = new ArrayList<>();
    }
    public void addBook(Book b)
    {
        libraryInventory.add(b);
    }
    public void removeBookByISBN(int ISBN)
    {
        for (Book b: libraryInventory)
        {
            if(b.getISBN()==ISBN)
            {
                libraryInventory.remove(b);
            }
            else
            {
                System.out.println("This book does't exist");
            }
        }
    }
    public void removeBook(Book b)
    {
        if(!libraryInventory.remove(b))
        {
            System.out.println("This book does't exist");
        }
    }
    public void listAllBooks()
    {
        for(Book b: libraryInventory)
        {
            System.out.println(b.getTitle());
        }
    }
}
