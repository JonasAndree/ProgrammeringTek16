/**
 * 
 */
package black.jack;

import java.util.ArrayList;
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
	
	// Our players. 
	private static ArrayList<Player> playerList = new ArrayList<>();
	
	
	
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
		
		for (int i = 0; i < players; i++) {
			System.out.print("Player " + (i + 1) + " select a name: ");
			playerList.add( new Player()   );
		}
		int playersTurn = 0;
		int stage = 0;
		
		
		while (true) {
			Player player = playerList.get(playersTurn);
			System.out.println(player.getName() + " turn.");
			
			
			if (stage == 0) {
				player.bet();
			} else if (stage == 1) {
				player.addCard( deck.getCard() );
				player.addCard( deck.getCard() );
				player.printCards();
			} else if (stage == 2) {
				player.printCards();
				while (true) {
					System.out.println("Would you like one more card?");
					if (player.getOneMoreCard() == true) {
						player.addCard( deck.getCard() );
						player.printCards();
						if (player.getCardsValue() > 21) {
							player.set(false);
						} else if (player.getCardsValue() == 21) {
							player.set(true);
							break;
						}
					} else {
						break;
					}
				}
			} else if(stage == 3) {
				for (int i = 0; i < players; i++) {
					if (player.getCurrentBet() > 0) {
						
					}
				}
			}
			
			if (playersTurn < players - 1) {
				playersTurn++;
			} else {
				playersTurn = 0;
				stage++;
			}
		}
	}
}
