package lab04;

import java.util.Scanner;

public class Lab4 {
	Scanner scanner = new Scanner(System.in);
    public static int getInt(String prompt, Scanner scanner) {
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
	public void part1() {
		int price = getInt("Price of a bag please?", scanner);
		if (price < 0) {
			System.out.println("Invalid price");
			return;
		}
		else if (price == 0) {
			System.out.println("Free bags!");
			return;
		}
		
		int money = getInt("How much money do you have?", scanner);
		if (money < 0) {
			System.out.println("Invalid amount");
			return;
		}
		else if (money == 0) {
			System.out.println("You will be able to buy 0 bags");
			return;
		}
		
		int numBag = money / price;
		
		
		System.out.println("If the price is " + price + "p and you have " + money + "p then you will be able to buy " + numBag + " bags");
	}

}
