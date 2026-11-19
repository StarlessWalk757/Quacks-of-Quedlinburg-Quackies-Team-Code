import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class QuacksPanel extends JPanel implements MouseListener{
    private int AI_MIN_DELAY = 1000;
    private int AI_MAX_DELAY = 3000;
    private int AI_TICK = 100;
    private int GAME_OVER, BUYING, BREWING;
    private int LOG_LINES = 4;
    private int[] SCORE_SPOTS;
    private QuacksFrame frame;
    private Game game;
    private int phase;
    private ArrayList<CauldronView> cauldrons;
    private long[] nextAIMove;
    private Timer aiTimer;
    private Token lastDrawn;
    private Queue<String> log;
    private Rectangle flaskButton, stopButton, drawButton;
    private Rectangle booksButton, dropletButton, refillButton;
    private Rectangle doneButton, newGameButton;
    
    public GamePanel(QuacksFrame frame, Game game) {

    }
    public void paint(Graphics g) {

    }
    public 
}


