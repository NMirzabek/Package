package pdpPackage.byMirzabek;

public class Bird extends Animal {
    private String type;
    private double wingLength;

    public Bird(int legs, String color, String type, double wingLength) {
        super(legs, color);
        this.type = type;
        this.wingLength = wingLength;
    }

    public Bird() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }
}
