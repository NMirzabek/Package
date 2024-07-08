package Transport.OOP;

public class Car extends Vehicle{
    private int madeYear;

    public Car(String name, double price, int wheel, int seats, double weight, int madeYear) {
        super(name, price, wheel, seats, weight);
        this.madeYear = madeYear;
    }

    public Car(){

    }
    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }
}
