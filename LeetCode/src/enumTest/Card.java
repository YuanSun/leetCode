package enumTest;

public class Card {
	private final Face face;
	private final Suit suit;
	
	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}
	
	public Face getFace() {
		return face;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public String toString() {
		return String.format("%s of %s", face, suit);
	}
}
