package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String[] player;
    public ArrayList play(){
        OldMaid oldMaid = new OldMaid();
        ArrayList deck =  oldMaid.shuflle();
        System.out.println(deck);
        return deck;
    }
    public void playerset(int member){
        this.player = new String[member];
        for(int i=1; i<member; i++){
            player[i-1] = "player"+ i;
        }
        System.out.println(player);

        for(int i=1; i<member; i++){
            String[] yourcard;

        }
    }
}
