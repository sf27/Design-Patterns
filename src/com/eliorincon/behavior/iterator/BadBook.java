package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BadBook implements BooksIterator {

    private ArrayList<Book> badBooks;

    public BadBook() {

        badBooks = new ArrayList<Book>();

    }

    public void addBook(String name, String title, int year) {
        Book book = new Book(name, title, year);
        badBooks.add(book);
    }

    @Override
    public Iterator<Book> makeIterator() {
        // TODO Auto-generated method stub
        return badBooks.iterator();
    }

}