public class Teacher implements LibraryUser{
    private String nom;
    private String subject;
    private LibraryCard card;
    public Teacher(String nom,String subject,int number)
    {
        this.card=new LibraryCard(number);
        this.subject=subject;
        this.nom=nom;
    }
    public String getNom(){return nom;}
    public String getSubject(){return subject;}
    public LibraryCard getLibraryCard(){return card;}
    public void borrowBook(Book b)
    {
        System.out.println("Teacher "+getNom()+" "+" borrowed "+b.getTitle());
    }
    public void returnBook(Book b)
    {
        System.out.println("Teacher "+getNom()+" "+" returned "+b.getTitle());
    }
    public void addToWishList(Book b)
    {
        System.out.println("Teacher "+getNom()+" "+" added "+b.getTitle()+" to his/her wish list");
    }
}
