package vn.codegym.c0821g1.repository;

import vn.codegym.c0821g1.exception.LibraryBookException;
import vn.codegym.c0821g1.model.*;
import vn.codegym.c0821g1.utils.CsvUtils;
import vn.codegym.c0821g1.utils.DateUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public List<User> getBooks() {
        return null;
    }

    @Override
    public boolean exist(long id) {
        return false;
    }

    @Override
    public void add(Book newBook) {

    }

    @Override
    public void update(Book book) {

    }
}
