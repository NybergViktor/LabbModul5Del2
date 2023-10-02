import java.util.Scanner;

public class User {
    Books newBook = new Books();

    String name;
Scanner myScanner = new Scanner(System.in);
    public void newUser(){
        System.out.println("What is your name?");
        name = myScanner.nextLine();
        System.out.println("OK, name is: " + name);
    }
    public void loanBook(){
        System.out.println("This is a list of all available books:");


    }
    public void returnBook(){

    }

}
