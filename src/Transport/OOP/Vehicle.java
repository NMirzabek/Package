package Transport.OOP;

public class Vehicle extends Transport{
    private int wheel;
    private int seats;
    private double weight;

    public Vehicle(String name, double price, int wheel, int seats, double weight) {
        super(name, price);
        this.wheel = wheel;
        this.seats = seats;
        this.weight = weight;
    }

    public Vehicle() {
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
