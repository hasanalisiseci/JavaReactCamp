package Homework5NLayered;

import Homework5NLayered.business.concretes.UserInfoCheckManager;
import Homework5NLayered.business.concretes.UserManager;
import Homework5NLayered.core.concretes.GoogleUserManagerAdapter;
import Homework5NLayered.core.concretes.NoAdapter;
import Homework5NLayered.dataAccess.concretes.HibernateUserDao;
import Homework5NLayered.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Hasan Ali", "Şişeci", "sisecihasanali", "h.alisiseci@gmail.com");
        User user2 = new User(2, "Mehmet", "Bayram", "mehmet321", "mehmetgmail.com");
        User user3 = new User(3, "Emre", "Kul", "123", "emre.kul321@gmail.com");
        User user4 = new User(4, "Zeynep", "Gedik", "gedikZeynep", "zgedik@gmail.com");



        UserManager userManager = new UserManager(new UserInfoCheckManager(), new HibernateUserDao(), new NoAdapter());

        userManager.userRegister(user1);
        userManager.userRegister(user2);
        userManager.userRegister(user3);


        UserManager userManager1 = new UserManager(new UserInfoCheckManager(), new HibernateUserDao(), new GoogleUserManagerAdapter());
        userManager1.userRegister(user4);

        userManager.signIn("h.alisiseci@gmail.com", "sisecihasanal");
        userManager.signIn("oz57kan@gmail.com", "123456789");
    }
}
