package rockpaperscissors;

import java.util.Scanner;

/**
 * @author cjohannemann
 */
public class RockPaperScissors {

    /**
     * a.Get a move choice from playerA which must be R, P, S or r, p, s Loop
     * until you get a valid move b.Get a move choice from playerB in the same
     * manner c.Display the results using the accepted phrases from the game
     * Rock breaks Scissors, Paper covers Rock, Scissors cuts Paper and indicate
     * the winner (Player A wins) or Rock vs Rock it’s a Tie! Etc… d.Prompt the
     * user to play again [Y/N]
     */
    public static void main(String[] args) {
        Scanner playerA = new Scanner(System.in);
        Scanner playerB = new Scanner(System.in);
        Scanner replay = new Scanner(System.in);
        String r = "Rock";
        String p = "Paper";
        String s = "Scissors";
        String choiceA = "";
        String choiceB = "";
        String answer = "y";
        boolean bingo = true;

        while (bingo) {
//***********************************************************************************************
//Player one input
            System.out.println("Player one, please enter R, P, or S");
            if (playerA.hasNext()) {
                choiceA = playerA.nextLine();
            }
            if ((!choiceA.equalsIgnoreCase("r")) && (!choiceA.equalsIgnoreCase("p")) && (!choiceA.equalsIgnoreCase("s"))) {
                System.out.println("You need to enter the correct game code -  you entered " + choiceA);
                bingo = true;
            } else {
//************************************************************************************************
//Player two input
                System.out.println("Player two, please enter R, P, or S");
                if (playerB.hasNext()) {
                    choiceB = playerB.nextLine();
                }
                if ((!choiceB.equalsIgnoreCase("r")) && (!choiceB.equalsIgnoreCase("p")) && (!choiceB.equalsIgnoreCase("s"))) {
                    System.out.println("You need to enter the correct game code -  you entered " + choiceB);
                    bingo = true;
                } else {
//*************************************************************************************************
//Game puzzle
//rock p1
                    if (choiceA.equalsIgnoreCase("r") && choiceB.equalsIgnoreCase("r")) {
                        System.out.println("It's a tie!");
                    } else if (choiceA.equalsIgnoreCase("r") && choiceB.equalsIgnoreCase("p")) {
                        System.out.println(p + " beats " + r);
                        System.out.println("Player two wins!");
                    } else if (choiceA.equalsIgnoreCase("r") && choiceB.equalsIgnoreCase(s)) {
                        System.out.println(r + " beats " + s);
                        System.out.println("Player one wins!");
//paper p1                        
                    } else if (choiceA.equalsIgnoreCase("p") && choiceB.equalsIgnoreCase("p")) {
                        System.out.println("It's a tie!");
                    } else if (choiceA.equalsIgnoreCase("p") && choiceB.equalsIgnoreCase("r")) {
                        System.out.println(p + " beats " + r);
                        System.out.println("Player one wins!");
                    } else if (choiceA.equalsIgnoreCase("p") && choiceB.equalsIgnoreCase("s")) {
                        System.out.println(s + " beats " + p);
                        System.out.println("Player two wins!");
//scissors p1                        
                    } else if (choiceA.equalsIgnoreCase("s") && (choiceB.equalsIgnoreCase("s"))) {
                        System.out.println("It's a tie!");
                    } else if (choiceA.equalsIgnoreCase("s") && choiceB.equalsIgnoreCase("r")) {
                        System.out.println(r + " beats " + s);
                        System.out.println("Player two wins!");
                    } else if (choiceA.equalsIgnoreCase("s") && choiceB.equalsIgnoreCase("p")) {
                        System.out.println(s + " beats " + p);
                        System.out.println("Player one wins!");
                    }

//Loop
                    System.out.println("Do you want to play again? y/n");

                    if (replay.hasNext()) {
                        answer = replay.nextLine();
                        if (answer.equalsIgnoreCase("Y")) {
                            bingo = true;
                        } else {
                            bingo = false;
                            System.out.println("Come play again soon!");
                        }
                    }
                }
            }
        }
    }
}
