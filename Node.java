public class Node {
    private int victoryPoint;
    private boolean hasRatTailAfter;
    private Node next;


    public Node(int v, boolean r) {
        victoryPoint = v;
        hasRatTailAfter = r;
    }


    public int getVictoryPoint() {
        return victoryPoint;
    }


    public void setVictoryPoint(int victoryPoint) {
        this.victoryPoint = victoryPoint;
    }


    public boolean isHasRatTailAfter() {
        return hasRatTailAfter;
    }


    public void setHasRatTailAfter(boolean hasRatTailAfter) {
        this.hasRatTailAfter = hasRatTailAfter;
    }


    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }
}
