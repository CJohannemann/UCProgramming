package CountWords;

import calculateAverage.CalculateAverage;
import java.util.Scanner;
import org.w3c.dom.css.Counter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author cjohannemann
 */
public class CountWords {

    static Scanner input = new Scanner(System.in);
    static int counter = 0;
    static String str = "";
    public static int countStrings() {
        System.out.println("Enter a sentence: ");
        
        if (input.hasNextLine()) {
            str = input.nextLine();
            if ((str == null) || (str.isEmpty())) {
                return 0;
            }
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) !=  ' ') {
                    counter++;
                    //System.out.println("test2");
                    while (str.charAt(i) != ' '  && i < str.length()-1) {
                        i++;
                    }
                }
            }
            return counter;
        }
        return countStrings();
    }
    public static void resetSum(){
        CountWords.counter = 0;
    }
}
