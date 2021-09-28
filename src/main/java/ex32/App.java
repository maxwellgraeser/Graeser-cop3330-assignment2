/*
 *  UCF COP3330 Fall 2021 Exercise 32 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex32;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Let's play Guess the Number!");
        gameStart();
    }

    static void gameStart() {
        Scanner scan = new Scanner(System.in);
        int input = 0, valid = -1;
        while (valid != 1) {
            System.out.print("\n\nEnter the difficulty level (1, 2, or 3): ");
            try {
                input = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Sorry, that's not a valid input.");
                continue;
            }
            if (input == 1 || input == 2 || input == 3)
                valid = 1;
            else
                System.out.println("Sorry, that's not a valid input.");
        }

        if (input == 1)
            easy();
        if (input == 2)
            medium();
        if (input == 3)
            hard();
    }

    static void easy() {
        int gameNum = (int)(Math.random() * 10 + 1);
        guess(gameNum);
    }
    static void medium() {
        int gameNum = (int)(Math.random() * 100 + 1);
        guess(gameNum);
    }
    static void hard() {
        int gameNum = (int)(Math.random() * 1000 + 1);
        guess(gameNum);
    }

    static void guess(int num) {
        Scanner scan = new Scanner(System.in);
        int playerGuess = 0, guesses = 0;
        System.out.print("I have my number. What's your guess? ");
        while (playerGuess != num) {
            try {
                playerGuess = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Sorry, that's not a valid input. Guess again: ");
                guesses++;
                continue;
            }
            if (playerGuess == num) {
                guesses++;
                System.out.printf("You got it in %d guesses!", guesses);
                break;
            }
            if (playerGuess > num) {
                System.out.print("Too high. Guess again: ");
                guesses++;
                continue;
            }
            if (playerGuess < num) {
                System.out.print("Too low. Guess again: ");
                guesses++;
            }
        }
        playAgain();
    }

    static void playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDo you wish to play again (Y/N)? ");
        String input = scan.nextLine();
        if (input.equals("y") || input.equals("Y")) {
            gameStart();
        }
        else if (input.equals("n") || input.equals("N")) {
            return;
        }
        else {
            System.out.println("That's not a valid input");
            playAgain();
        }
    }
}