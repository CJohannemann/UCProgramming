package highorlow;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class HighorLow {

    /**
     * Write a program that has the computer generate a random int value between
     * 1 to 10 inclusive. The program then asks the user to guess the number
     * with a single guess. The program displays the random number and then
     * indicates if the users guess was high low or on the money!
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner loops = new Scanner(System.in);
        String answer = "Y";
        Random rand = new Random();

       
            while (answer.equalsIgnoreCase("y")) {
                 try {
                System.out.println("Guess a number 1 - 10.");
                int num = input.nextInt();

                if (num <= 10) {
                    int n = rand.nextInt(10) + 1;
                    if (num < n) {
                        System.out.println("Your guess was too low.");
                    } else if (num > n) {
                        System.out.println("Your guess was too high.");
                    } else {
                        System.out.println("You are on the money!");
                    }
                    System.out.println(n + " was the correct number.");
                }
                System.out.println("Do you want to continue? Y/N");
                answer = loops.nextLine();
            }catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
                break;
            }
        }  
    }
}
