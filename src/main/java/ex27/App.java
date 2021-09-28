/*
 *  UCF COP3330 Fall 2021 Exercise 27 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex27;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String inputFName = scan.nextLine();
        System.out.print("Enter the last name: ");
        String inputLName = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        String inputZIP = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        String inputID = scan.nextLine();

        System.out.println(validateInput(inputFName, inputLName, inputZIP, inputID));
    }
    static String validateInput(String fName, String lName, String zip, String id) {
        String output = "";

        output += validateFname(fName);
        output += validateLname(lName);
        output += validateZIP(zip);
        output += validateID(id);

        if (output.equals(""))
            output = "There were no errors found.";

        return output;
    }

    static String validateFname(String fName) {
        String out = "";
        if (fName.length() < 2)
            out += "The first name must be at least 2 characters long.\n";
        if (fName.equals(""))
            out += "The first name must be filled in\n";
        return out;
    }

    static String validateLname(String lName) {
        String out = "";
        if (lName.length() < 2)
            out += "The last name must be at least 2 characters long.\n";
        if (lName.equals(""))
            out += "The last name must be filled in\n";
        return out;
    }

    static String validateID(String id) {
        String out = "";
        if (!id.matches("[a-zA-Z]{2}-\\d{4}"))
            out += "The employee ID must be in the format of AA-1234.\n";
        return out;
    }

    static String validateZIP(String zip) {
        String out = "";
        if(!zip.matches("\\d{5}"))
            out += "The zipcode must be a 5 digit number.\n";
        return out;
    }

}