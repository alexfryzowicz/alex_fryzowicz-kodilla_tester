package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (books.contains(book)) {
            System.out.println("title: " + book.getTitle() + " author: " + book.getAuthor() + " result: " + " exist.");
            books.add(book);
        } else {
            System.out.println("title: " + book.getTitle() + " author: " + book.getAuthor() + " result: " + " no exist.");
            books.add(book);
        }
        return book;
    }

    public void existBooks() {
        System.out.println("all exist books: " + books.size());
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }


}
