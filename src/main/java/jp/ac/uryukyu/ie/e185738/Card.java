package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Collections;

public class Card {
    String[] suit;
    int[] num;
    String type;
    public Card() {
        this.suit = new String[]{"ハート", "クラブ", "スペード", "ダイヤ", "ジョーカー"};
        this.num = new int[54];

    }
    public void Cardset() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= 54; i++) {
            num[i - 1] = i - 1;
        }

        for (int j = 1; j <= 54; j++) {
            this.type = suit[num[j - 1] / 13];
            String cards = type + "の" + (num[j - 1] % 13 + 1);
            list.add(cards);
        }
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }

    }





