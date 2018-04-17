package firstinitial;
/**
 * @author cjohannemann
 */
public class FirstInitial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 20; j++) { 
                 System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
