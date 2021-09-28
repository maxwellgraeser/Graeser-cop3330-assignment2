package ex33;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    void check() {
        String temp = App.magicEight();
        int resultCheck = 0;
        if (temp.equals("Yes.") || temp.equals("No.") || temp.equals("Maybe.") || temp.equals("Ask again later."))
            resultCheck = 1;

        assertEquals(1, resultCheck);
    }
}
