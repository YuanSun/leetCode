package enumTest;

public enum Face {
	Ace(1<<0),
	Deuce(1<<1),
	Three(1<<2),
	Four(1<<3),
	Five(1<<4),
	Size(1<<5),
	Seven(1<<6),
	Eight(1<<7),
	Nine(1<<8),
	Ten(1<<9),
	Jack(1<<10),
	Queen(1<<11),
	King(1<<12);
	
	private long faceValue;
	
	Face(long faceValue) {
		this.faceValue = faceValue;
	}
	
	public long getFace() {
		return faceValue;
	}
}
