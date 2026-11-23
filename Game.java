import java.util.*;

public class Game {
    private ArrayList<Player> players;
    private Scoreboard scoreboard;
    private Shop shop;
    private BonusDie bonusDie;
    private FortuneDeck fortuneDeck;
    private FortuneCard currentFortune;
    private int round;
    private int version;
    private final int MAX_ROUNDS = 9;

    public Game(ArrayList<String> playerNames, int version) {
        players = new ArrayList<>();
        scoreboard = new Scoreboard();
        shop = new Shop(version);
        bonusDie = new BonusDie();
        fortuneDeck = new FortuneDeck();
        currentFortune = new FortuneCard();
        for (int i = 0; i < playerNames.size(); i++) {
            players.add(new Player(playerNames.get(i), version));
        }
    }

}