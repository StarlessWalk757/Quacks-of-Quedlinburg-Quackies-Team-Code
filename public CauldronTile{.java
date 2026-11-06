public CauldronTile
{
    private boolean hasRuby;
    private int victoryPoints;
    private int money;
    private Token token;
    private boolean isUsed;

    public void CauldronTile(boolean ruby, int vP, int m)
    {
        hasRuby = ruby;
        victoryPoints = vP;
        money = m;
        isUsed = false;
    }

    public boolean hasRuby() 
    {
        return hasRuby;
    }

    public int getVictoryPoints()
    {
        return victoryPoints;
    }

    public int getMoney()
    {
        return money;
    }

    public void setToken(Token t){
        token = t;
    }

    public void clearToken(){
        token = null;
    }

    public void passToken(){
        isUsed = true;
    }

    public boolean hasToken() {
        if(token != null) {
            return true;
        }
        return false;
    }

    public Token getToken() {
        return token;
    }
}