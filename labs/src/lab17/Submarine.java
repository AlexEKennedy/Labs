package lab17;

public class Submarine extends Token {
	public Submarine(int x, int y, Map map) {
		super(x, y, map);
	}
	static int maxSpeed = 15;
	int depth = 0;
	public int getDepth() {
		return this.depth;
	}
	public void dive(int howDeep) {
		this.depth += howDeep;
	}
	public void surface() {
		this.depth = 0;
	}
}
