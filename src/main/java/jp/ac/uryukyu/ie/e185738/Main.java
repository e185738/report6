package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Card card = new Card();
        OldMaid oldMaid = new OldMaid();
        oldMaid.shuflle();
        System.out.println();
        Player player = new Player();

        player.play();
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("何人で遊びますか？");
        input = in.nextInt();

        player.playerset(input);


    }
}
