package ex28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void checker() {
        int[] temp = {5, 5, 5, 5, 5};
        assertEquals(25, App.compute(temp));
    }
}
