package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    void check() {
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(100);
        arrList.add(200);
        arrList.add(300);

        assertEquals(200.0, App.average(arrList));
        assertEquals(100, App.min(arrList));
        assertEquals(300, App.max(arrList));
        assertEquals(81.64965809277261, App.sDev(arrList));
    }

}
