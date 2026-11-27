import java.util.*;

public class YellowMandrake extends Token {

    private int cost;

    public YellowMandrake(int n, int v) {
        super(n, "If the previously played chip was white, put the white chip back into the bag", v);
        if (n == 1) {
            cost = 8;
        } else if (n == 2) {
            cost = 12;
        } else if (n == 4) {
            cost = 18;
        }
    }

    public void onPlace(Player p, Game g) {
        ArrayList<Token> tokens = p.getPlacedTokens();
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i) instanceof YellowMandrake) {
                if (tokens.get(i - 1) instanceof WhiteCherryBomb) {
                    tokens.remove(i - 1);
                }
            }
        }
    }
}
