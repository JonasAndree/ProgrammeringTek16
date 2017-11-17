/**
 * 
 */
package black.jack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

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
	private static Player dealer = new Player(false);
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		deck = new Deck();
		System.out.println("Deck created!");
		
		userInput = new Scanner(System.in);
		
		while (true) {
			System.out.print("How many players(1-6 players)?");
			String userStringInput = JOptionPane.showInputDialog("How many players(1-6 players)?");
			//String userStringInput = userInput.nextLine();
			players = Integer.parseInt(userStringInput);
			
			if (players > maxPlayers) {
				System.out.println("You selected too many players.");
				JOptionPane.showMessageDialog(null, "You selected too many players.");
			} else if (players < 1) {
				System.out.println("You selected too few players.");
				JOptionPane.showMessageDialog(null, "You selected too few players.");
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
		boolean dealerStage1 = false; 
		boolean dealerStage3 = false; 
		
		while (true) {
			Player player = playerList.get(playersTurn);
			System.out.println(player.getName() + " turn.");
			
			if (stage == 1 && dealerStage1 == false) {
				dealer.addCard( deck.getCard() );
				System.out.println("The dealer card:");
				dealer.printCards();
				dealerStage1 = true;
			} else if (stage == 3 && dealerStage3 == false) {
				dealer.addCard( deck.getCard() );
				System.out.println("The dealer cards:");
				dealer.printCards();
				dealerStage3 = true;
			}
			
			
			if (stage == 0) {
				player.bet();
			} else if (stage == 1) {
				player.addCard( deck.getCard() );
				player.addCard( deck.getCard() );
				player.printCards();
			} else if (stage == 2) {
				player.printCards();
				while (true) {
					if (player.getCardsValue() == 21) {
						player.set(true);
						break;
					}
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
				if (player.getCurrentBet() > 0) {
					if (dealer.getCardsValue() == 21) {
						player.set(false);
					} else if ( dealer.getCardsValue() > 21 ) {
						player.set(true);
					} else {
						if (dealer.getCardsValue() > player.getCardsValue()) {
							player.set(false);
						}
					}
				}
			}
			
			
			if (playersTurn < players - 1) {
				playersTurn++;
			} else {
				playersTurn = 0;
				boolean newRoundNeeded = false;
				
				if (stage == 3) {
					for(int i = 0; i < players; i++) {
						if (playerList.get(i).getCurrentBet() > 0) {
							newRoundNeeded = true;
							break;
						}
					}
					if(newRoundNeeded == true) {
						dealer.addCard(deck.getCard());
					} else {
						stage = 0;
					}
					
				} else {
					stage++;
				}
			}
		}
	}
}
