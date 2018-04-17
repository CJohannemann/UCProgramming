package task5;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class Task5 {

    /**
     * A program that calculates and displays the cost of building materials.
     * Given these inputs: width, height, and cost per square foot. Compute the
     * total area and then multiply that by the cost per square foot to obtain
     * the total cost. Yep, you have to test each input before reading it in. If
     * you get a bad input don’t continue to read in values terminate the
     * program with an error msg. Testing: really each case for each value being
     * correct or not, but it’s okay to just do that for two of the variables
     * and then test to make sure the calculation is correct.
     */
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner width = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        Scanner cpf = new Scanner(System.in);
        double wide = 0;
        double length = 0;
        double costPF = 0;
        boolean bingo = true;

        Scanner input = new Scanner(System.in);
        String answer = "y";

        
        while (bingo) {
            System.out.println("What is the width of your project?");
            secondloop:
            if (width.hasNextDouble()) {
                wide = width.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                break;
            }
            System.out.println("What is the length of your project?");
            if (height.hasNextDouble()) {
                length = height.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                break;
            }
            System.out.println("What is the cost per square foot?");
            if (cpf.hasNextDouble()) {
                costPF = cpf.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                break;
            }
            costPF = (wide * length) * costPF;
            System.out.println("Your total project will cost: " + formatter.format(costPF));
        
            System.out.println("\n" + "Do you want to find the cost of another project?  Y/N");
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
