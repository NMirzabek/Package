package oop.pdp;

public class EBook extends Books{
    private String website;
    private double volume; //mb

    public EBook(String author, double price, double discount, String title, int pageNumbers, String website, double volume) {
        super(author, price, discount, title, pageNumbers);
        this.website = website;
        this.volume = volume;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
