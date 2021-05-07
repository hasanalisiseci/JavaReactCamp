package Entities;

import Abstracts.Entity;

public class Game implements Entity {
    private int id;
    private String gameName;
    private double requiredMemory;
    private double price;
    private int percentageOfDiscount;

    public Game(int id, String gameName, double requiredMemory, double price) {
        this.id = id;
        this.gameName = gameName;
        this.requiredMemory = requiredMemory;
        this.price = price;
        this.percentageOfDiscount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getRequiredMemory() {
        return requiredMemory;
    }

    public void setRequiredMemory(double requiredMemory) {
        this.requiredMemory = requiredMemory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPercentageOfDiscount() {
        return percentageOfDiscount;
    }

    public void setPercentageOfDiscount(int percentageOfDiscount) {
        this.percentageOfDiscount = percentageOfDiscount;
    }
}
