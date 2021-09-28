package ex29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {

    @Test
    void checker() {
        assertEquals(18,App.yearComp(4));
    }
}
