package jp.ac.uryukyu.ie.e185738;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class OldMaidTest extends Card {

    @Test
    void shuflle() {
        ArrayList<String> testlist = new ArrayList<String>();
        testlist.add("ハートの2");
        testlist.add("ダイヤの1");
        testlist.add("ジョーカーの2");
        testlist.add("ジョーカーの1");
        Collections.shuffle(testlist);
        testlist.remove("ジョーカーの2");
        assertEquals(3, testlist.size());
    }
}