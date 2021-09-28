package ex38;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void check(){
        int[] arr = { 1, 2, 4, 5, 8 };
        int[] expected = { 2, 4, 8 };

        assertEquals(3, App.evenCount(arr));

        arr = App.filterEvenNumbers(arr);
        for (int i = 0; i < App.evenCount(arr); i++)
            assertEquals(arr[i], expected[i]);
    }
}
