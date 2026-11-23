public class Token {
    protected int numSpaces;
    protected String description;
    protected int cost;
    private int version;

    public Token(int n, String d, int v) {
        numSpaces = n;
        description = d;
        version = v;
    }

    public int getNumSpaces() {
        return numSpaces;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public void onPlace(Player p, Game g) {

    }

    public void onEvaluate(Player p, Game g) {

    }

    public int getVersion() {
        return version;
    }

}
