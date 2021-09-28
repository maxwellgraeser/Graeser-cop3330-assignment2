/*
 *  UCF COP3330 Fall 2021 Exercise 35 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex35;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String[] names = new String[1];
        while (true) {
            System.out.print("Enter a name: ");
            input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            else
                names = addName(names, input);
        }
        System.out.printf("The winner is... %s.",names[(int)(Math.random() * names.length)]);
    }

    //Creates ArrayList of the given array, adds the name, then converts back to array and returns it
    public static String[] addName(String arr[], String name) {
        List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
        arrList.add(name);
        arr = arrList.toArray(arr);
        return arr;
    }
}
