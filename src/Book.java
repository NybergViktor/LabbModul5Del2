

public class Book {
    private String title;
    private String author;
    private String description;
    private int id;
    private boolean isAvailable;

    public void setAvailable(boolean available) {

        isAvailable = true;
    }
    public void setNotAvailable(boolean available) {

        isAvailable = false;

    }

    public Book(String title, String author, String description, int id) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.id = id;
        isAvailable = true;
    }



    public String available(){
        return isAvailable ? "Available" : "Not Available";
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}




