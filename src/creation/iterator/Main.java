package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        GoodBook goodBook = new GoodBook();
        goodBook.addBook("bg1", "d1", 1999);
        goodBook.addBook("bg2", "d2", 1999);
        goodBook.addBook("bg3", "d3", 1999);
        System.out.println("\nGood books");
        printBooks(goodBook.makeIterator());

        System.out.println("");

        BadBook badBook = new BadBook();
        badBook.addBook("bb1", "d1", 2000);
        badBook.addBook("bb2", "d2", 2000);
        badBook.addBook("bb3", "d3", 2000);
        System.out.println("\nBad books");
        printBooks(badBook.makeIterator());
    }

    public static void printBooks(Iterator<Book> books) {
        while (books.hasNext()) {
            Book book = (Book) books.next();
            System.out.println(book.getTitle());
            System.out.println(book.getName());
            System.out.println(book.getYear());

        }

    }
}
