package ru.kata.rodriguez.jpp.spring.services;

import ru.kata.rodriguez.jpp.spring.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
