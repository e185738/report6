package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Collections;

/**
 * oldmaidクラス。
 */
public class OldMaid {
    ArrayList<String> list2 = new ArrayList<String>();
    Card card = new Card();

    /**
     * 山札をシャッフルするメソッド。
     * @return list2; シャッフルした手札を入れるリスト。
     */
    public ArrayList<String> shuflle() {
        this.list2 = card.cardset();
        Collections.shuffle(list2);
        list2.remove("ジョーカーの2");
        return list2;
    }
    }

