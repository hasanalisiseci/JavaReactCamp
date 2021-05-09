package Homework5NLayered.business.concretes;

import Homework5NLayered.business.abstracts.ValidityService;
import Homework5NLayered.dataAccess.abstracts.UserDao;
import Homework5NLayered.entities.concretes.User;

public class ValidityManager implements ValidityService {

    private UserDao userDao;

    public ValidityManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean isUsed(String mail) {
        for (User user: userDao.getAll()) {
            if(mail.equals(user.getMail())) {
                System.out.println("Bu mail kullanılmıştır!: " + mail);
                return false;
            }
        }
        return true;
    }
}
