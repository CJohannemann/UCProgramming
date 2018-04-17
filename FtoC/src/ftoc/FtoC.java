/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftoc;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author cjohannemann
 */
public class FtoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Scanner loopInput = new Scanner(System.in);
            
            boolean bingo = true;
            String far, another;
            double fahrenheit, celsius, c;
            while (bingo) {
                  System.out.println("Input temp in Fahrenheit:");
                  far = scan.next();
                  try {
                        fahrenheit = Double.parseDouble(far);
                        /*
                        Fahrenheit = (9/5) * Celsius + 32
                        */
                         c = fahrenheit - 32;
                         celsius = (c * 0.5556);
                         DecimalFormat f = new DecimalFormat("0.00");
                         
                        System.out.println("It is "+ f.format(celsius)  +" degrees celsius.");
                  } catch (NumberFormatException e) {
                        System.out.println("Invalid input");
                  }
            System.out.println("Do you want to enter a new temp? Y/N");
            another = loopInput.nextLine();
            if(another.equalsIgnoreCase("Y")){
                bingo = true;
            }else{
                bingo = false;
            }
        }
    }       
}
