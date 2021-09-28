/*
 *  UCF COP3330 Fall 2021 Exercise 37 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex37;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minInput = Integer.parseInt(scan.nextLine());
        System.out.print("How many special characters? ");
        int specInput = Integer.parseInt(scan.nextLine());
        System.out.print("How many numbers? ");
        int numInput = Integer.parseInt(scan.nextLine());

        System.out.printf("Your password is %s", password(minInput, specInput, numInput));
    }

    //returns a randomized password based on given numbers
    static String password(int min, int special, int numbers) {
        List<String> specialList = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")");
        List<String> numList = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> letterList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        String password = "";

        //set characters
        for (int i = 0; i < special; i++)
            password += specialList.get((int)(Math.random() * 10));
        for (int i = special; i < numbers + special; i++)
            password += numList.get((int)(Math.random() * 10));

        if ((special + numbers) * 2 < min) {
            for (int i = special + numbers; i < min; i++)
                password += letterList.get((int) (Math.random() * 26));
        }
        else {
            for (int i = special + numbers; i < (special + numbers) * 2; i++)
                password += letterList.get((int) (Math.random() * 26));
        }

        //shuffle
        List<String> list = Arrays.asList(password.split(""));
        Collections.shuffle(list);
        String shuffled = "";
        for (int i = 0; i < list.size(); i++) {
            String letter = list.get(i);
            shuffled += letter;
        }
        return shuffled;
    }
}