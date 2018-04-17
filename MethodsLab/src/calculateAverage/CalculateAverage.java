package calculateAverage;

import CountWords.CountWords;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class CalculateAverage {

    /**
     * 1. Write a program that calls a method named CalculateAverage with three
     * inputs received from the user. (Asks the user to enter three numbers).
     * The program should display the average of three numbers calculated by the
     * method. (Sample output Enter three numbers: 100 200 200 The average of
     * the numbers is: 166.66)
     */
    static DecimalFormat df = new DecimalFormat("##.00");
    static Scanner input = new Scanner(System.in);
    static Scanner mainQuestion = new Scanner(System.in);
    static Scanner repeat1 = new Scanner(System.in);
    static Scanner repeat = new Scanner(System.in);
    static String answer = "";
    static double total = 0;
    static double average = 0;
    static double currentNum = 0;
    static double totNumbers = 0;

    public static void main(String[] args) {
        int selection = 0;
        
        System.out.println("Press 1 to count strings: ");
        System.out.println("Press 2 to count three numbers for an average: ");

        if (mainQuestion.hasNextInt()) {
            selection = mainQuestion.nextInt();
        }
        if (selection == 1) {
            wordCount();
        }

        if (selection == 2) {
            threeNumbers();
        }
    }
    
    public static double wordCount(){
        boolean bingo = false;
        while (!bingo) {
                CountWords.resetSum();
                System.out.println("You entered " + CountWords.countStrings() + " words.");
                System.out.println("Do you want to enter new numbers? Y/N");

                if (repeat.hasNextLine()) {
                    answer = repeat.nextLine();
                    if (answer.equalsIgnoreCase("Y")) {
                        bingo = false;
                    }
                    if (answer.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                }
            }
        return CountWords.countStrings();
    }

    public static double threeNumbers() {
        boolean bingo = true;

        while (bingo) {

            System.out.println("Please enter three numbers: ");

            for (int i = 1; i <= 3; i++) {
                currentNum = getDbl();
                total += currentNum;
                totNumbers++;
                average = total / totNumbers;
            }
            System.out.println("The total is: " + total);
            System.out.println("The average is: " + df.format(average));

            System.out.println("Do you want to enter a new temp? Y/N");
            resetSum();
            answer = repeat1.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                bingo = true;
            } else {
                bingo = false;
                System.out.println("Thanks, come again!");
            }
        }
        resetSum();

        return total;
    }

    public static double getDbl() {
        //System.out.println("2");
        String inputValue = "";
        double num1 = 0;
        int counter = 3;

        while (counter <= 3) {
            inputValue = input.next();    
            try {      
                    num1 = Double.parseDouble(inputValue);
                    counter++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                    System.out.println("Please re-enter a correct number.");
                }
        }
        return num1;
    }

    public static void resetSum() {
        CalculateAverage.total = 0;
        CalculateAverage.average = 0;
        CalculateAverage.currentNum = 0;
        CalculateAverage.totNumbers = 0;
    }
}
