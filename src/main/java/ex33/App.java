/*
 *  UCF COP3330 Fall 2021 Exercise 33 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex33;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String output, input;
        System.out.print("What's your question?\n> ");
        input = scan.nextLine();
        output = magicEight();
        System.out.println(output);
    }

    static String magicEight() {
        String[] arr = {"Yes.", "No.", "Maybe.", "Ask again later." };
        int i = (int)(Math.random() * 4);
        return arr[i];
    }

}