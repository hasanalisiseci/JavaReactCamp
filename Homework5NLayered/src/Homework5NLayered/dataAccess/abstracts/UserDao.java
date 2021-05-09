package Homework5NLayered.dataAccess.abstracts;

import Homework5NLayered.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void addToSystem(User user);
    List<User> getAll();

}
