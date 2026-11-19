import java.util.*;

public class Scoreboard {
    private Node head;
    public Scoreboard() {
        head = new Node(1, true);
        Node temp = head;
        for(int i = 2; i <= 50; i++) {
            if(i == 4 || i == 10 || i == 12 || i== 14 || i == 16 || i == 18 || i == 20 || i == 22 || i== 24 || i == 26 || i == 28 || i == 30 || i == 32 || i== 34 || i == 36 || i == 38 || i == 40 || i == 42 || i== 44 || i == 46 || i == 48) {
                temp.setNext(new Node(i, true));
            }
            else {
                temp.setNext(new Node(i, false));
            }
            temp = temp.getNext();
        }
    }
}