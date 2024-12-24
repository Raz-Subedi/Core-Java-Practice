package javacollection;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book b = new Book();
        for(int i=0; i<5; i++){
            b.setId(1);
            b.setName("JAVa");
            b.setPublication("Oracle");

            books.add(b);
        }

        for(Book boo:books){
            System.out.println(boo);
        }
    }
}
