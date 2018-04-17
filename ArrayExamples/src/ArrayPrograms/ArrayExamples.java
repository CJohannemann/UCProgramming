package ArrayPrograms;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cjohannemann
 */
public class ArrayExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        int[] numbers2 = {2,3,66,77};
        String[] names = new String[3];
        names[0] = "Anne";
        names[1] = "John";
        names[2] = "Jake";
        String[] Names2 = {"One", "Two", "Three"};
        
        for (int i=0; i<names.length; i++){
        System.out.print(names[i] + "   ");
        }
        System.out.println();
        
        for(String element:names){
            System.out.print(element + "  ");
        }
        System.out.println();
            for(int i=0; i<numbers2.length; i++){
                System.out.print(numbers2[i] + "  ");
            }
        System.out.println();
            for(int element:numbers2){
                System.out.println(element + "   ");
            }
            Random rand = new Random();
             for(int i=0; i<numbers.length; i++){
                 numbers[i]=rand.nextInt(100);
             }
             System.out.println();
             for(int element:numbers){
                 System.out.println(element + "  ");
             }
             double [] [] score ={
                 {22,77,88},
                 {90,77,88},
                 {66,88,29},
                 {66,87,79},
             };
             
             score[2][2] = 100;
             
             for(int r=0;r<4; r++){
                 for(int c = 0; c<3;c++){
                 System.out.println(score[r][c] + "   ");
                }
                 System.out.println();
             }
             
             System.out.println();
             
             ArrayList<String> sNames = new ArrayList<String>();
                sNames.add("Anne");
                sNames.add("Abby");
                sNames.add("John");
                sNames.add("Jane");
                sNames.add("Jake");
                    System.out.println(sNames);
                        System.out.println("First item: "+ sNames.get(0));
                        System.out.println(sNames.size());
                        sNames.remove(0);
                        System.out.println(sNames);
                        sNames.add(4, "Jacob");
                        System.out.println(sNames);
                        
                        ArrayList<String> sNames2 = new ArrayList<String>(sNames);
                        
    
    }
    
}
