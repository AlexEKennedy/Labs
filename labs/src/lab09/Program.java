package lab09;

public class Program {

	public static void main(String[] args) {
		Map map = new Map(500, 400);
		Token t1 = new Token(70, 30, map);
		Token t2 = new Token(100, 10, map);
		Token t3 = new Token(15, 200, map);
		t1.move("east", 200);
		t2.move("south", 100);
		t3.move("north", -70);
		System.out.printf("%d %d %d %d %d %d", t1.getX(), t1.getY(), t2.getX(), t2.getY(), t3.getX(), t3.getY());
	}

}
