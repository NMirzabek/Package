package pdpPackage.byMirzabek;

public class Straus extends Bird{
    private double neckLength;

    public Straus(int legs, String color, String type, double wingLength, double neckLength) {
        super(legs, color, type, wingLength);
        this.neckLength = neckLength;
    }

    public Straus() {
    }

    public double getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(double neckLength) {
        this.neckLength = neckLength;
    }
}
