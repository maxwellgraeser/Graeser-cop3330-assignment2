/*
 *  UCF COP3330 Fall 2021 Exercise 36 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex36;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int temp;
        List<Integer> arrList = new ArrayList<Integer>();

        //read inputs
        while (true) {
            System.out.print("Enter a number: ");
            input = scan.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                temp = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.print("Sorry, that's not a valid input.\n");
                continue;
            }
            arrList.add(temp);
        }

        //Make sure they entered something
        if (arrList.size() == 0){
            System.out.print("\nYou didn't enter any valid inputs");
            return;
        }

        //print output
        System.out.print("\nNumbers: ");
        for (int i = 0; i < arrList.size() - 1; i++) {
            System.out.printf("%d, ",arrList.get(i));
        }
        System.out.printf("%d",arrList.get(arrList.size() - 1));
        System.out.printf("\nThe average is %.1f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %.2f",
                average(arrList), min(arrList), max(arrList), sDev(arrList));
    }

    //returns the average
    static double average(List<Integer> arr) {
        double sum = 0.0, avg;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        avg = sum / arr.size();
        return avg;
    }

    //returns the minimum
    static int min(List<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (min > arr.get(i))
                min = arr.get(i);
        }
        return min;
    }

    //returns the maximum
    static int max(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i))
                max = arr.get(i);
        }
        return max;
    }

    //returns standard deviation
    static double sDev(List<Integer> arr) {
        double avg = average(arr);
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += Math.pow((arr.get(i) - avg), 2);
        }
        return Math.sqrt(sum / (arr.size()));
    }
}
