package ex31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {

    @Test
    void checker() {
        assertEquals("Resting pulse: 65     Age: 22\n" +
                "Intensity    | Rate\n" +
                "-------------|----------\n" +
                "55%          | 138 bpm\n" +
                "60%          | 144 bpm\n" +
                "65%          | 151 bpm\n" +
                "70%          | 158 bpm\n" +
                "75%          | 164 bpm\n" +
                "80%          | 171 bpm\n" +
                "85%          | 178 bpm\n" +
                "90%          | 184 bpm\n" +
                "95%          | 191 bpm\n", App.karvonen(22, 65));
    }

}
