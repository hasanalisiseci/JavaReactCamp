package Homework5NLayered.business.concretes;

import Homework5NLayered.business.abstracts.UserInfoCheckService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoCheckManager implements UserInfoCheckService {

    public UserInfoCheckManager() {}

    @Override
    public boolean passwordCheck(String password) {
        if (password.length() < 6) {
            System.out.println("Şifreniz 6 karakterden kısa olamaz!");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean mailCheck(String mail) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Mailiniz geçersiz! Lütfen geçerli bir mail giriniz. Mail:" + mail);
            return false;
        }
    }

    @Override
    public boolean firstNameCheck(String firstName) {
        if (nameCheck(firstName)) {
            return true;
        } else {
            System.out.println("İsminiz 2 karakterden kısa olamaz!");
            return false;
        }
    }

    @Override
    public boolean lastNameCheck(String firstName) {
        if (nameCheck(firstName)) {
            return true;
        } else {
            System.out.println("İsminiz 2 karakterden kısa olamaz!");
            return false;
        }
    }

    public boolean nameCheck(String str) {
        return str.length()>=2;
    }
}
