package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Stewart", "The last chance");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.madifyTitle("new title");
        System.out.println(book.getTitle());
    }
}
