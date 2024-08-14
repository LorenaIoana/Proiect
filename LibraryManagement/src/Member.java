import java.util.ArrayList;

public class Member extends Library{


    public String id;
    public String name;
    public ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public void receiveBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void giveBook(Book book) {
        this.borrowedBooks.remove(book);
    }
}
