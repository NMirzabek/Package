package oop.pdp;

public class PaperBooks extends Books{
    private double mass;
    private int deliveryDay;

    public PaperBooks(String author, double price, double discount, String title, int pageNumbers, double mass, int deliveryDay) {
        super(author, price, discount, title, pageNumbers);
        this.mass = mass;
        this.deliveryDay = deliveryDay;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getDeliveryDay() {
        return deliveryDay;
    }

    public void setDeliveryDay(int deliveryDay) {
        this.deliveryDay = deliveryDay;
    }

}
