package ru.titaev.crud.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.titaev.crud.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<User> allUsers() {
        return manager.createQuery("select u from User u",User.class).getResultList();
    }

    @Override
    public void createUser(User user) {
        manager.persist(user);
    }

    @Override
    public User readUser(int id) {
        return manager.find(User.class, id);
    }

    @Override
    public void updateUser(int id, User user) {
        manager.merge(user);
    }

    @Override
    public void deleteUser(int id) {
        manager.remove(readUser(id));
    }
}
