/*
 *  UCF COP3330 Fall 2021 Exercise 31 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        int inAge;
        try {
            inAge = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Sorry, that's not a valid input.");
            return;
        }
        System.out.print("What is your resting heartrate? ");
        int inHeart;
        try {
            inHeart = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Sorry, that's not a valid input.");
            return;
        }
        String output = karvonen(inAge, inHeart);
        System.out.println(output);
    }

    //prints out the karvonen table
    //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
    static String karvonen(int age, int heart) {
        //System.out.println(String.format("Resting pulse: %d     Age: %d\n", heart, age));
        //System.out.println("Intensity    | Rate\n-------------|----------");
        int target;
        String out = "";
        out += String.format("Resting pulse: %d     Age: %d\n", heart, age);
        out += "Intensity    | Rate\n-------------|----------\n";
        for (int i = 55; i <= 95; i += 5) {
            target = (((220 - age) - heart) * i / 100) + heart;
            out += i + "%          | " + target + " bpm\n";
        }
        return out;
    }
}
