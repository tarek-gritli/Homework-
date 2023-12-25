public class Student implements LibraryUser{
    private String nom;
    private String prenom;
    private int age;
    private String fieldOfStudy;
    private LibraryCard card;
    public Student(String nom,String prenom,int age,String fieldOfStudy,int number)
    {
        this.age=age;
        this.card=new LibraryCard(number);
        this.fieldOfStudy=fieldOfStudy;
        this.nom=nom;
        this.prenom=prenom;
    }
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getAge(){return age;}
    public String getFieldOfStudy(){return fieldOfStudy;}
    public LibraryCard getLibraryCard(){return card;}
    public void borrowBook(Book b)
    {
        System.out.println("Student "+getNom()+" "+getPrenom()+" borrowed "+b.getTitle());
    }
    public void returnBook(Book b)
    {
        System.out.println("Student "+getNom()+" "+getPrenom()+" returned "+b.getTitle());
    }
    public void addToWishList(Book b)
    {
        System.out.println("Student "+getNom()+" "+getPrenom()+" added "+b.getTitle()+" to his/her wish list");
    }
}
