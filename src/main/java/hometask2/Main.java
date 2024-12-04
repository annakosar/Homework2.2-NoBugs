package hometask2;

public class Main {
    public static void main (String[] args) {

        Book book1 = new Book ("Gone With the Wind", "Margaret Mitchell");
        Book book2 = new Book ("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book ("Pride and Prejudice", "Jane Austen");
        Book book4 = new Book ("Pride and Prejudice", "Jane Austen");
        Book book5 = new Book ("1984", "George Orwell");

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBooks(book1);
        bookCollection.addBooks(book2);
        bookCollection.addBooks(book3);
        bookCollection.addBooks(book4);
        System.out.println("Список всех книг: "+ bookCollection.getBooks());

        bookCollection.removeBooks(book2);
        System.out.println("Список после удаления книги: " + bookCollection.getBooks());

        System.out.println("Книга " + book4 + " содержится в коллекции? - " + bookCollection.containsBook(book4));
        System.out.println("Книга " + book5 + " содержится в коллекции? - " + bookCollection.containsBook(book5));


    }
}
