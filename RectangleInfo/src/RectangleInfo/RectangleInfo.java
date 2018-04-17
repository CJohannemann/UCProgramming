package RectangleInfo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class RectangleInfo {

    /**
     * Write a program that asks the user for the lengths of the sides of a
     * rectangle. Again, check for valid input and exit with an error msg if you
     * don’t get it. Testing: use some known values to confirm that the
     * calculations are correct. E.g. 3 – 4 - 5 triangle >> 3 X 4 rectangle Then
     * print The area and perimeter of the rectangle The length of the diagonal
     * (use the Pythagorean theorem)
     */
    public static void main(String[] args) {

        Scanner length = new Scanner(System.in);
        Scanner width = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        MathContext mc = new MathContext(2);


            System.out.println("Please enter the length on your rectangle:");
            if (length.hasNextDouble()) {
                BigDecimal num1 = length.nextBigDecimal();
                System.out.println("Please enter the width of your rectangle:");
                BigDecimal num2 = length.nextBigDecimal();

                BigDecimal area = num1.multiply(num2, mc);
                System.out.println("The area of the triangle is " + area);

                BigDecimal perm = num1.add(num2, mc);
                System.out.println("The perimeter of the triangle is " + perm);

                BigDecimal pyth = num1.multiply(num1);
                BigDecimal pyth2 = num2.multiply(num2);
                BigDecimal totPyth = pyth.multiply(pyth2);
                System.out.println("The Pythagorean theorem oh this rectangle is " + totPyth.setScale(2, RoundingMode.CEILING));
            } else {
                System.out.println("Please enter a numeric value.");
            }
        }
    }

