package com.mystore.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(122, "Hibernate", 123));
        books.add(new Book(131, "Springs", 434));
        books.add(new Book(456, "WebService", 235));

        return books;
    }

}
