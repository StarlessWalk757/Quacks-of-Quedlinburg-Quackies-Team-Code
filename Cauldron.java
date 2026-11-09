import java.util.*;

public class Cauldron {
    private final int TOTAL_NUMBER_OF_SPACES = 33;
    TreeSet<CauldronTile> pot;
    private CauldronTile lastSpace;
    
    public Cauldron(){
        pot = new TreeSet<CauldronTile>();
        
    }

    public CauldronTile getLastSpace() {
        return lastSpace;
    }

    public void updateLastSpace(){
        boolean hasNextSpace = true;
        Iterator<CauldronTile> iter = pot.iterator();
        Token currToken = iter.next.getToken();
        while(hasNextSpace){
            int spaces = currToken.getToken.getNum();
            for(int i = 0; i < spaces; i++){
                iter.next();
            }
        }
    }
}
