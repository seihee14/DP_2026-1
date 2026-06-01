package hw.ch01;

import java.util.*;

public class YearIterator implements Iterator<Book> {

    private List<Book> sortedBooks;
    private int index = 0;

    public YearIterator(BookShelf bookShelf) {

        sortedBooks = new ArrayList<>();

        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i));
        }

        sortedBooks.sort((a, b) -> b.getYear() - a.getYear());
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        return sortedBooks.get(index++);
    }
}
