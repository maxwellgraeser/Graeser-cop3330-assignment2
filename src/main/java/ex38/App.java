/*
 *  UCF COP3330 Fall 2021 Exercise 38 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex38;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scan.nextLine();

        //convert from string to int array
        String[] arr = input.split("\\s+");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            intArr[i] = Integer.parseInt(temp);
        }

        intArr = filterEvenNumbers(intArr);
        //print output
        System.out.print("The even numbers are:");
        for (int i = 0; i < evenCount(intArr); i++)
            System.out.printf(" %d", intArr[i]);

    }

    static int evenCount(int[] arr) {
        int evenNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenNums++;
        }
        return evenNums;
    }

    static int[] filterEvenNumbers(int[] arr) {
        //get the count of even numbers
        int total = evenCount(arr);

        //create a new array to hold all even numbers and return it
        int[] temp = new int[total];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[counter] = arr[i];
                counter++;
            }
        }
        return temp;
    }
}
