package Game;

import java.util.*;

public class Game1 {

	public static void main(String[] args) {
		System.out.println("\n***************************************************************************");
		System.out.println("\t Welcome to rock,paper,scissor Game \n**************************************************************************");
		String[] play = {"rock","paper","scissor"};
		Scanner scan= new Scanner(System.in);
		System.out.println("TO start the game, type 'start' or type 'exit' to exit: ");
		String start = scan.nextLine();
		boolean boo =start.equalsIgnoreCase("start");
		while(boo) {
			 System.out.println("Enter rock, paper, or scissors. ");
			 String user= scan.nextLine();
	    if (!user.equalsIgnoreCase("rock") && !user.equalsIgnoreCase("paper") && !user.equalsIgnoreCase("scissors")) {
	         System.out.println("Invalid input, please try again.");
	          continue;
	          }
	    int gameChoice = (int) (Math.random() * 3);
        String comp = play[gameChoice];
        System.out.println("Computer choice: " + comp);
        if (user.equals(comp)) {
        	System.out.println("\n*********************************************");
            System.out.println("\t Tie! \n*************************************************");
        } else if (
            (user.equalsIgnoreCase("rock") && comp.equalsIgnoreCase("scissors")) ||
            (user.equalsIgnoreCase("paper") && comp.equalsIgnoreCase("rock")) ||
            (user.equalsIgnoreCase("scissors") && comp.equalsIgnoreCase("paper"))
        ) {
        	System.out.println("\n*********************************************");
            System.out.println("\t You win! \n*************************************************");
        } else {
        	System.out.println("\n*********************************************");
            System.out.println("\t Computer wins! \n*************************************************");
        }
		}
		System.out.println("Thanks for Playing ");
	}
}
