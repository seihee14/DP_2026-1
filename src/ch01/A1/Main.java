package ch01.A1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book(name: "Java Programming"));
        bookShelf.appendBook(new Book(name: "Python Programming"));
        bookShelf.appendBook(new Book(name: "C++ Programming"));

        //방법1 책꽂이에 직접 접근
        System.out.println(x: "Books in the shelf:");
        for( int i=0; i< bookShelf.getLength(); i++){
            System.out.println("- " + bookShelf.getBookAt(i).getName());
        }
        //방법2: 책꽂이에 반복자(iterator)를 만들어 책을 꺼내는 방식
        System.out.println(x: "Books in the shelf (using iterator");
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next().getName());
        }

        // 방법3 책꽂이에 반복자를 만들어서 책을 꺼내는 방식 (for-each)
        //형식 : for (타입변수 : 컬렉션)
        for (Book b: bookShelf) {
            System.out.println("- " + b.getName());
        }
    }
}
