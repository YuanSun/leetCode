package enumTest;

public enum Directions {
	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S"); // Important note: must have semicolon at the end when 
				// there is a enum field or method
	
	private final String shortCode;
	
	Directions(String code) {
		this.shortCode = code;
	}
	
	public String getDirectionCode() {
		return this.shortCode;
	}
}
