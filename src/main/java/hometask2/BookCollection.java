package hometask2;

import java.util.HashSet;

public class BookCollection {
    public HashSet<Book> books;

    public BookCollection (HashSet<Book> books) {
        this.books = books;
    }

    public BookCollection () {
        this.books = new HashSet<>();
    }

    public HashSet<Book> getBooks () {
        return this.books;
    }


    public void addBooks (Book newBook) {
        this.books.add(newBook);
    }

    public void removeBooks (Book oldBook) {
        this.books.remove(oldBook);
    }
    public boolean containsBook(Book book) {
        return this.books.contains(book);
    }

}
