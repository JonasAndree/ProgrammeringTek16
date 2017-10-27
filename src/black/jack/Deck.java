package black.jack;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() {
		
	}
	
	public void newDeck() {
		for (int i = 0; i < 52; i++) {
			// Fortsätter tills vi hittar ett kort som inte finns med i kortleken.
			while (true) {
				Card myCard = new Card();
				
				boolean sameCard = false;
				// Browses the deck.
				for (int j = 0; j < deck.size(); j++) {
					if (myCard.getCard().equals(deck.get(j).getCard())) {
						sameCard = true;
						break;
					}
				}
				if (sameCard == false) {
					deck.add(myCard);
					break;
				}
			}
		}
	}
	
	public Card getCard() {
		if (deck.size() == 0) {
			newDeck();
		}
		
		Card tempCard = deck.get(0);
		deck.remove(0);
		return tempCard;
	}
}























