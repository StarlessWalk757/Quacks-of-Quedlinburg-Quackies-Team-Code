import java.util.*;

public class GreenSpider extends Token {

    private int cost;

    public GreenSpider(int n, int v) {
        super(n, "", v);
        String d = "";
        if (v == 1) {
            d = "For each green chip that is the last or next-to-last chip in your pot, you recieve 1 ruby.";
        } else if (v == 2) {
            d = "For each green chip that is the last or next-to-last chip in your pot, take 1 of the indicated ingredients";
        } else if (v == 3) {
            d = "If your white chips have an exact value of 7, double the value of each green chip for the rest of the turn.";
        } else if (v == 4) {
            d = "For each green chip that is the last or next-to-last chip in your pot, you may pay 1 ruby to move your droplet 1 space.";
        }
        description = d;
        if (n == 1 && (v == 1 || v == 4)) {
            cost = 4;
        } else if (n == 2 && (v == 1 || v == 4)) {
            cost = 8;
        } else if (n == 4 && (v == 1 || v == 4)) {
            cost = 14;
        } else if (n == 1 && (v == 2 || v == 3)) {
            cost = 6;
        } else if (n == 2 && (v == 2 || v == 3)) {
            cost = 11;
        } else if (n == 4 && v == 2) {
            cost = 18;
        } else if (n == 4 && v == 3) {
            cost = 21;
        }
    }

    public void onEvaluate(Player p, Game g) {
        if (getVersion() == 1) {
            ArrayList<Token> tokens = p.getPlacedTokens();
            if (tokens.getLast() == this || tokens.get(tokens.size() - 2) == this) {
                p.addRubies(1);
            }
        }
    }
}
