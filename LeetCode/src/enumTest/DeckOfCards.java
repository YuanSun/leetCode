package enumTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
	private List<Card> list;
	
	public DeckOfCards() {
		Card[] deck = new Card[52];
		int count = 0;
		
		// populate deck with Card obj
		for (Suit suit: Suit.values()) {
			for (Face face: Face.values()) {
				deck[count] = new Card(face, suit);
				++count;
			}
		}
		
		list = Arrays.asList(deck);
		Collections.shuffle(list); // shuffle deck
	}// end of constructor
	
	public void printCards() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-19s%s", list.get(i),
				((i + 1) % 4 == 0) ? "\n" : "");
		}
	}
}
