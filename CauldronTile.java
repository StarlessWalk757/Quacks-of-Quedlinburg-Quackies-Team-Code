public class CauldronTile {
    private int victoryPoints;
    private int money;
    private boolean hasRuby;
    private Token token;

    public CauldronTile(int vp, int monie, boolean rubrub, Token toucan){
        victoryPoints = vp;
        money = monie;
        hasRuby = rubrub;
        token = toucan;
    }

    public void setVictoryPoints(int vp){
        victoryPoints = vp;
    }
    public void setMoney(int mon){
        money = mon;
    }
    public void setHasRuby(boolean rub){
        hasRuby = rub;
    }
    public void setToken(Token tok){
        token = tok;
    }

    public int getVictoryPoints(){
        return victoryPoints;
    }
    public int getMoney(){
        return money;
    }
    public boolean containsRuby(){
        return hasRuby;
    }
    public Token getToken(){
        return token;
    }
}
