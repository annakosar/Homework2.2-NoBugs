package hometask2;

import java.util.Objects;

public class Book {
    private String title;
    private String author;


    Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString () {
        return title + " by " + author;
    }
    @Override
    public boolean equals(Object o) {
        return o instanceof Book book &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
