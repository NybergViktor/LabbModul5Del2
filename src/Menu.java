



import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    Librarian lib = new Librarian();


    public Menu() {
        addStartBooks();
        mainMenu();
    }

    public void mainMenu() {
        while (isRunning) {
            //lib.allBooks();
            System.out.println("LIBRARY MAIN MENU:\n" +
                    "[1] User\n" +
                    "[2] librarian\n" +
                    "[3] exit program");

            try {
                String alt = input.nextLine();

                switch (alt) {
                    case "1":
                        System.out.println("user menu \n" +
                                "What is your username? (one word)");
                        String userN = input.nextLine();
                        System.out.println("Username: " + userN + " has been added.");
                        while (true) {
                            System.out.println("[1] see list of available books:\n" +
                                    "[2] loan book\n" +
                                    "[3] return book\n" +
                                    "[4] read a list of loaned books\n" +
                                    "[5] return to main menu\n");
                            String choice = input.nextLine();

                            switch (choice) {
                                case "1": //list of available books
                                    System.out.println("List of books: ");
                                    lib.allBooks();

                                    //här ska man också kunna läsa mer om boken

                                case "2"://loan book
                                    System.out.println("What book do you want to loan?");
                                    int loanThisBook = input.nextInt();

                                case "3"://return book
                                    System.out.println("What book do you want to return?");
                                case "4"://read a list of loaned books
                                    System.out.println("Those are the books you have loaned: ");
                                case "5"://return to main menu
                                    break;

                                default:
                                    System.out.println("Default!");

                            }


                        }
                    case "2":
                        System.out.println("librarian menu");
                        while (true) {
                            System.out.println("[1] see list of lent out books:\n" +
                                    "[2] add new book\n" +
                                    "[3] remove a book\n" +
                                    "[4] read a list of users\n" +
                                    "[5] return to main menu\n");

                            String choice = input.nextLine();

                            switch (choice) {
                                case "1"://see list of lent out books

                                case "2"://add new book
                                    System.out.println("Adding new book");
                                    addNewBook();
                                case "3"://remove book

                                case "4"://read a list of users

                                case "5"://return to main menu
                                    break;


                                default:
                                    System.out.println("Default!");
                                    break;
                            }


                        }
                    case "3":
                        isRunning = false;

                }
            } catch (Exception e) {
                System.out.println("1 or 2");
            }
        }
    }

    public void addNewBook() {
        System.out.println("Please add book title: ");
        String title = input.nextLine();
        System.out.println("Please add book author: ");
        String author = input.nextLine();
        System.out.println("Please add book description: ");
        String description = input.nextLine();
        System.out.println("Please add book id: (Should be above 10)");
        String id = input.nextLine();

        Book newBook = new Book(title, author, description, id);
        lib.addBookToArray(newBook);

        System.out.println("Book: " + title + " has been added.");
    }

    public void addStartBooks() {
        Book bookOne = new Book("Harry P nr: 1 ", "JKRowling", "First book in the series", "1");
        Book bookTwo = new Book("Harry P nr: 2 ", "JKRowling", "Second book in the series", "2");
        Book bookThree = new Book("Harry P nr: 3 ", "JKRowling", "Third book in the series", "3");
        Book bookFour = new Book("Harry P nr: 4 ", "JKRowling", "Four book in the series", "4");
        Book bookFive = new Book("Harry P nr: 5 ", "JKRowling", "Fifth book in the series", "5");

        lib.addBookToArray(bookOne);
        lib.addBookToArray(bookTwo);
        lib.addBookToArray(bookThree);
        lib.addBookToArray(bookFour);
        lib.addBookToArray(bookFive);


    }
}

