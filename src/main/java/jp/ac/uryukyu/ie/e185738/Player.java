package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * プレイヤークラス。
 * String[] player; プレイヤー。
 * */
public class Player {
    String[] player;

    /**
     * シャッフルした山札をdeckに代入するメソッド。
     * @return deck デッキ
     */
    public ArrayList play(){
        OldMaid oldMaid = new OldMaid();
        ArrayList deck =  oldMaid.shuflle();
        System.out.println(deck);
        return deck;
    }

    /**
     * プレイヤーの人数を設定するメソッド。
     * @param member　人数
     */
    public void playerset(int member){
        this.player = new String[member];
        for(int i=1; i<member; i++){
            player[i-1] = "player"+ i;
        }

        for(int i=1; i<member; i++){
            String[] yourcard;

        }
    }
}
