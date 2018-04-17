/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author cjohannemann
 */
public class Array {
    /**
     * @param args the command line arguments
     */
        static int total = 0;
        static double average = 0;
    public static void main(String[] args) {
        Random rnd = new Random();
        /*
        int val = rnd.nextInt(100);  // gives a value from 0 to 99
        int val = rnd.nextInt(100) + 1;  // gives a value from 1 to 100
        int index = rnd.nextInt(myArray.length);//  gives a random valid index on myArray
         */
        //a. Declare an array of type int named dataPoints. 
        //      dataPoints should have a length of 100. (i.e. it should hold 100 int values.)
        int[] dataPoints = new int[100];
        int counter = 1;
        
        //b. Now, code a regular for loop that iterates through the dataPoints array and initializes each element in it to a random value between 1 and 100.
        for (int i = 1; i <= 100; i++) {
            int index = rnd.nextInt(dataPoints.length);
            System.out.print(index);
            counter++;
            //c. Code a second loop that displays the dataPoints values like this (values are all on the same line and separated by “ | “ e.g. space, vertical bar, space):val1 | val2 | val3 |
            //HINT: use printf or System.out.print()
            while (counter <= 100) {
                System.out.print("|");
                break;
                }
            while(i <= 100){
                total += index;
                average = total / 100;
                break;
            }
        }
//      Now code a loop that calculates the sum and the average of the values in dataPoints.
//      Add code to output/display the sum and the calculated average.
        System.out.println("");
            System.out.println("The sum of all the random array dataPoints are: "+ total);
            System.out.println("The average of the random array dataPoints is: "+ average);
    }
}
