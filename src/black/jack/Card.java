package black.jack;

import java.util.Random;

public class Card {
	private Random randomCardGenerator = new Random();
	
	private int cardValue;
	private String cardType;
	
	public Card() {
		cardValue = randomCardGenerator.nextInt(13) + 1;
		int cardType = randomCardGenerator.nextInt(4) + 1;

		if (cardType == 1) {
			this.cardType = "\u2661";
		} else if (cardType == 2) {
			this.cardType = "\u2662";
		} else if (cardType == 3) {
			this.cardType = "\u2663";
		} else if (cardType == 4) {
			this.cardType = "\u2660";
		}
	}
	
	public int getValue() {
		return cardValue;
	}
	
	public String getType() {
		return cardType;
	}
	
	public String getCard() {
		return cardValue + cardType;
	}
	
	public String toString() {
		return "Card[CardValue=" + cardValue + " CardType=" + cardType; 
	}
}
