public class Test {
    public static void main(String[] args) {
        Book b1 = new Book(1, "book1", "author1", "publisher1", 2017, 80);
        Book b2 = new Book(2,"book2","author2","publisher2",2015,80);
        Novel n = new Novel(3,"novel","author3","publisher3",2020,99,"fiction");
        Textbook t = new Textbook(4, "CpForBeginners", "gritli", "tarek", 2023, 100, "Competitve Programming");
        Library l = new Library();
        Student s1 = new Student ("trabelsi","houssem",20,"GL2",1);
        Student s2 = new Student("youssef","raef",25,"GL3",2);
        Teacher t1 = new Teacher ("ouerfelli","adem",3);
        Teacher t2 = new Teacher("wesleti","amine" , 4);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(n);
        l.addBook(t);
        l.listAllBooks();
        s1.borrowBook(b1);
        s2.addToWishList(b1);
        s2.borrowBook(b2);
        s1.returnBook(b1);
        s1.addToWishList(b2);
        s2.returnBook(b2);
        t1.borrowBook(b1);
        t2.borrowBook(b2);
        l.removeBook(b1);
        l.removeBook(b2);
        l.listAllBooks();
    }
}
