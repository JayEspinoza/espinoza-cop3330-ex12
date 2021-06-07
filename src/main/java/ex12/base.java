/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 12 - Computing Simple Interest
 *  Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).
 *
 *  Constraint:
 *  Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
 *  Ensure that fractions of a cent are rounded up to the next penny.
 *  Ensure that the output is formatted as money.
 *
 */

package ex12;
import java.util.Scanner;

public class base {
    public static void main(String [] args)
    {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        double principal, interest, total;
        int years;

        // User Input Step
        System.out.printf("Enter the principal: ");
        principal = userInput.nextDouble();

        // Rate as percentage
        System.out.printf("Enter the rate of interest: ");
        interest = userInput.nextDouble();

        System.out.printf("Enter the number of years: ");
        years = userInput.nextInt();

        // Calculations
        // Rate divided by 100
        total = principal * (1 + ((interest/100) * years));

        // Output
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f", years, interest, total);
    }
}
