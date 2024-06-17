package lab17;

public class Token {
	private int x;
	private int y;
	private Map map;
	public Token(int x, int y, Map map) {
		this.x = x;
		this.y = y;
		this.map = map;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Boolean move(String direction, int distance) {
		if (direction.toLowerCase() == "east") {
			x += distance;
		}
		else if (direction.toLowerCase() == "west") {
			x -= distance;
		}
		else if (direction.toLowerCase() == "north") {
			y += distance;
		}
		else if (direction.toLowerCase() == "south") {
			y -= distance;
		}
		
		return true;
		}
	
	}
