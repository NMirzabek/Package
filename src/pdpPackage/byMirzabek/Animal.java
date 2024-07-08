package pdpPackage.byMirzabek;

public class Animal {
    private int legs;
    private String color;

    public Animal() {
    }

    public Animal(int legs, String color) {
        this.legs = legs;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
