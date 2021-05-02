package Inheritance_Homework;

public class User {
    private int id;
    private String fullName;
    private String mailAddress;

    public User(int id, String fullName, String mailAddress) {
        this.id = id;
        this.fullName = fullName;
        this.mailAddress = mailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}
