package lab18;

public class Program {

	public static void main(String[] args) {
		Car[] cars = new Car[7];
		cars[0] = new Car("Honda", 30);
		cars[1] = new Car("Hyundai", 30);
		cars[2]= new Car("Renault", 20);
		cars[3] = new Car("Citroen", 45);
		cars[4] = new Car("Mini", 60);
		cars[5] = new Racingcar("Ferrari", 90, "Driver1", 1.1);
		cars[6] = new Racingcar("Audi", 100, "Driver2", 1.1);
	}
		public static void processCars(Car[] cars) {
			for(int i = 0; i < cars.length; i++) {
				cars[i].getToSixty();
				cars[i].accelerate(2);
				System.out.println(cars[i].speed + cars[i].model + "\n");
			}
		
	}
}