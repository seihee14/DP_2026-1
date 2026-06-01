package practice.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { //다음 책이 있는지 여부 반환 메소드
        if (index < bookShelf.getLength()) {
            return true; // 꺼내올 책이 남아있음
        } else {
            return false;
        }
    }

    @Override
    public Book next() { //다음책 반환 메소드
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
