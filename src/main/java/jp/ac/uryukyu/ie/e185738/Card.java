package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Collections;

/**
 * カードクラス。
 * String[] suit; //カードの記号の配列
 * int[] num; //カードの数字の元となる数字の配列。
 * String type; //１〜１３のカードの数字。
 * String cards; //記号と数字を含むカード。
 */
public class Card {
    String[] suit;
    int[] num;
    String type;
    String cards;

    public Card() {
        this.suit = new String[]{"ハート", "クラブ", "スペード", "ダイヤ", "ジョーカー"};
        this.num = new int[54];
    }
    public ArrayList cardset() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= 54; i++) {
            num[i - 1] = i - 1;
        }
        for (int j = 1; j <= 54; j++) {
            this.type = suit[num[j - 1] / 13];
            this.cards = type + "の" + (num[j - 1] % 13 + 1);
            list.add(cards);
        }
        return list;
    }
    }




