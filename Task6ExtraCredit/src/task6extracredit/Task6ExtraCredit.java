package task6extracredit;

import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class Task6ExtraCredit {

    /**
     * A program that takes two numbers as inputs from the user and compares
     * them. It indicates if they are equal or if they are not indicates the one
     * that is less. This program should be bullet-proofed. If either input is
     * not a number, the program should indicate that the user should try again
     * and terminate.
     */
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double first = 0;
        double second = 0;
        boolean bingo = true;
        String answer = "y";
        Scanner input = new Scanner(System.in);

        while (bingo) {
            System.out.println("Please enter your first number: ");
            if (input1.hasNextDouble()) {
                first = input1.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                break;
            }
            System.out.println("Please enter your second number: ");
            if (input2.hasNextDouble()) {
                second = input2.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                break;
            }
            if(first > second){
                System.out.println("The second input is less.");
            }else if(first < second){
                System.out.println("The first input is less.");
            }else{
                System.out.println("They are equal!");
            }
//loop
            System.out.println("\n" + "Do you want to try again?  Y/N");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                bingo = true;
            } else {
                bingo = false;
                System.out.println("Have a great day!");
            }

        }
    }

}
