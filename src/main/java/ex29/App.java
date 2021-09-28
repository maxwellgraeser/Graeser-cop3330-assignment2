/*
 *  UCF COP3330 Fall 2021 Exercise 29 Solution
 *  Copyright 2021 Maxwell Graeser
 */


package ex29;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valid = 0, input = -1;

        while (valid != 1) {
            System.out.print("What is the rate of return? ");
            try {
                input = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.println("Sorry, that's not a valid input.");
                continue;
            }
            if (input == 0)
                System.out.println("Sorry, that's not a valid input.");
            else
                valid = 1;
        }

        int years = yearComp(input);
        System.out.println(String.format("It will take %d years to double your investment", years));
    }
    static int yearComp(int in){
        return 72 / in;
    }
}
