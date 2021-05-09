package Homework5NLayered.business.abstracts;

import java.util.regex.Matcher;

public interface UserInfoCheckService {
    boolean passwordCheck(String password);
    boolean mailCheck(String mail);
    boolean firstNameCheck(String firstName);
    boolean lastNameCheck(String lastName);
}
