package black.jack;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (int i = 0; i < 52; i++) {
			while (true) {
				Card myCard = new Card();
				for (int j = 0; j < deck.size(); j++) {
					if (myCard.getValue() == deck.get(j).getValue()) {
						
					}
				}
				
				myCard.getCard();
				
				
				
				
			}
			
			
		}
		
		
	}

}
