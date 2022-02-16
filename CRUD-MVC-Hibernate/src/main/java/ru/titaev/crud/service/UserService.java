package ru.titaev.crud.service;

import ru.titaev.crud.models.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void createUser(User user);
    User readUser(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
