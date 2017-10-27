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
	private static Deck deck;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		deck = new Deck();
		System.out.println("Deck created!");
		
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
		
		
		for (int numberOfCards = 0; numberOfCards < 10; numberOfCards++) {
			
			System.out.println( deck.getCard().getCard() );
			
			
		}
		
		
		
		
		
	}
}
