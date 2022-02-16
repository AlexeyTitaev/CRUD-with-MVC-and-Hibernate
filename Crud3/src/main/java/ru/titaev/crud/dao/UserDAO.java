package ru.titaev.crud.dao;

import ru.titaev.crud.models.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void createUser(User user);
    User readUser(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
