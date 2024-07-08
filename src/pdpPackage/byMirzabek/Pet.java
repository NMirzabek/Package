package pdpPackage.byMirzabek;

public class Pet extends Animal{
    private String nickName;

    public Pet(int legs, String color, String nickName) {
        super(legs, color);
        this.nickName = nickName;
    }

    public Pet() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
