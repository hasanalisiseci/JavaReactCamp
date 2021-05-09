package Homework5NLayered.business.concretes;

import Homework5NLayered.business.abstracts.UserInfoCheckService;
import Homework5NLayered.business.abstracts.UserService;
import Homework5NLayered.business.abstracts.ValidityService;
import Homework5NLayered.core.abstracts.OuterService;
import Homework5NLayered.dataAccess.abstracts.UserDao;
import Homework5NLayered.entities.concretes.User;

public class UserManager implements UserService {
    UserInfoCheckService checkService;
    UserDao userDao;
    OuterService outerService;

    public UserManager(UserInfoCheckService checkService, UserDao userDao, OuterService outerService) {
        this.checkService = checkService;
        this.userDao = userDao;
        this.outerService = outerService;
    }

    @Override
    public void userRegister(User user) {

        ValidityService validityService = new ValidityManager(userDao);
        if (validityService.isUsed(user.getMail())
                && checkService.mailCheck(user.getMail())
                && checkService.firstNameCheck(user.getFirstName())
                && checkService.lastNameCheck(user.getLastName())
                && checkService.passwordCheck(user.getPassword()))
        {
            userDao.addToSystem(user);
            outerService.registerWOS();
            System.out.println(user.getMail() + " adresine doğrulama mail'i gönderildi.: " + user.getMail());
            System.out.println(user.getFirstName() + " " + user.getLastName() + " üyeliğiniz başarıyla gerçekleştirilmiştir.");
        }
    }

    @Override
    public void signIn(String email, String password) {

        for (int i = 0; i < userDao.getAll().size(); i++) {
            if (userDao.getAll().get(i).getMail().equals(email) &&
                    userDao.getAll().get(i).getPassword().equals(password)) {
                System.out.println("Giriş Başarılı!");
                return;
            }
        }
        System.out.println("Mail veya parola hatalı!");
    }
}
