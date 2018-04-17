package yearlymaintenancecost;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author cjohannemann
 */
public class YearlyMaintenanceCost {
    /**
     * A program that uses home maintenance costs for each of the four seasons and returns the total yearly maintenance costs. 
     * Again, be clear in the output by echoing the values for the seasonal costs when you display the combined total.
     */
    public static void main(String[] args) {
       
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        double sum = 0;
        for(int i=1; i<=4; i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the season: ");
        String season = sc.nextLine();
        System.out.println("Please enter the maintenance cost associated with that season: ");
        double mc = sc.nextDouble();  
        sum += mc;
    }
        System.out.println("The total yearly cost of maintenance is: "+ formatter.format(sum));
    } 
}
