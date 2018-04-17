
package metricconverter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class MetricConverter {

    /**
     *Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches. 
     * Again, check for valid input and exit with an error msg if you don’t get it. 
     * Testing: use some known values here and watch for integer truncation.
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        Scanner meters = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat(".##");
        
        final double meter = 1609.344;
        double distance;
        
        System.out.println("Please enter the amount of meters you want to be converted.");
       if (meters.hasNextDouble()){
           distance = meters.nextDouble();
            double mile = distance / meter;
            double feet = distance * 3.28084;
            double inches = distance * 39.37008;
            System.out.println(distance + " meters = "+df2.format(mile) +" Miles.");
            System.out.println(distance + " meters = "+df2.format(feet)+" Feet.");
            System.out.println(distance + " meters = "+df2.format(inches)+" Inches.");
       }else{
           System.out.println("Please enter a valid number!");
       }
    }
}
