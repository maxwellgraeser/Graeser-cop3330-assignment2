package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void checker() {
        assertEquals(70, App.PaymentCalculator.calculateMonthsUntilPaidOff(5000, 12,100));
    }
}