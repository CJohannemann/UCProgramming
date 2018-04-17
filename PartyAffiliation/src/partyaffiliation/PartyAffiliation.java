package partyaffiliation;

import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class PartyAffiliation {

    /**
     * (This task uses Strings:) A program that prompts the user for their party affiliation 
     * (Democrat, Republican, or Independent) and responds accordingly with a Donkey, Elephant, Person, or Other.
     * (i.e. “You get a Democratic Donkey.”)  Notes: create a menu so the user chooses D, R, or I and assume that any other choice will be Other. 
     * This program does not require any input checking. Tests: just the four options D, R, I, Other.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please select what party you're affiliated with. D, R, I, Other");
        String party = input.next();
        
            if(party.equalsIgnoreCase("D")){
                System.out.println("You are a Democratic Donkey.");
            }else if(party.equalsIgnoreCase("R")){
                System.out.println("You are a Republican Elephant.");
            }else if(party.equalsIgnoreCase("I")){
                System.out.println("You are an Independent Person.");
            }else{
                System.out.println("You are an other.");
            }  
    }
}
