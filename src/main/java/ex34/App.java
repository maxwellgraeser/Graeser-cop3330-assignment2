/*
 *  UCF COP3330 Fall 2021 Exercise 34 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex34;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.printf("There are %d employees:", employees.size());
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("\n%s", employees.get(i));
        }

        System.out.print("\n\nEnter an employee name to remove: ");
        String input = scan.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(input)) {
                employees.remove(i);
                break;
            }
        }

        System.out.printf("\nThere are %d employees:", employees.size());
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("\n%s", employees.get(i));
        }
    }
}