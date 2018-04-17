/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelcosts;

import java.util.Scanner;

/**
 *
 * @author cjohannemann
 */
public class FuelCosts {

    /**
    * Write a program that asks the user to input
    *The number of gallons of gas in the tank
    *The fuel efficiency in miles per gallon
    *The price of gas per gallon
    *Then print the cost per 100 miles and how far the car can go with the gas in the tank.
    * Again, check for valid input and exit with an error msg if you do not have it.Testing:
    * here just use some reasonable values that you can inspect the calculations and determine they are correct.  
    * Be sure to check of integer calculations truncating the results.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gallons = 0;
        int miles = 0;
        double gass;
        boolean gallon = true;
        boolean mile = true;
        boolean gas = true;
        boolean bingo = true;
        
        while(bingo){
        System.out.println("How many gallons of gas does your tank hold?");
        if (gallon = input.hasNextDouble()){
            gallons = input.nextInt();
            System.out.println("You have " + gallons +" gallons of gas.");
        }else{
            System.out.println("Please enter a valid number!");
            break;
        }
        System.out.println("How many miles do you get on a gallon of gas?");
        if (mile = input.hasNextDouble()){
            miles = input.nextInt();
            System.out.println("You get " + miles + " miles per gallon!");
            System.out.println("On a full tank of gas you can drive "+ miles * gallons +" miles!");
        }else{
            System.out.println("Please enter a valid number!");
            break;
        }
        System.out.println("How much is a gallon of gas cost?");
        if (gas = input.hasNextDouble()){
            gass = input.nextDouble();
            System.out.println("$"+gass * gallons + " to fill your tank up!");
        }else{
            System.out.println("Please enter a valid number!");
            break;
        }
        }
    }
    
}
