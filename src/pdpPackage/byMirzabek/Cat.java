package pdpPackage.byMirzabek;

public class Cat extends Pet{
    private double tailLength;

    public Cat(int legs, String color, String nickName, double tailLength) {
        super(legs, color, nickName);
        this.tailLength = tailLength;
    }

    public Cat() {
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
