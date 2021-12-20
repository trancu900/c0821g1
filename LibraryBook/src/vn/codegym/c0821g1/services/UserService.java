package vn.codegym.c0821g1.services;

import vn.codegym.c0821g1.model.User;
import vn.codegym.c0821g1.repository.IUserRepository;

import java.util.List;

public class UserService implements IUserService {
    private IUserRepository repository;

    public UserService(IUserRepository repository) {
        this.repository = repository;
    }


    @Override
    public User getById(long id) throws Exception {
        User user = repository.getById(id);
        if (user != null)
            throw new Exception("Nguoi ton tai nguoi dung");
        return user;
    }

    @Override
    public List<User> getUsers() throws Exception {
        return repository.getUsers();
    }

    @Override
    public void addUser(User newUser) throws Exception {
        if (repository.exist(newUser.getId()))
            throw new Exception("Nguoi ton tai nguoi dung");
        repository.add(newUser);
    }

    @Override
    public void updateUser(User user) throws Exception {
        if (repository.exist(user.getId()))
            throw new Exception("Nguoi ton tai nguoi dung");
        repository.update(user);
    }
}
