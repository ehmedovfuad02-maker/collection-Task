import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String author, int id, String title, int year, boolean available) {
        this.author = author;
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = available;
    }

    public int getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && year == book.year && available == book.available && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, year, available);
    }



}

    





