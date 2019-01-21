package jp.ac.uryukyu.ie.e185738;
import java.util.ArrayList;
import java.util.Collections;

public class OldMaid {
    private ArrayList<String> list2 = new ArrayList<String>();
    Card card = new Card();

    public ArrayList<String> shuflle() {
        this.list2 = card.cardset();
        Collections.shuffle(list2);
        list2.remove("ジョーカーの2");
        return list2;
    }
    }

