package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private String genre;
    private int index = 0;

    public GenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            if (bookShelf.getBookAt(index).getGenre().equals(genre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return bookShelf.getBookAt(index++);
    }
}
