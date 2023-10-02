public class Books {

    private String title;
    private String author;
    private boolean available;
    private String description;
    String[] booklist;

    /*public String[] getBooklist() {
        return booklist;
    }*/

    /*public void setBooklist(String[] booklist) {

        this.title += booklist;
    }*/
/*
    String[] booklist = {"HarryPotter1", "HarryPotter2", "HarryPotter3"};
*/
    public void getBookList(){
        System.out.println(booklist);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        title += booklist;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
