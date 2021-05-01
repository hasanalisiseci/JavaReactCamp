package Inheritance_Homework;

public class UserManager {

    public void addUser(User user) {
        System.out.printf("%s added to system.\n", user.getFullName());
    }

    public void removeUser(User user) {
        System.out.printf("%s removed from system.\n", user.getFullName());
    }
}
