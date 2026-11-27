import java.util.*;

public class RedToadstool extends Token {

    public RedToadstool(int n, int v) {
        super(n, "If there are already orange chips in your pot, move the red chips forward according to the chart", v);
        if (n == 1) {
            cost = 6;
        } else if (n == 2) {
            cost = 10;
        } else if (n == 4) {
            cost = 16;
        }
    }

    public void onPlace(Player p, Game g) {
        ArrayList<Token> tokens = p.getPlacedTokens();
        int cnt = 0;
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i) instanceof OrangePumpkin) {
                cnt++;
            }
        }
        Token temp = tokens.getLast();
        if (cnt == 1 || cnt == 2) {
            p.getCauldron().placeToken(new RedToadstool(temp.getNumSpaces() + 1, temp.getVersion()));
        } else if (cnt >= 3) {
            p.getCauldron().placeToken(new RedToadstool(temp.getNumSpaces() + 2, temp.getVersion()));
        }
    }
}
