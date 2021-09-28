/*
 *  UCF COP3330 Fall 2021 Exercise 25 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex25;

import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter a password to see how strong it is: " );
        String input = scan.nextLine();
        int strength = passwordValidator(input);
        System.out.printf(getOut(strength, input));
    }

    static String getOut(int val, String pass) {
        switch (val) {
            case 4:
                return "The password '" + pass + "' is a very strong password.";
            case 3:
                return "The password '" + pass + "' is a strong password.";
            case 2:
                return "The password '" + pass + "' is a weak password.";
            default:
                return "The password '" + pass + "' is a very weak password.";
        }

    }
    public static int passwordValidator(String password) {
        //convert to char array and pass it in
        char[] pass = new char[password.length()];
        for (int i = 0; i < password.length(); i++)
            pass[i] = password.charAt(i);

        int special = 0, numbers = 0, letters = 0;
        for (int i = 0; i < pass.length; i++) {
            if (String.valueOf(pass[i]).matches("\\d")) {
                numbers++;
                continue;
            }
            if (String.valueOf(pass[i]).matches("[a-zA-Z]")) {
                letters++;
                continue;
            }
            if (String.valueOf(pass[i]).matches("[!@#$%^&*()]")) {
                special++;
            }
        }

        if (numbers > 0 && letters > 0 && special > 0 && password.length() >= 8)
            return 4;
        else if (numbers > 0 && letters > 0 && password.length() >= 8)
            return 3;
        else if (numbers == 0 && letters > 0 && password.length() < 8)
            return 2;
        else if (numbers > 0 && password.length() < 8)
            return 1;
        return 0;
    }
}