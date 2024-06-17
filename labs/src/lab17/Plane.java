package lab17;

public class Plane extends Token{
	public Plane(int x, int y, Map map) {
		super(x, y, map);
	}
	static int maxSpeed = 360;
	int height = 0;
	public int getHeight() {
		return this.height;
	}
	public void climb(int howHigh) {
		this.height += howHigh;
	}
	public void land() {
		this.height = 0;
	}
}

