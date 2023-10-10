
import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    Librarian lib = new Librarian();
    private int newBookId = 0;

    //private String userN;


    public Menu() {

        addStartBooks();


        addNewUser();
        mainMenu();
    }

    public void mainMenu() {

        while (isRunning) {
            System.out.println("LIBRARY MAIN MENU:\n" +
                    "[1] User\n" +
                    "[2] librarian\n" +
                    "[3] exit program");

            int alt = input.nextInt();
            try {


                switch (alt) {
                    case 1:
                        //System.out.println("What is your username? (one word)");
                        //userN = input.nextLine();
                        //addNewUser();
                        while (true) {
                            System.out.println("[1] see list of available books:\n" + //klar
                                    "[2] loan book\n" +//kanske klar
                                    "[3] return book\n" +//kanske klar
                                    "[4] read a list of loaned books\n" +//klar
                                    "[5] return to main menu\n");//klar
                            int choice = input.nextInt();

                            switch (choice) {
                                case 1: //list of available books
                                    System.out.println("List of books: ");
                                    lib.allAvailableBooks();

                                    //här ska man också kunna läsa mer om boken

                                case 2://loan book
                                    //kalla på metod
                                    loanBook();
                                    break;

                                case 3://return book
                                    returnBook();
                                    break;

                                case 4://read a list of loaned books
                                    System.out.println("Those are the books you have loaned: ");
                                    lib.listOfBorrowedBooks();
                                case 5://return to main menu
                                    break;

                                default:
                                    System.out.println("error!");

                            }


                        }
                    case 2:
                        System.out.println("librarian menu");
                        while (true) {
                            System.out.println("[1] see list of lent out books:\n" +//klar
                                    "[2] add new book\n" +//klar
                                    "[3] remove a book\n" +//klar
                                    "[4] read a list of users\n" +//klar
                                    "[5] return to main menu\n");//klar

                            int choice = input.nextInt();

                            switch (choice) {
                                case 1://see list of lent out books
                                    lib.listOfBorrowedBooks();

                                case 2://add new book
                                    System.out.println("Adding new book");
                                    addNewBook();
                                    break;
                                case 3://remove book
                                    removeBook();

                                    break;

                                case 4://read a list of users
                                    lib.listOfUsers();
                                    break;

                                case 5://return to main menu
                                    break;


                                default:
                                    System.out.println("Default!");
                                    break;
                            }


                        }
                    case 3:
                        isRunning = false;

                }
            } catch (Exception e) {
                System.out.println("1 or 2");
            }
        }
    }
    public void addNewUser(){
        System.out.println("What is your username? (one word)");
        String userN; //skapar string i scope
        userN = input.nextLine();//deklarerar string med scanner
        User user = new User(userN);//skapar user
        lib.addUser(user);//add user till arraylist
    }
    public void addNewBook() {
        System.out.println(newBookId);
        System.out.println("Please add book title: ");
        String title = input.nextLine();
        System.out.println("Please add book author: ");
        String author = input.nextLine();
        System.out.println("Please add book description: ");
        String description = input.nextLine();
        newBookId += 1;
        System.out.println("Book id: " + newBookId);

        Book newBook = new Book(title, author, description, newBookId);

        lib.addBookToArray(newBook);

        System.out.println("Book: " + title + " has been added.");
    }
    public void removeBook(){
        System.out.println("What book do you want to remove? Choose by id");
        lib.allAvailableBooks();
        int altId = input.nextInt();
        try {
            //Väljer vilken book (ID) man vill ta bort

            System.out.println("scanner id" + altId);
            lib.removeBook(altId);
            lib.allAvailableBooks();
        }catch(Exception e){
            System.out.println("Write numbers, choose by ID");
        }
    }
    public void loanBook(){
        System.out.println("What book do you want to loan? Choose by id");
        lib.allAvailableBooks();
        int altId = input.nextInt();
        altId -= 1;
        //lib.moveBookToBorrowedArray(altId);
        //lib.listOfBorrowedBooks();lib.allAvailableBooks(altid);
        try {
            //Väljer vilken book man vill låna
            //System.out.println("scanner id" + altId);
            lib.moveBookToBorrowedArray(altId);

        }catch(Exception e){
            System.out.println("Write numbers, choose by ID");
        }
    }
    public void returnBook(){
        System.out.println("What book do you want to return? Choose by id");
        lib.listOfBorrowedBooks();
        int altId = input.nextInt();
        altId -= 1;

        //lib.listOfBorrowedBooks();lib.allAvailableBooks(altid);
        try {
            //Väljer vilken book man vill låna
            //System.out.println("scanner id" + altId);
            lib.moveBookToAvailableArray(altId);

        }catch(Exception e){
            System.out.println("Write numbers, choose by ID");
        }
    }

    public void addStartBooks() {
        Book bookOne = new Book("Harry P nr: 1 ", "JKRowling", "First book in the series", (newBookId += 1));
        Book bookTwo = new Book("Harry P nr: 2 ", "JKRowling", "Second book in the series", (newBookId += 1));
        Book bookThree = new Book("Harry P nr: 3 ", "JKRowling", "Third book in the series", (newBookId += 1));
        Book bookFour = new Book("Harry P nr: 4 ", "JKRowling", "Four book in the series", (newBookId += 1));
        Book bookFive = new Book("Harry P nr: 5 ", "JKRowling", "Fifth book in the series", (newBookId += 1));
        Book bookSix = new Book("Fast and Furious: 1 ", "Vin Diesel m.m.", "First book in the series", (newBookId += 1));
        Book bookSeven = new Book("Fast and Furious: 2 ", "Vin Diesel m.m.", "Second book in the series", (newBookId += 1));
        Book bookEight = new Book("Fast and Furious: 3 ", "Vin Diesel m.m.", "Third book in the series", (newBookId += 1));
        Book bookNine = new Book("Fast and Furious: 4 ", "Vin Diesel m.m.", "Four book in the series", (newBookId += 1));
        Book bookTen = new Book("Fast and Furious: 5 ", "Vin Diesel m.m.", "Fifth book in the series", (newBookId += 1));
        lib.addBookToArray(bookOne);
        lib.addBookToArray(bookTwo);
        lib.addBookToArray(bookThree);
        lib.addBookToArray(bookFour);
        lib.addBookToArray(bookFive);
        lib.addBookToArray(bookSix);
        lib.addBookToArray(bookSeven);
        lib.addBookToArray(bookEight);
        lib.addBookToArray(bookNine);
        lib.addBookToArray(bookTen);


    }
}

