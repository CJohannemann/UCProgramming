package fileio;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * @author cjohannemann
 */
public class CalculateTotal {

    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter input file name: ");
        String inputFileName = console.next();
        System.out.print("Enter Output file name: ");
        String outputFileName = console.next();
        
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        
        PrintWriter out = new PrintWriter(outputFileName);
        
        double total = 0;
        
        while(in.hasNextDouble()){
            double value = in.nextDouble();
            out.printf("%15.2f\n", value);
            total = total + value;
            out.println("\n");
        }
        out.printf("Total: %8.2f\n", total);
        in.close();
        out.close();
    }
    
}
