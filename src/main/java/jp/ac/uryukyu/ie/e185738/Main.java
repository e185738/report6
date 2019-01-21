package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Card card = new Card();
        System.out.println();
        Player player = new Player();
        player.play(); //山札をシャッフルする。
        int input; //参加人数を入力してもらう。
        Scanner in = new Scanner(System.in);
        System.out.println("何人で遊びますか？");
        input = in.nextInt();
        player.playerset(input);
    }
}
