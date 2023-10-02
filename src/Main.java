public class Main {
    public static void main(String[] args) {
        //Package Books = new Package();
        Books books = new Books();
        Librarian lib = new Librarian();

        System.out.println("Hello mate, this is a test");
        lib.addBook();
        System.out.println(books.getTitle());
        books.getBookList();
        books.getTitle();












        /*while (true) {

            try {
                System.out.println("Hej och välkommen till biblioteket.");
                System.out.println("Tryck 1 om du är personal");
                System.out.println("Tryck 2 om du ska låna en bok");

                Scanner input = new Scanner(System.in);
                int user = input.nextInt();

                switch (user) {
                    case 1:
                        System.out.println("Personal");
                        System.exit(1);
                    case 2:
                        System.out.println("Låna bok");
                        System.exit(2);
                    default:
                        System.out.println("Försök igen, välj antingen 1 eller 2.");
                }
            } catch (Exception e) {
                System.out.println("Försök igen");
            }


        }*/
    }
}