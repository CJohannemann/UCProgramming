package birthmonth;

import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class BirthMonth {

    /**
     * A program that asks the user to enter their birth month (integer 1 – 12
     * inclusive). If the user enters a value in range, the program echoes the
     * input (“Your birth month is: N”) If the value is not in the range it
     * outputs an error msg (“You entered an incorrect month value: N”). Here N
     * should be the value they entered. Careful here! You have to first bullet
     * proof the input before you can check to see if the value is in range! Be
     * sure to communicate clearly with the user: “You did not enter a number”
     * or “You did not enter a number between 1 and 12. Tests: Bad Input, Number
     * in Range, Number not in range.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthMonth = 0;
        String monthString = "";

        System.out.println("Please enter your birthmont (1-12)");
        if (input.hasNextInt()) {
            birthMonth = input.nextInt();
            if ((birthMonth >= 1) && birthMonth <= 12) {
                switch (birthMonth) {
                    case 1:
                        monthString = "January";
                        break;
                    case 2:
                        monthString = "February";
                        break;
                    case 3:
                        monthString = "March";
                        break;
                    case 4:
                        monthString = "April";
                        break;
                    case 5:
                        monthString = "May";
                        break;
                    case 6:
                        monthString = "June";
                        break;
                    case 7:
                        monthString = "July";
                        break;
                    case 8:
                        monthString = "August";
                        break;
                    case 9:
                        monthString = "September";
                        break;
                    case 10:
                        monthString = "October";
                        break;
                    case 11:
                        monthString = "November";
                        break;
                    case 12:
                        monthString = "December";
                        break;
                }
                System.out.println("Your birthmonth is " + monthString);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth + "\n" + "Please enter a number between 1 and 12.");
            }
        } else {
            System.out.println("You did not enter a valid number!");
        }
    }
}
