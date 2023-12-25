public class Novel extends Book {
    private String genre;
    public Novel(int ISBN,String title,String author,String publisher,int publicationYear,int nbpages,String genre)
    {
        super(ISBN,title, author, publisher, publicationYear, nbpages);
        this.genre = genre;
    }
    public String getGenre()
    {
        return genre;
    }
    public void displayInformation()
    {
        System.out.println("Novel: "+getTitle()+" written by "+getAuthor()+" published by "+getPublisher()+" in "+getYearOfPublication()
            +".It has "+getNumOfPages()+" and of genre "+getGenre());
    }
}
