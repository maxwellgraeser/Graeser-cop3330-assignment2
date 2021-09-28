package ex25;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void checker() {
        int check = App.passwordValidator("1233asdfasdf@#@#");
        assertEquals(4, check);
    }
}
