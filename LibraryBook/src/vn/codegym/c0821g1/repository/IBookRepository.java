package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.model.Book;
import vn.codegym.c0821g1.model.User;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {
    User getById(long id);

    List<User> getBooks();

    boolean exist(long id);

    void add(Book newBook);

    void update(Book book);

}
