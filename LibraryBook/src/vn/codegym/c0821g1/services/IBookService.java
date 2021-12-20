package vn.codegym.c0821g1.services;

import vn.codegym.c0821g1.model.Book;
import vn.codegym.c0821g1.model.User;

import java.util.List;

public interface IBookService {

    Book getById(long id) throws Exception;

    List<Book> getBooks() throws Exception;

    void add(Book newBook) throws Exception;


    void update(Book book) throws Exception;
}
