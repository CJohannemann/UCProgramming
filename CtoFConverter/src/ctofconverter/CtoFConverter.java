package ctofconverter;

/**
 * @author cjohannemann
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class CtoFConverter {

    /**
     * A program that converts an inputted temperature in C and provides the
     * equivalent temperature in F. Hint: Google is your friend! Given C, solve
     * for F. Again, check for a valid input value and only respond with the F
     * value if you got it, otherwise output an appropriate error msg to the
     * user. Testing: 3 conditions: Bad Input, then test for the known freezing
     * and boiling points.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner loop = new Scanner(System.in);

        boolean cel = true;
        double celc = 0;
        double far = 0;
        String question = "Please enter the C tempature you would like to convert to F ";
        String boiling = "This is the boiling point of water!";
        String frozen = "This is the freezing point of water!";
        int cold = 32;
        int hot = 212;

        System.out.println(question);
        if (cel = sc.hasNextDouble()) {
            celc = sc.nextDouble();
            far = (celc * 9 / 5) + 32;
            if (far == cold) {
                System.out.println(far + " degrees F. " + frozen);
            } else if (far == hot) {
                System.out.println(far + " degrees F. " + boiling);
            } else {
                System.out.println(far + " degrees F.");
            }
            System.out.println("Thanks, come again!");
            System.exit(0);
        } else {
            System.out.println("Please enter a valid number.");
        }
    }
}
