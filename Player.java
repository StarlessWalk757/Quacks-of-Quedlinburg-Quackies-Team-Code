import java.util.*;

public class Player {
    private String playerName;
    private int version;
    private int numRubies;
    private int numVictoryPts;
    private int money;
    private int dropletLocation;
    private int potPosition;
    private int ratTails;
    private boolean hasFlask;
    private boolean exploded;
    private boolean stopped;
    private ArrayList<Token> boughtThisRound;
    private ArrayList<Token> bag;
    Cauldron cauldron;
    private ArrayList<Token> tokenList;
    private int maxCherryBombNum;

    

    public Player(String name, int ver) {
        playerName = name;
        version = ver;
        boughtThisRound = new ArrayList<>();
        bag = new ArrayList<>();
        tokenList = new ArrayList<>();
        cauldron = new Cauldron();
        maxCherryBombNum = 7;
    }

    public  void moveDroplet(int c) {
        dropletLocation = dropletLocation + c;
    }

    public void addVP(int j) {
        numVictoryPts = numVictoryPts + j;
    }

    public void fillBag(Token token) {
        bag.add(token);
    }

    public Token drawToken() {
        if (bag.size() > 0) {
            Collections.shuffle(bag);
            Token temp = bag.get(0);
            bag.remove(0);
            return temp;
        } else {
            return null;
        }
    }

    public void placeToken(Token t) {
        cauldron.placeToken(t);
    }
    public void updateExploded(){
        exploded = cauldron.checkExploded(maxCherryBombNum);
    }
    public boolean hasExploded(){
        return exploded;
    }

    public ArrayList<Token> getPlacedTokens() {
        return cauldron.getPlacedTokens();
    }

    public Cauldron getCauldron() {
        return cauldron;
    }

    public void addRubies(int n) {
        numRubies += n;
    }

    public void spendRubies(int n){
        numRubies -= n;
    }

    public boolean refillFlask(){
        if(numRubies >= 2){
            numRubies -= 2;
            hasFlask = true;
            return true;
        }else{
            return false;
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getVersion() {
        return version;
    }

    public int getNumRubies() {
        return numRubies;
    }

    public int getNumVictoryPts() {
        return numVictoryPts;
    }

    public int getMoney() {
        return money;
    }

    public int getDropletLocation() {
        return dropletLocation;
    }

    public int getPotPosition() {
        return potPosition;
    }

    public int getRatTails() {
        return ratTails;
    }

    public boolean isHasFlask() {
        return hasFlask;
    }

    public boolean isStopped() {
        return stopped;
    }

    public ArrayList<Token> getBoughtThisRound() {
        return boughtThisRound;
    }

    public ArrayList<Token> getBag() {
        return bag;
    }

    public ArrayList<Token> getTokenList() {
        return tokenList;
    }

    public int getMaxCherryBombNum() {
        return maxCherryBombNum;
    }
    public void setMaxCherryBombNum(int n){
        maxCherryBombNum = n;
    }
}
