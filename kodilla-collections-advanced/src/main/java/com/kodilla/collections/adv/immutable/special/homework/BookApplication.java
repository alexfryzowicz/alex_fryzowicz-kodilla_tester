package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("book1", "author1");
        Book book2 = bookManager.createBook("book2", "author1");
        Book book3 = bookManager.createBook("book3", "author1");
        Book book4 = bookManager.createBook("book4", "author4");
        Book book5 = bookManager.createBook("book5", "author5");

        System.out.println(book1.equals(book2));
        System.out.println(book1 == book2);
        System.out.print(book1.equals(book3));
        System.out.println(book1 == book3);
        System.out.print(book1.equals(book4));
        System.out.println(book1 == book4);
        System.out.print(book2.equals(book3));
        System.out.println(book2 == book3);
        System.out.print(book2.equals(book4));
        System.out.println(book2 == book4);
        System.out.print(book3.equals(book4));
        System.out.println(book3 == book4);

        bookManager.countExistBooks();
        bookManager.listBooks();

    }
}
