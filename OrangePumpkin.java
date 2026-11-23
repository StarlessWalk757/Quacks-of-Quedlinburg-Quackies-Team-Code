import java.util.*;

public class OrangePumpkin extends Token {

    private int cost;

    public OrangePumpkin(int v) {
        super(1, "None. A 1-chip in the pot has no particular function other than filling the pot 1 space. it is the least expensive expensive chip in the game.",
                v);
        cost = 3;

    }
}
