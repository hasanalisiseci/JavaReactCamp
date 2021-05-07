package Entities;

public class Campaign {
    private int id;
    private String name;
    private int percentageOfDiscount;

    public Campaign(int id, String name, int percentageOfDiscount) {
        this.id = id;
        this.name = name;
        this.percentageOfDiscount = percentageOfDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentageOfDiscount() {
        return percentageOfDiscount;
    }

    public void setPercentageOfDiscount(int percentageOfDiscount) {
        this.percentageOfDiscount = percentageOfDiscount;
    }
}
