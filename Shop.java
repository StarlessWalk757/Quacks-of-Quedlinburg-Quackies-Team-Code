public class Shop
{
    private HashMap<String, Integer> prices;
    private int version;

    public Shop(int v)
    {
        version = v;
        if(version == 1)
        {
            prices.put("OrangePumpkin 1", 3);
            prices.put("GreenSpider 1", 4);
            prices.put("GreenSpider 2", 8);
            prices.put("GreenSpider 4", 14);
            prices.put("PurpleGhost 1", 9);
            prices.put("RedToadstool 1", 6);
            prices.put("RedToadstool 2", 10);
            prices.put("RedToadstool 4", 16);
            prices.put("BlackMoth 1", 10);
            prices.put("BlueSkulls 1", 5);
            prices.put("BlueSkulls 2", 10);
            prices.put("BlueSkulls 4", 19);
            prices.put("YellowMandrake 1", 8);
            prices.put("YellowMandrake 2", 12);
            prices.put("YellowMandrake 4", 18);
        }else if(version == 2)
        {  
            prices.put("OrangePumpkin 1", 3);
            prices.put("GreenSpider 1", 6);
            prices.put("GreenSpider 2", 11);
            prices.put("GreenSpider 4", 18);
            prices.put("PurpleGhost 1", 12);
            prices.put("RedToadStool 1", 4);
            prices.put("RedToadStool 2", 8);
            prices.put("RedToadStool 4", 14);
            prices.put("BlackMoth 1", 10);
            prices.put("BlueSkulls 1", 5);
            prices.put("BlueSkulls 2", 10);
            prices.put("BlueSkulls 4", 19);
            prices.put("YellowMandrake 1", 9);
            prices.put("YellowMandrake 2", 13);
            prices.put("YellowMandrake 4", 19);
        }else if(version == 3)
        {
            prices.put("OrangePumpkin 1", 3);
            prices.put("GreenSpider 1", 6);
            prices.put("GreenSpider 2", 11);
            prices.put("GreenSpider 4", 21);
            prices.put("PurpleGhost 1", 10);
            prices.put("RedToadStool 1", 5);
            prices.put("RedToadStool 2", 9);
            prices.put("RedToadStool 4", 15);
            prices.put("BlackMoth 1", 10);
            prices.put("BlueSkulls 1", 4);
            prices.put("BlueSkulls 2", 8);
            prices.put("BlueSkulls 4", 14);
            prices.put("YellowMandrake 1", 8);
            prices.put("YellowMandrake 2", 12);
            prices.put("YellowMandrake 4", 18);
        }else{
            prices.put("OrangePumpkin 1", 3);
            prices.put("GreenSpider 1", 4);
            prices.put("GreenSpider 2", 8);
            prices.put("GreenSpider 4", 14);
            prices.put("PurpleGhost 1", 11);
            prices.put("RedToadStool 1", 7);
            prices.put("RedToadStool 2", 11);
            prices.put("RedToadStool 4", 17);
            prices.put("BlackMoth 1", 10);
            prices.put("BlueSkulls 1", 5);
            prices.put("BlueSkulls 2", 10);
            prices.put("BlueSkulls 4", 19);
            prices.put("YellowMandrake 1", 8);
            prices.put("YellowMandrake 2", 12);
            prices.put("YellowMandrake 4", 18);
        }
    }

    public int getCost(Token t)
    {
        String description = t.getDescription() + " " + t.getNumSpaces();
        return prices.get(description);
    }

    public ArrayList<Token> getAvailable(int round)
    {
        if(version == 1) 
		{
            if(round == 1) {
                prices.remove("YellowMandrake 1");
                prices.remove("YellowMandrake 2");
                prices.remove("YellowMandrake 4");
                prices.remove("PurpleGhost 1");
            } else if(round == 2) {
                prices.put("YellowMandrake 1", 8);
                prices.put("YellowMandrake 2", 12);
                prices.put("YellowMandrake 4", 18);
            } else if(round == 3) {
                prices.put("PurpleGhost 1", 9);
            }
		}else if(version == 2) 
		{
            if(round == 1)
            {
                prices.remove("YellowMandrake 1");
                prices.remove("YellowMandrake 2");
                prices.remove("YellowMandrake 4");
                prices.remove("PurpleGhost 1");
            }else if(round == 2) {
                prices.put("YellowMandrake 1", 9);
                prices.put("YellowMandrake 2", 13);
                prices.put("YellowMandrake 4", 19);
            }else if(round == 3) {
                prices.put("PurpleGhost 1", 12);
            }
		}else if(version == 3)
		{
            if(round == 1) 
            {
                prices.remove("YellowMandrake 1");
                prices.remove("YellowMandrake 2");
                prices.renove("YellowMandrake 4");
                prices.remove("PurpleGhost 1");
            }else if(round == 2)
            {
                prices.put("YellowMandrake 1", 8);
                prices.put("YellowMandrake 2", 12);
                prices.put("YellowMandrake 4", 18);
            }else if(round == 3)
            {
                prices.put("PurpleGhost 1", 10);
            }
		}else{
		{
            if(round == 1)
            {
                prices.put("YellowMandrake 1");
                prices.put("YellowMandrake 2");
                prices.put("YellowMandrake 4");
                prices.put("PurpleGhost 1");
            }else if(round == 2)
            {
                prices.put("YellowMandrake 1", 8);
                prices.put("YellowMandrake 2", 12);
                prices.put("YellowMandrake 4", 18);
            }else if(round == 3)
            {
                prices.put("PurpleGhost 1", 11);
            }
		}      

    }

    public boolean buy(Player p, Token t)
    {
        ArrayList<Token> boughtToken = p.getBoughtThisRound();
        boolean bought = false;

        for(int i = 0; i < boughtToken.size(); i++)
        {
            if(boughtToken.get(i) == t)
                bought = true;
        }

        if(p.getMoney() < t.getCost()) {
            return false;
        }else if(bought == true)
            return false;
        }
        return true;
    }
}
