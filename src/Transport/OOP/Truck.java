package Transport.OOP;

public class Truck extends Vehicle{
    private int height;

    public Truck(String name, double price, int wheel, int seats, double weight, int height) {
        super(name, price, wheel, seats, weight);
        this.height = height;
    }

    public Truck(){

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
