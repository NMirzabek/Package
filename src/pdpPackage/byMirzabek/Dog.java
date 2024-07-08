package pdpPackage.byMirzabek;

public class Dog extends Pet{
    private double earLength;

    public Dog(int legs, String color, String nickName, double earLength) {
        super(legs, color, nickName);
        this.earLength = earLength;
    }

    public Dog() {
    }

    public double getEarLength() {
        return earLength;
    }

    public void setEarLength(double earLength) {
        this.earLength = earLength;
    }
}
