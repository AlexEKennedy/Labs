package lab17;

public class Program {

	public static void main(String[] args) {
		Map map = new Map(500, 400);
		Plane t1 = new Plane(70, 30, map);
		Submarine t2 = new Submarine(100, 10, map);
		Plane t3 = new Plane(15, 200, map);
		t1.move("east", 200);
		t2.move("south", 100);
		t3.move("north", -70);
		t1.climb(50);
		t2.dive(100);
		t3.climb(2);
		System.out.printf("%d %d %d %d %d %d %d %d %d \n", t1.getX(), t1.getY(), t2.getX(), t2.getY(), t3.getX(), t3.getY(), t1.getHeight(), t2.getDepth(), t3.getHeight());
		t1.land();
		t2.surface();
		t3.land();
		System.out.printf("%d %d %d %d %d %d %d %d %d \n", t1.getX(), t1.getY(), t2.getX(), t2.getY(), t3.getX(), t3.getY(), t1.getHeight(), t2.getDepth(), t3.getHeight());
	}

}
