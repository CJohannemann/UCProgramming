package JavaVariables;

/**
 *
 * @author cjohannemann
 */
public class Variables {

    public static void main(String[] args) {
       int intOperandA = 6;
       int intOperandB = 5;
       int intSum = intOperandA + intOperandB;
       int intProduct = intOperandA * intOperandB;
       int intDifference = intOperandA - intOperandB;
       int intQuotient = intOperandA / intOperandB;
       int intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of "  + intOperandA + " + " + intOperandB +   " is " + intSum);
        System.out.println("The product using ints of "  + intOperandA + " x " + intOperandB +   " is " + intProduct);
        System.out.println("The difference using ints of "  + intOperandA + " - " + intOperandB +   " is " + intDifference);
        System.out.println("The quotient using ints of "  + intOperandA + " / " + intOperandB +   " is " + intQuotient);
        System.out.println("The modulo using ints of "  + intOperandA + " % " + intOperandB +   " is " + intModulo);

       System.out.println("");
       double dblOperandA = 6.3;
       double dblOperandB = 5.8;
       double dblSum = dblOperandA + dblOperandB;
       double dblProduct = dblOperandA * dblOperandB;
       double dblDifference = dblOperandA - dblOperandB;
       double dblQuotient = dblOperandA / dblOperandB;
       double dblModulo = dblOperandA % dblOperandB;
        System.out.println("The sum using dbls of "  + dblOperandA + " + " + dblOperandB +   " is " + dblSum);
        System.out.println("The product using dbls of "  + dblOperandA + " x " + dblOperandB +   " is " + dblProduct);
        System.out.println("The difference using dbls of "  + dblOperandA + " - " + dblOperandB +   " is " + dblDifference);
        System.out.println("The quotient using dbls of "  + dblOperandA + " / " + dblOperandB +   " is " + dblQuotient);
        System.out.println("The modulo using dbls of "  + dblOperandA + " % " + dblOperandB +   " is " + dblModulo);

        System.out.println("");
        
        int totalNumKids = 2;  System.out.println(totalNumKids);
        boolean raining = true;  System.out.println(!raining);
        double gasPrice = 2.84;  System.out.println(gasPrice);
        int favNum = 5;  System.out.println(favNum);
        double shoeSize = 10.5; System.out.println(shoeSize);
        int birthMonth = 10;  System.out.println(birthMonth);
        String fullName = "Chris Johannemann";  System.out.println(fullName);
        
    }
        
}
