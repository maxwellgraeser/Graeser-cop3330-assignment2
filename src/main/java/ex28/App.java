/*
 *  UCF COP3330 Fall 2021 Exercise 28 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex28;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputs = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            inputs[i] += scan.nextInt();
        }
        int output = compute(inputs);
        System.out.println("The total is " + output);
    }

    static int compute(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }
}