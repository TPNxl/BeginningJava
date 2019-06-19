package CrazyEights;


public class EightsScratchbook {
    public static void main(String[] args) {
        Card CURRENT_CARD = new Card("3","blue");
        Player p1 = new Player(1,"human");
        Player p2 = new Player(2,"computer");
        p1.play(new Card("plusFour","red"));
        System.out.println(p2.cards());
    }
}
