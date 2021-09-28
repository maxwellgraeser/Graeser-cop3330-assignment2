/*
 *  UCF COP3330 Fall 2021 Exercise 24 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    //main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String inputOne = scan.nextLine();
        System.out.print("Enter the second string: ");
        String inputTwo = scan.nextLine();

        if (isAnagram(inputOne, inputTwo))
            System.out.println(String.format("'%s' and '%s' are anagrams", inputOne, inputTwo));
        else
            System.out.println(String.format("'%s' and '%s' are not anagrams", inputOne, inputTwo));
    }


    public static boolean isAnagram(String one, String two) {
        if (one.length() != two.length())
            return false;
        char[] oneArray = one.toCharArray();
        char[] twoArray = two.toCharArray();
        Arrays.sort(oneArray);
        Arrays.sort(twoArray);

        for(int i = 0; i < one.length(); i++){
            if (oneArray[i] != twoArray[i])
                return false;
        }
        return true;
    }
}
