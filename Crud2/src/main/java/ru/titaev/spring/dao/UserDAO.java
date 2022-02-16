package ru.titaev.spring.dao;

import ru.titaev.spring.models.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void createUser(User user);
    User readUser(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
