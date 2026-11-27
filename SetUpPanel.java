import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SetUpPanel extends JPanel implements MouseListener {
    private int VERSION_INFO_STEP;
    private int VERSION_STEP;
    private int step;
    private QuacksFrame frame;
    private final int NUM_PLAYERS = 4;

    private Image parchmentBackground;
    private Image chooseVersionBanner;
    private Image versionTypesBanner;
    private Image questionMarkIcon;
    
    private Image[] versionRats;
    private Image[] versionSpellbooks;

    public SetUpPanel(QuacksFrame frame) {
        this.frame = frame;
        VERSION_STEP = 0;
        VERSION_INFO_STEP = 1;
        step = VERSION_STEP;

        loadImages();
        addMouseListener(this);
    }

    private void loadImages() {
        try {
            parchmentBackground = new ImageIcon(getClass().getResource("/images/parchment_bg.jpg")).getImage();
            chooseVersionBanner = new ImageIcon(getClass().getResource("/images/choose_version_banner.png")).getImage();
            versionTypesBanner = new ImageIcon(getClass().getResource("/images/version_types_banner.png")).getImage();
            questionMarkIcon = new ImageIcon(getClass().getResource("/images/question_mark.png")).getImage();

            versionRats = new Image[] {
                new ImageIcon(getClass().getResource("/images/rat_v1.png")).getImage(),
                new ImageIcon(getClass().getResource("/images/rat_v2.png")).getImage(),
                new ImageIcon(getClass().getResource("/images/rat_v3.png")).getImage(),
                new ImageIcon(getClass().getResource("/images/rat_v4.png")).getImage()
            };

            versionSpellbooks = new Image[] {
                new ImageIcon(getClass().getResource("/images/spellbooks_v1.png")).getImage(),
                new ImageIcon(getClass().getResource("/images/spellbooks_v2.png")).getImage(),
                new ImageIcon(getClass().getResource("/images/spellbooks_v3.png")).getImage(),
                new ImageIcon(getClass().getResource("/images/spellbooks_v4.png")).getImage()
            };
        } catch (Exception e) {
        }
    }

    public void reset() {
        step = VERSION_STEP;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int w = getWidth();
        int h = getHeight();

        if (parchmentBackground != null) {
            g.drawImage(parchmentBackground, 0, 0, w, h, this);
        }

        if (questionMarkIcon != null) {
            int qx = w - (w / 12);
            int qy = h - (h / 5);
            int qw = w / 25;
            int qh = h / 12;
            g.drawImage(questionMarkIcon, qx, qy, qw, qh, this);
        }

        if (step == VERSION_STEP) {
            drawVersionStep(g);
        } else if (step == VERSION_INFO_STEP) {
            drawVersionInfoStep(g);
        }
    }

    private void drawVersionStep(Graphics g) {
        int w = getWidth();
        int h = getHeight();

        if (chooseVersionBanner != null) {
            g.drawImage(chooseVersionBanner, w / 20, h / 20, w / 4, h / 6, this);
        }

        int btnWidth = w / 5;
        int btnHeight = h / 4;

        int[] xs = {w / 12, w / 4, w / 2, (int)(w / 1.4)};
        int[] ys = {h / 2, h / 5, (int)(h / 1.7), h / 5};

        for (int i = 0; i < 4; i++) {
            int rx = xs[i];
            int ry = ys[i];

            g.setColor(new Color(225, 198, 153, 180));
            g.fillRoundRect(rx, ry, btnWidth, btnHeight, 30, 30);
            
            g.setColor(new Color(110, 70, 40));
            g.drawRoundRect(rx, ry, btnWidth, btnHeight, 30, 30);

            g.setFont(new Font("Serif", Font.BOLD, w / 65));
            g.drawString("Version " + (i + 1) + ":", rx + btnWidth / 3, ry + btnHeight / 3);

            if (versionRats[i] != null) {
                int ratSize = w / 12;
                if (i == 0) g.drawImage(versionRats[i], rx - ratSize / 2, ry + btnHeight - ratSize / 2, ratSize, ratSize, this);
                else if (i == 1) g.drawImage(versionRats[i], rx - ratSize, ry + btnHeight / 2, ratSize, ratSize, this);
                else if (i == 2) g.drawImage(versionRats[i], rx - ratSize / 2, ry + btnHeight, ratSize, ratSize, this);
                else if (i == 3) g.drawImage(versionRats[i], (int)(rx - ratSize * 1.2), ry + btnHeight / 2, ratSize, ratSize, this);
            }
        }
    }

    private void drawVersionInfoStep(Graphics g) {
        int w = getWidth();
        int h = getHeight();

        if (versionTypesBanner != null) {
            g.drawImage(versionTypesBanner, w / 20, h / 20, w / 4, h / 6, this);
        }

        int btnWidth = w / 5;
        int btnHeight = h / 4;

        int[] xs = {w / 12, (int)(w / 3.2), w / 2, (int)(w / 1.4)};
        int[] ys = {h / 2, h / 5, h / 2, h / 5};

        for (int i = 0; i < 4; i++) {
            int rx = xs[i];
            int ry = ys[i];

            g.setColor(new Color(225, 198, 153, 180));
            g.fillRoundRect(rx, ry, btnWidth, btnHeight, 30, 30);
            
            g.setColor(new Color(110, 70, 40));
            g.drawRoundRect(rx, ry, btnWidth, btnHeight, 30, 30);

            g.setFont(new Font("Serif", Font.BOLD, w / 65));
            g.drawString("Version " + (i + 1) + ":", rx + btnWidth / 3, ry + btnHeight / 6);

            if (versionSpellbooks[i] != null) {
                g.drawImage(versionSpellbooks[i], rx + btnWidth / 10, ry + btnHeight / 5, btnWidth * 8 / 10, btnHeight * 7 / 10, this);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int px = e.getX();
        int py = e.getY();
        int w = getWidth();
        int h = getHeight();

        int qx = w - (w / 12);
        int qy = h - (h / 5);
        int qw = w / 25;
        int qh = h / 12;

        if (px >= qx && px <= qx + qw && py >= qy && py <= qy + qh) {
            step = (step == VERSION_STEP) ? VERSION_INFO_STEP : VERSION_STEP;
            repaint();
            return;
        }

        int btnWidth = w / 5;
        int btnHeight = h / 4;

        int[] xs;
        int[] ys;

        if (step == VERSION_STEP) {
            xs = new int[]{w / 12, w / 4, w / 2, (int)(w / 1.4)};
            ys = new int[]{h / 2, h / 5, (int)(h / 1.7), h / 5};
        } else {
            xs = new int[]{w / 12, (int)(w / 3.2), w / 2, (int)(w / 1.4)};
            ys = new int[]{h / 2, h / 5, h / 2, h / 5};
        }

        for (int i = 0; i < 4; i++) {
            int rx = xs[i];
            int ry = ys[i];
            if (px >= rx && px <= rx + btnWidth && py >= ry && py <= ry + btnHeight) {
                frame.startGame(NUM_PLAYERS, i + 1);
                break;
            }
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
