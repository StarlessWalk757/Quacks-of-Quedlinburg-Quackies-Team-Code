public class FortuneCard{
    private String description;
    private int fortuneID;
    private boolean isBlue;

    public FortuneCard(int id, String desc, boolean blue){
        description= desc;
        fortuneID = id;
        isBlue = blue;
    }

    public void applyEffect(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFortuneID() {
        return fortuneID;
    }

    public void setFortuneID(int fortuneID) {
        this.fortuneID = fortuneID;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean isBlue) {
        this.isBlue = isBlue;
    }

}