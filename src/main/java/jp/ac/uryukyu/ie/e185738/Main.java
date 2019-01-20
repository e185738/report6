package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;

public class Main {
    public static void main(String[] Args){
        Card card = new Card();
        OldMaid oldMaid = new OldMaid();
        oldMaid.shuflle();
        System.out.println();
        Player player = new Player();
        player.play();


    }
}
