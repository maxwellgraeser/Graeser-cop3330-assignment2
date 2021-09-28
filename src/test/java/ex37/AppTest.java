package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    void checkLetters() {
        String test = App.password(8, 0, 0);
        int testVal = 1;
        System.out.print(test);

        char[] testArr = new char[test.length()];
        for (int i = 0; i < test.length(); i++)
            testArr[i] = test.charAt(i);

        for (int i = 0; i < test.length(); i++) {
            if (!String.valueOf(testArr[i]).matches("[a-z]"))
                testVal = 0;
        }
        assertEquals(1, testVal);
    }

    @Test
    void checkOther() {
        String test = App.password(10, 4, 2);
        int specVal = 0, numVal = 0, letVal = 0;
        System.out.print(test);

        char[] testArr = new char[test.length()];
        for (int i = 0; i < test.length(); i++)
            testArr[i] = test.charAt(i);

        for (int i = 0; i < test.length(); i++) {
            if (String.valueOf(testArr[i]).matches("[!@#$%^&*()]")) {
                specVal++;
            }
            if (String.valueOf(testArr[i]).matches("\\d")) {
                numVal++;
            }
            if (String.valueOf(testArr[i]).matches("[a-z]")) {
                letVal++;
            }
        }
        assertEquals(4, specVal);
        assertEquals(2, numVal);
        assertEquals(6, letVal);
    }
}

