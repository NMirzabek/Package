package Transport.OOP;

public class Tram extends Train{
    //Tramvay
    private double electorUse;

    public Tram(String name, double price, double length, String fuelType, double electorUse) {
        super(name, price, length, fuelType);
        this.electorUse = electorUse;
    }

    public Tram() {
    }

    public double getElectorUse() {
        return electorUse;
    }

    public void setElectorUse(double electorUse) {
        this.electorUse = electorUse;
    }
}
