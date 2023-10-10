


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
    public void moveBookToBorrowedArray(int altId){

        borrowedBooks.add(availableBooks.get(altId));
        System.out.println("Book has been loaned: " + availableBooks.get(altId));
        availableBooks.remove(altId);

    }
    public void moveBookToAvailableArray(int altId){

        availableBooks.add(borrowedBooks.get(altId));
        System.out.println("Book has been returned: " + borrowedBooks.get(altId));
        borrowedBooks.remove(altId);

    }
    public void addUser(User user){
        users.add(user);
        System.out.println("User: " + user + " has been added!");
    }
    public void trueOrFalse(){

    }
    public void listOfUsers(){
        for (User user : users){
            System.out.println("All User:\n" + user.toString());
        }//for each loop, för varje bok i borrowedok printar den ut nästa bok på en ny rad
    }
    public void listOfBorrowedBooks(){
        for (Book book : borrowedBooks){
            System.out.println("All borrowed books:\n" + book.toString());
        }//for each loop, för varje bok i borrowedok printar den ut nästa bok på en ny rad
    }
    public void removeBook(int i){
        i = i -= 1;
        System.out.println("i: " + i);
        availableBooks.remove(i);
        System.out.println("Book has been removed");

    }
    public void allAvailableBooks(){
        for (Book book : availableBooks){
            System.out.println("All books:\n" + book.toString());
        }//for each loop, för varje bok i borrowedok printar den ut nästa bok på en ny rad
    }
    public void allBooks(){
        for (Book book : allBooks){
            System.out.println("All books:\n" + book.toString());
        }//for each loop, för varje bok i borrowedok printar den ut nästa bok på en ny rad
    }

}
