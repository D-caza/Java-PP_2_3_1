package ru.kata.rodriguez.jpp.spring.dao;

import ru.kata.rodriguez.jpp.spring.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}