package salestax;

import java.text.NumberFormat;

/**
 *
 * @author cjohannemann
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /* Requirements:
    Task 1: 
    Project: SalesTax
    File:      SalesTax.java

    Given the price of a purchase the program computes and outputs a 5% sales tax. 
    Be sure to use output statements that clearly display the price and the computed sales tax. 
    (No conditions here, the sales tax is always the same rate.)
    Screenshots here from Task 1  (Be sure to include a readable shot of your programs output for each of these tasks):
    */
    
    double purchasePrice = 19.99;
    double tax = 0.05 * purchasePrice;
    double totPurchasePrice = (purchasePrice * tax) + purchasePrice;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
        System.out.println("The purchase price is " + formatter.format(purchasePrice) + ". " + "The sales tax is " + formatter.format(tax) + ".");
        System.out.println("Your total bill is " + formatter.format(totPurchasePrice) + ".");
    }
    
}
