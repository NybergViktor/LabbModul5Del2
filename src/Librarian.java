


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
        users = new ArrayList<>();
    }
    public void addBookToArray(Book book){
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println("Book has been added: " + book.getTitle());
    }
    public void addUser(User user){
        users.add(user);
        System.out.println("User: " + user + " has been added!");
    }
    public void listOfUsers(){
        for (User user : users){
            System.out.println("All User:\n" + user.toString());
        }
    }
    public void listOfBorrowedBooks(){
        for (Book book : borrowedBooks){
            System.out.println("All User:\n" + book.toString());
        }
    }
    public void removeBook(int i){
        availableBooks.remove(availableBooks.indexOf(i));
        System.out.println("Book has been removed");

    }
    public void allAvailableBooks(){
        for (Book book : availableBooks){
            System.out.println("All books:\n" + book.toString());
        }
    }
    public void allBooks(){
        for (Book book : allBooks){
            System.out.println("All books:\n" + book.toString());
        }
    }
    public void username(){

    }
}
