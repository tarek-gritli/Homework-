public class Book{
    protected int ISBN;
    protected String title;
    protected String author;
    protected String publisher;
    protected int publicationYear;
    protected int nbpages;
    public Book(int ISBN,String title,String author,String publisher,int publicationYear,int nbpages)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.nbpages = nbpages;
    }
    public int getISBN()
    {
        return ISBN;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getYearOfPublication()
    {
        return publicationYear;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public int getNumOfPages()
    {
        return nbpages;
    }
}