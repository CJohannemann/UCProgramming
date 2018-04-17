package shipcostcalculator;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class ShipCostCalculator {

    /**
     * An application program where the user enters the price of an item and the
     * program computes shipping costs. If the item price is $100 or more, then
     * shipping is free otherwise it is 2% of the price. The program should
     * output the shipping cost and the total price. Bullet proof the input so
     * they user cannot break the program.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double price = 0;
        int freeShipping = 100;
        double shippingCharge = 1.02;

        System.out.println("Please enter the price of the item.");
        if (input.hasNextDouble()) {
            price = input.nextDouble();
            if (price > freeShipping) {
                System.out.println("You qualify for free shipping!");
                System.out.println("Your total bill is : " + formatter.format(price));
            } else {
                System.out.println("You need to spend " + formatter.format((freeShipping - price)) + " to get free shipping.");
                System.out.println("Your total bill with shipping is : " + formatter.format((price * shippingCharge)));
            }
        } else {
            System.out.println("Please enter a valid number!");
        }
    }
}
