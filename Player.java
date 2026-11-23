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
    private int maxCherryBombNum;

    public Player(String name, int ver){
        playerName = name;
        version = ver;
    }
    public void fillBag(Token token){
        bag.add(token);
    }
    public Token drawToken(){
        Collections.shuffle(bag);
        return bag.get(0);
    }
    public void placeToken(Token t){
        cauldron.placeToken(t);
    }
    public void updateExploded(){
        exploded = cauldron.checkExploded(maxCherryBombNum);
    }
    public boolean hasExploded(){
        return exploded;
    }
}