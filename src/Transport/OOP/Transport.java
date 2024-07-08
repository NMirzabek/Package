package Transport.OOP;

public class Transport {
    private String name;
    private double price;

    public Transport(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Transport() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
