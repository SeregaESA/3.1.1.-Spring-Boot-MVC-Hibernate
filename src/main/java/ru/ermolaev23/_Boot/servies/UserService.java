package ru.ermolaev23._Boot.servies;


import ru.ermolaev23._Boot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void save(User user);

    User getOne(long id);

    void update(long id, User user);

    void delete(long id);
}
