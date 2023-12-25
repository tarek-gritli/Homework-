public class Textbook extends Book {
    private String subject;
    public Textbook(int ISBN,String title,String author,String publisher,int publicationYear,int nbpages,String subject)
    {
        super(ISBN,title, author, publisher, publicationYear, nbpages);
        this.subject = subject;
    }
    public String getSubject()
    {
        return subject;
    }
    public void displayInformation()
    {
        System.out.println("Textbook: "+getTitle()+" written by "+getAuthor()+" published by "+getPublisher()+" in "+getYearOfPublication()
            +".It has "+getNumOfPages()+" and about "+getSubject());
    }
}