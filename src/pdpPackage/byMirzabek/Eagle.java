package pdpPackage.byMirzabek;

public class Eagle extends Bird{
    private String preyTime;

    public Eagle(int legs, String color, String type, double wingLength, String preyTime) {
        super(legs, color, type, wingLength);
        this.preyTime = preyTime;
    }

    public Eagle() {
    }

    public String getPreyTime() {
        return preyTime;
    }

    public void setPreyTime(String preyTime) {
        this.preyTime = preyTime;
    }
}
