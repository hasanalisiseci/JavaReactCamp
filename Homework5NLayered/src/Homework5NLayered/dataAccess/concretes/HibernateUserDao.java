package Homework5NLayered.dataAccess.concretes;

import Homework5NLayered.dataAccess.abstracts.UserDao;
import Homework5NLayered.entities.concretes.User;

import java.util.*;

public class HibernateUserDao implements UserDao {

    private List<User> users;

    public HibernateUserDao() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void addToSystem(User user) {
        this.users.add(user);
        System.out.println("Kullanıcı veritabanına eklendi " + user.getFirstName()+ user.getLastName()+"#"+user.getId());
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
