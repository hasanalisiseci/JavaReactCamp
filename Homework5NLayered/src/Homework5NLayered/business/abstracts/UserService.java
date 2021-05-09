package Homework5NLayered.business.abstracts;

import Homework5NLayered.entities.concretes.User;

public interface UserService {
    void userRegister(User user);
    void signIn(String email, String password);
}
