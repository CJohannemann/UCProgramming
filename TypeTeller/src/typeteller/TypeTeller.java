package typeteller;

import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class TypeTeller {

    /**
     * Create a program that prompts the user to “Enter some stuff: “.  
     * Determine if the “stuff” is an int or a double and read it in with the appropriate Scanner method, otherwise read it in as a String. 
     * Echo the input value back to the user indicating that it is either an int, double, or string.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter some stuff: ");
        
        if(input.hasNextInt()){
            int integers = input.nextInt();
            System.out.println("Printing all the integers: "+ integers);
        }else if(input.hasNextDouble()){
            double doubles = input.nextDouble();
            System.out.println("Printing all the doubless: "+ doubles);
        }else{
            String strings = input.nextLine();
            System.out.println("Printing all the Strings: "+ strings);
        }
    }
}
