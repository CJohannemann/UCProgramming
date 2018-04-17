package monthlyccbalance;
/**
 * @author cjohannemann
 */
public class MonthlyCCBalance {

    /**
     * A program that starts with a credit card balance of $5000 and then calculates the interest at a rate of 17%.  
     * Assume the user does not make any payments.  
     * Display the interest due after one month and again after two months.
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

      
        
        double balance       = 5000;
        double interestRate  = .17;
        double totInterest   = balance * interestRate;
        double totBalance    = 0;
        boolean pmt = false;
        
        if(!pmt){
            totBalance = balance + totInterest;
        }
        System.out.println("The total balance for this month is: $"+totBalance);
        if(!pmt){
            totBalance = (interestRate * totBalance) + totBalance;
        }
        System.out.println("If you don't pay anything, your bill next month will be: $"+totBalance);     
    }    
}
