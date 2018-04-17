package CalculateCircleArea;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class CalculateCircleArea {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = 0;
        System.out.println("Enter the radius of a circle: ");
//     * (Asks the user to enter the radius of a circle). 
        if(input.hasNextDouble()){
            r = input.nextDouble();
//     * The main should call the method with the user entered value and display the area calculated. 30 points
        CalculateCircleArea(r);
        }else{
            System.out.println("Please enter a valid number.");
        }
    }

//  * Write a method named CalculateCircleArea which receives one input, radius  from the user.     
    public static void CalculateCircleArea(double r){
//     * The area of a circle=πr^2  (r=radius, π=3.14)
        DecimalFormat f = new DecimalFormat("##.00");
        double p = Math.PI;
        double sq;
        sq = p*Math.pow(r,2);
//     * The program should display the area of the circle calculated by the method. 
            System.out.println("The area of a circle is: " + (f.format(sq)));
    }
}
