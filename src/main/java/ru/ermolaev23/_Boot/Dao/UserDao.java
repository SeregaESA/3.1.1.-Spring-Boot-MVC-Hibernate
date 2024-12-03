package ru.ermolaev23._Boot.Dao;


import ru.ermolaev23._Boot.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAll();

    void save(User user);

    User getOne(long id);

    void update(long id, User user);

    void delete(long id);
}
