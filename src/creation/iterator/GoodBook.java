package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class GoodBook implements BooksIterator {

    private ArrayList<Book> goodBooks;

    public GoodBook() {

        goodBooks = new ArrayList<Book>();

    }

    public void addBook(String name, String title, int year) {
        Book book = new Book(name, title, year);
        goodBooks.add(book);
    }

    @Override
    public Iterator<Book> makeIterator() {
        // TODO Auto-generated method stub
        return goodBooks.iterator();
    }

}
