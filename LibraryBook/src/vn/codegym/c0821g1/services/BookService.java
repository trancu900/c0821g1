package vn.codegym.c0821g1.services;

import vn.codegym.c0821g1.model.Book;
import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.repository.IBookRepository;
import vn.codegym.c0821g1.repository.IUserRepository;

import java.util.List;

public class BookService implements IBookService {
    private IBookRepository repository;

    public BookService(IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book getById(long id) throws Exception {
        return null;
    }

    @Override
    public List<Book> getBooks() throws Exception {
        return null;
    }

    @Override
    public void add(Book newBook) throws Exception {

    }

    @Override
    public void update(Book book) throws Exception {

    }
}
