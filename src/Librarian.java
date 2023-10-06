


import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private List<Book> allBooks;
    private List<Book> borrowedBooks;
    private List<Book> availableBooks;
    private List<User> users;

    public Librarian(){
        allBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
        availableBooks = new ArrayList<>();
    }
    public void addBookToArray(Book book){
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println("Book has been added: " + book.getTitle());
    }
    public void removeBook(Book book){
        allBooks.remove(book);
        availableBooks.remove(book);
        System.out.println("Book has been removed: " + book.getTitle());
    }
    public void allBooks(){
        for (Book book : availableBooks){
            System.out.println("All books:\n" + book.toString());
        }
    }
    public void loanBook(){

    }
}
