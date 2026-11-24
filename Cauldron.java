import java.util.*;

public class Cauldron {
    private final int TOTAL_NUMBER_OF_SPACES = 54;
    ArrayList<CauldronTile> pot;
    private CauldronTile lastSpace;

    public Cauldron() {
        pot = new ArrayList<CauldronTile>();
        pot.add(new CauldronTile(0, 0, false, null));
    }

    public CauldronTile getLastSpace() {
        return lastSpace;
    }

    public void updateLastSpace() {
        CauldronTile curr = new CauldronTile(-1, -1, false, null);
        for (int i = pot.size() - 1; i > 0; i++) {
            if (pot.get(i).getToken() != null) {
                curr = pot.get(i);
                break;
            }
        }
        lastSpace = curr;
    }

    public void placeToken(Token t) {
        pot.get(pot.indexOf(lastSpace) + t.getNumSpaces()).setToken(t);
    }

    public int getTotalSpaces() {
        return TOTAL_NUMBER_OF_SPACES;
    }
}
