import java.util.*;

public class FortuneDeck {
    private ArrayList<FortuneCard> deck;

    public FortuneDeck(){
        String[] cardTexts = {"Use your rat stone normally OR pass up on 1-3 rat tails and take that many rubies (1-3) instead.", 
        "Draw 4 chips from your bag. You may trade 1 of them for a chip of the same color with the next higher value. If you can't, make it 1 value 1 green 1-chip. Put all the chips back into the bag.", 
        "Double the number of rat tails in this round.",
        "Move your droplet 2 spaces forward OR take 1 purple chip.",
        "Take 1 black chip OR any one 2-chip OR 3 rubies.", 
        "Everyone rolls the die once and gets the bonus shown.", 
        "The player(s) with the fewest victory points receive(s) 1 green 1-chip.", 
        "Take any one 4-chip OR 1 victory point for each rat tail you get this turn.", 
        "You can trade 1 ruby for any one 1-chip (not purple or black).", 
        "All players draw 5 chips. The player(s) with the lowest sum take(s) 1 blue 2-chip. All other players receive 1 ruby. Put all the chips back into the bag.", 
        "Take 4 victory points OR remove 1 white 1-chip from your bag.", 
        "Move your droplet 1 space forward.", 
        "The player(s) with the fewest rubies receive(s) 1 ruby.", 
        "Any player who gets to roll the die this round rolls twice.", 
        "In this round, you may put the first white chip you draw back into the bag.",
        "The threshold for white chips is raised in this round from 7 to 9.", 
        "After you have placed the first 5 chips in your pot, choose to continue OR begin the round all over again — but you get this choice only once.",
        "Beginning with the start player: if you stopped without an explosion, draw up to 5 chips from your bag. You may place 1 of them in your pot.",
        "If your white chips total exactly 7 at the end of the round, you get to move your droplet 1 space forward.", 
        "If your pot explodes this round, the player to your left gets any one 2-chip.", 
        "If you reach a scoring space with a ruby this round, you get an extra ruby.", 
        "If you reach a scoring space with a ruby this round, you get an extra 2 victory points, even if your pot has exploded.", 
        "In this round, every orange chip is moved 1 extra space forward.",
        "At the end of the round, all flasks get a free refill."};

        deck = new ArrayList<>();

        for(int i = 0; i < 12; i++){
            deck.add(new FortuneCard(i, cardTexts[i], false));
        }
        for(int i = 12; i < 24; i++){
            deck.add(new FortuneCard(i, cardTexts[i], true));
        }
    }
}
