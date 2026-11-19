public class GreenSpider extends Token{
    public GreenSpider(int n, int v) {
        String d = "";
        if(v == 1) {
            d = "For each green chip that is the last or next-to-last chip in your pot, you recieve 1 ruby.";
        } else if(v == 2) {
            d = "For each green chip that is the last or next-to-last chip in your pot, take 1 of the indicated ingredients";
        }
        super(n, d, v);
    }

    public void onEvaluate(Player p, Game g) {

    }
}
