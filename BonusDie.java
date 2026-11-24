public class BonusDie {
    String[] faces = {"Ruby", "Pumpkin", "1 VP", "1 VP", "2 VP", "Droplet"};

    public BonusDie(){}

    public String roll(){
        return faces[(int)(Math.random()*6)];
    }
}
