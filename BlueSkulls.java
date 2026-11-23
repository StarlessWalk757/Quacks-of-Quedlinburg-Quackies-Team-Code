import java.util.*;

public class BlueSkulls extends Token {

    public BlueSkulls(int n, int v) {
        super(n, "Draw 1/2/4 chips from your bag. You may place 1 of them in your pot.", v);
        if (n == 1) {
            cost = 5;
        } else if (n == 2) {
            cost = 10;
        } else if (n == 4) {
            cost = 19;
        }
    }

    public void onPlace(Player p, Game g) {
        ArrayList<Token> tokens = p.getPlacedTokens();
        Token temp = tokens.getLast();
        Collections.shuffle(tokens);
        if (temp.getNumSpaces() == 1) {
            Token first = tokens.get(0);
        } else if (temp.getNumSpaces() == 2) {
            Token first = tokens.get(0);
            Token second = tokens.get(1);
        } else if (temp.getNumSpaces() == 3) {
            Token first = tokens.get(0);
            Token second = tokens.get(1);
            Token third = tokens.get(2);
            Token fourth = tokens.get(3);
        }
    }
}
