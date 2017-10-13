/**
 * 
 */
package black.jack;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jonas.andree
 *
 */
public class MainBlackJack {
	private static int players;
	private static Scanner userInput;
	private static int maxPlayers = 6;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		while (true) {
			System.out.print("How many players(1-6 players)?");
			String userStringInput = userInput.nextLine();
			players = Integer.parseInt(userStringInput);
			
			if (players > maxPlayers) {
				System.out.println("You selected too many players.");
			} else if (players < 1) {
				System.out.println("You selected too few players.");
			} else {
				System.out.println("You have selected " + players + " players.");
				break;
			}
		}
		
		Random randomCardGenerator = new Random();
		
		for (int numberOfCards = 0; numberOfCards < 10; numberOfCards++) {
			int cardValue = randomCardGenerator.nextInt(13) + 1;
			int cardType = randomCardGenerator.nextInt(4) + 1;
			String cardTypeString = null;
			if (cardType == 1) {
				cardTypeString = "\u2661";
			} else if (cardType == 2) {
				cardTypeString = "\u2662";
			} else if (cardType == 3) {
				cardTypeString = "\u2663";
			} else if (cardType == 4) {
				cardTypeString = "\u2660";
			}
			
			System.out.println(cardValue + cardTypeString);
		}
		
		
		
		
		
	}
}
