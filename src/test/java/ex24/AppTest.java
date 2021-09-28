package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checks Passed")
    void testOne() {
        boolean expect = true;
        String one = "tone";
        String two = "note";
        boolean actual = App.isAnagram(one, two);
        assertEquals(expect, actual);
    }
}
