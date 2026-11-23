import java.util.*;

public class BlackMoth extends Token {

    private int cost;

    public BlackMoth(int n, int v) {
        super(n, "For 1, 2, or 3 purple chips, you receive the indicated bonus.", v);

        cost = 9;
    }

    public void onEvaluate(Player p, Game g) {
        ArrayList<Token> tokens = p.getPlacedTokens();
        int cnt = 0;
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i) instanceof PurpleGhost) {
                cnt++;
            }
        }

        if (cnt == 1) {
            p.addVP(1);
        } else if (cnt == 2) {
            p.addVP(1);
            p.addRubies(1);
        } else if (cnt == 3) {
            p.addVP(2);
            p.moveDroplet(1);
        }
    }
}
