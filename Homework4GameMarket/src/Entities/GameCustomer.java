package Entities;

import Abstracts.Entity;
import Abstracts.GameCustomerCheckService;

import java.util.Arrays;
import java.util.List;

public class GameCustomer implements Entity {

    GameCustomerCheckService gameCustomerCheckService;

    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String dateOfBirth;
    private String nationalityId;
    public List<Game> games;
    private double wallet;

    public GameCustomer(int id, String firstName, String lastName, String userName, String dateOfBirth, String nationalityId, List<Game> games, double wallet) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
        this.games = games;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
        System.out.println("Bakiyenize değişiklik olmuştur! Yeni bakiye: " + this.wallet +"₺");
    }
}
