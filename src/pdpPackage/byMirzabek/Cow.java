package pdpPackage.byMirzabek;

public class Cow extends Pet{
    private double dailyMilkAmount;

    public Cow(int legs, String color, String nickName, double dailyMilkAmount) {
        super(legs, color, nickName);
        this.dailyMilkAmount = dailyMilkAmount;
    }

    public Cow() {
    }

    public double getDailyMilkAmount() {
        return dailyMilkAmount;
    }

    public void setDailyMilkAmount(double dailyMilkAmount) {
        this.dailyMilkAmount = dailyMilkAmount;
    }
}
