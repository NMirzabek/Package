package Transport.OOP;

public class Train extends Transport{
    private double length;
    private String fuelType;

    public Train(String name, double price, double length, String fuelType) {
        super(name, price);
        this.length = length;
        this.fuelType = fuelType;
    }

    public Train() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
