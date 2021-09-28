package ex27;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void checker() {
        assertEquals("", App.validateFname("John"));
        assertEquals("The last name must be at least 2 characters long.\n", App.validateLname("J"));
        assertEquals("The employee ID must be in the format of AA-1234.\n", App.validateID("qwerty"));
        assertEquals("The zipcode must be a 5 digit number.\n", App.validateZIP("323"));
        assertEquals("The first name must be at least 2 characters long.\nThe first name must be filled in\n",
                App.validateInput("","Smith", "32206", "AA-1234"));
    }
}
