package evenodd;

import java.util.Scanner;

/**
 *
 * @author cjohannemann
 */
public class EvenOdd {

    /**
     * A program that takes an integer (java int) and uses the modulo function
     * to indicate if the number is odd or even. Since we can’t do input in java
     * yet, just hard code the value for the input as a variable instantiation.      *
     * (Instead of inputing the value which we can’t do yet, set the value in
     * the code.      *
     * int numToExamine = 2; // program will then determine that since 2 mod 2
     * is 0 that numToExamine is Even.
     *
     */
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean bingo = true;
        String answer = null;
     do{
        System.out.println("Please enter a number to see if it is even or odd: ");

        if (sc1.nextInt() % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("False");
        }
    System.out.println("Do you want to enter another number? Y/N"); 
     answer = sc2.nextLine();
     }while(answer.equalsIgnoreCase("y"));
     }  
}
