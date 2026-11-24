import javax.swing.*;
import java.util.*;

public class QuacksFrame extends JFrame {
    private int WIDTH = 1280;
    private int HEIGHT = 720;
    private ArrayList<String> PLAYER_NAMES;
    private TitlePanel titlePanel;
    private SetupPanel setupPanel;
    private GamePanel gamePanel;
    private BooksPanel booksPanel;
    Game g;

    public QuacksFrame(String title) {
        PLAYER_NAMES = new ArrayList<>(Arrays.asList("You", "Robot 1", "Robot 2", "Robot 3"));
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        startGame(1);
        setVisible(true);
    }

    public void showTitle() {
        add(new TitlePanel(this));
    }

    public void showSetup() {
        add(new SetupPanel(this));
    }

    public void showGame() {
        add(new GamePanel());
    }

    public void showBooks(boolean buyMode) {
        add(new BooksPanel(this, g));
    }

    public void startGame(int version) {
        g = new Game(PLAYER_NAMES, 1);
        showTitle();
    }

    public void switchTo(JPanel p) {
        add(p);
    }
}