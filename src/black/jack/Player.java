package black.jack;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	private int dollar = 200;
	private int currentBet = 0;
	private Scanner playerScanner = new Scanner(System.in);
	private String name = "John Doe";
	private ArrayList<Card> playersCards = new ArrayList<>();
	
	public Player() {
		name = playerScanner.nextLine();
	}
	public String getName() {
		return name;
	}
	
	public void addCard(Card newCard) {
		playersCards.add(newCard);
	}
	public int getCardsValue() {
		int value = 0;
		if (playersCards.size() == 0)
			return 0;
		for (int i = 0; i < playersCards.size(); i++) {
			value += playersCards.get(i).getValue();
		}
		return value;
	}
	
	
	
	
	
	
	public boolean bet() {
		System.out.println("Do you want to bet? (Yes/No)");
		
		while (true) {
			String answer = playerScanner.nextLine();
			if (answer.equals("Yes")) {
				break;
			} else if (answer.equals("No")) {
				return false;
			} else {
				System.out.println("Incorrect input, answer Yes or No");
			}	
		}
		
		while (true) {
			try {
				int bet = Integer.parseInt( playerScanner.nextLine() );
				if (bet > dollar) {
					System.out.println("You only have: " + dollar);
				} else if (bet <= 0) {
					System.out.println("You have to enter a positive amount.");
				} else {
					dollar -= bet;
					currentBet = bet;
					return true;
				}
			} catch (Exception e) {
				System.out.println("Not an integer!");
			}
		}
	}
	public void set(boolean won) {
		if (won == true) {
			dollar += 2 * currentBet;
		}
		
		currentBet = 0;
	}
}
