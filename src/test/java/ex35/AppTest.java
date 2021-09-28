package ex35;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    void check() {
        String[] in = {"Bart"};
        String[] expected = {"Bart", "Lisa"};
        in = App.addName(in, "Lisa");
        assertEquals(expected[1], in[1]);
    }
}
