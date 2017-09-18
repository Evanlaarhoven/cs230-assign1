/* CorrectChange.java
 * CS 230 Assignment 1, Task 1
 * Written by: Emily Van Laarhoven
 * Due date: Sept 12, 2016 11:59pm
 */

import java.util.Scanner;

public class CorrectChange {
    
  public static int makeChangeWithOneDenomination(int total,String denominationName,int denomination) {
    int value = total/denomination; // division truncates the result, so we get the largest integer less than or equal to the total
    int remainder = total%denomination;
    if (value != 0) { //only want to print if we need that denomination
    System.out.println(value+" "+denominationName); 
    }
    
    return remainder;
  }
 
    public static void main(String [] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("How much money would you like to make change for?"); //ask for user to input amount of money
    Double dollars = scan.nextDouble(); //store dollar amount as double
    Double dollars_times100 = dollars*100; //multiply dollars times 100, still stored as double
    int cents = dollars_times100.intValue(); //convert double to int
    System.out.println("We can make change for $"+dollars+" using:");
    
    int twenties_remainder = makeChangeWithOneDenomination(cents,"$20 bills",2000); //will print number of $20 bills and return remaining cents
    int tens_remainder = makeChangeWithOneDenomination(twenties_remainder,"$10 bills",1000); //will print number of $10 bills and return remaining cents
    int fives_remainder = makeChangeWithOneDenomination(tens_remainder,"$5 bills",500); //will print number of $5 bills and return remaining cents
    int ones_remainder = makeChangeWithOneDenomination(fives_remainder,"$1 bills",100); //will print number of $1 bills and return remaiing cents
    int quarters_remainder = makeChangeWithOneDenomination(ones_remainder,"quarters",25); //will print number of quarters and return remaining cents
    int dimes_remainder = makeChangeWithOneDenomination(quarters_remainder,"dimes",10); //will print number of dimes and return remaining cents
    int nickels_remainder = makeChangeWithOneDenomination(dimes_remainder,"nickels",5); //will print number of nickels and return remaining cents
    
    if (nickels_remainder !=0) {
    System.out.println(nickels_remainder+" pennies"); //will print number of pennies
    }
  }
}
