package arrayii;

import java.util.*;
import java.util.Random;

/**
 * @author cjohannemann
 */
public class ArrayII {

    public static void main(String[] args) {

        /*
        * Q: Write a program that generates a sequence of 20 random values between 0 and 99 in an array,
        * prints the sequence, sorts it, and prints the sorted sequence. 
        * Use the sort method from the standard JAVA library
         */
        getMainArray();
        System.out.print("--------------------------------------------------------------------------");
        getSequence();
    }

    private static int[] getMainArray() {
        int[] numbers = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println();
        for (int element : numbers) {
            System.out.println(element + "  ");
        }
        return null;
    }
    
    private static int[] getSequence() {
        int[] numbers = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println();
        Arrays.sort(numbers);
        for (int element : numbers) {
            System.out.println(element + "  ");
        }
        return null;
    }
}
