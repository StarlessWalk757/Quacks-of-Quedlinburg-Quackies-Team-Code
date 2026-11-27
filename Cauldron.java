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

    public boolean checkExploded(int max){
        int cnt = 0;
        for(int i = 0; i < pot.size(); i++){
            if(pot.get(i).getToken() != null && pot.get(i).getToken().getName().equals("Cherry Bomb")){
                cnt++;
            }
        }
        return cnt > max;
    }

    public ArrayList<Token> getPlacedTokens(){
        ArrayList<Token> ans = new ArrayList<>();
        for(CauldronTile tile : pot){
            if(tile.getToken() != null){
                ans.add(tile.getToken());
            }
        }
        return ans;
    }
}
