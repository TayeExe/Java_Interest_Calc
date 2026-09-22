/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interestcalc;
import java.util.Scanner; //import scanner function to allow user input

/**
 *Taylor Austin
 * 09-17-2026
 * CITP 190
 * Project One - Interest Calculator
 * This program allows users to enter in a principal amount, and APR and a number of years to calculate interest!
 */
public class InterestCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Intro to program
        System.out.println("Hello, this is an interest calculator!");
        System.out.println("Please input the required values to calculate interest!");
        
        System.out.print("Please enter the principal amount: "); //user input for orginal amount
        double principal = scanner.nextDouble();
        
        System.out.print("Please enter the Annual Percentage Rate (APR): "); // user input for the APR
        double apr = scanner.nextDouble();
        
        System.out.print("Please enter the number of years: "); // user input for the number of years
        double years = scanner.nextDouble();
        
        double monthlyRate = 1 + (apr / 1200); // first part of the interest equation, gives you the monthly rate
        System.out.printf("The monthly rate: %.3f%n", monthlyRate);
        
        // second part of the interest equation, gives your the annual rate using the previuosuly calculated monthly rate
        //uses Math.pow to raise the monthy rate to the 12th power
        double annualRate = Math.pow(monthlyRate, 12); 
        System.out.printf("The annual rate: %.3f%n", annualRate);
         
        //third part of the interest equation, takes the annual rate and raises it to the number of years the user inputed 
        double finalTermRate = Math.pow(annualRate, years);  
        System.out.printf("The final term rate is: %.3f%n", finalTermRate);
        
        //fourth part of the equation, gives you the final amount of interest by multiplying the principal by the final term rate
        double finalAmount = principal * finalTermRate;
        System.out.printf("The final amount is: $%.2f%n", finalAmount);
        
        //final part of the equation, calcualtes and shows how much interest was actually accrued. 
        double accuredInterestAmount = (finalAmount - principal);
        System.out.printf("The amount of interest accrued is: $%.2f%n", accuredInterestAmount);
        
         
    }
}