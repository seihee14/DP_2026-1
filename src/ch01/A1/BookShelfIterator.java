package ch01.A1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;//다음에 꺼내올 책 위치 저장 필드

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;// 자기가 돌아다닐 책꽂이 저장 ㅣㄹ드
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;//꺼내올 책 남아있음
        } else {
            return false;//꺼내올책 없
        }
    }

    @Override
    public Book next() {//다음 책 반환 매서드
        if (!hasNext()) {
            throw new NoSuchElementException(); // 더이상 책이 없으면 예외 던짐
        }
        Book book = bookShelf.getBookAt(index); // 반복자가 책꽂이에 접근
        index++;
        return book;
        
    }
}
