/*
 *  UCF COP3330 Fall 2021 Exercise 26 Solution
 *  Copyright 2021 Maxwell Graeser
 */
package ex26;

import java.util.Scanner;
import java.lang.Math;

public class App {
    static class PaymentCalculator {

        public static int calculateMonthsUntilPaidOff(double balance, double apr, double payments) {
            //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
            double i = (apr / 100) / 365.0;
            double power = Math.pow(1.0 + i, 30.0);
            double partOne = Math.log10(1.0 + balance / payments * (1.0 - power));
            double partTwo = Math.log10(1.0 + i);
            double months = -(1.0/30.0) * partOne / partTwo;
            int n = (int) Math.ceil(months);
            return n;
        }
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double b = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = scan.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double p = scan.nextDouble();

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(b, apr, p);
        System.out.println(String.format("It will take you %d months to pay off this card", months));
    }
}