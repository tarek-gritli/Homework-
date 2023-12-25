public interface LibraryUser {
    public abstract void borrowBook(Book b);
    public abstract void returnBook(Book b);
    public abstract void addToWishList(Book b);
}
