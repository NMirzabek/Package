package pdpPackage.byMirzabek;

public class Bat extends Bird{
    private String preyTime;

    public Bat(int legs, String color, String type, double wingLength, String preyTime) {
        super(legs, color, type, wingLength);
        this.preyTime = preyTime;
    }
    public Bat() {
    }

    public String getPreyTime() {
        return preyTime;
    }

    public void setPreyTime(String preyTime) {
        this.preyTime = preyTime;
    }

}
