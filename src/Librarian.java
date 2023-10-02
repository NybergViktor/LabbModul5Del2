import java.util.Scanner;

public class Librarian {
    Scanner myScanner = new Scanner(System.in);
    User user = new User();
    Books books = new Books();
    //getBooks

    public void addBook(){
        System.out.println("Bokens titel");
        books.setTitle(myScanner.nextLine());

        System.out.println(books.booklist);
        System.out.println("Författare");
        books.setAuthor(myScanner.nextLine());

    }
    public void removeBook(){

    }
    public void wantToReadListOfUsers(){
        System.out.println("User is: " + user.name);

    }
}
