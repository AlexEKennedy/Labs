package lab06;

import java.util.Scanner;

public class Lab6 {

	public void part1(Scanner scanner) {
		grades(scanner);
	}
	
	public void grades(Scanner scanner) {
		String[] names = new String[5];
		int[] marks = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a name");
			names[i] = scanner.nextLine();
			System.out.println("Enter a mark");
			marks[i] = scanner.nextInt();
			scanner.nextLine();
		}
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int mark = marks[i];
			String result = "";

		    	if (mark < 1 || mark > 100) {
		    		result = "Error: marks must be between 1 and 100";
		    	}
		    	else if (mark < 50) {
		    		result = "Fail";
		    	}
		    	else if (mark < 61) {
		    		result = "Pass";
		    	}
		    	else if (mark < 71) {
		    		result = "Merit";
		    	}
		    	else {
		    		result = "Distinction";
		    	}
			
			System.out.printf("%s got %d marks and their result is: %s\n", name, mark, result);
		}
	}
}
	
//	public void account(double initial, double target, double interest) {
//		double current = initial;
//		int years = 0;
//		
//		while (current <= target) {
//			current += (current * interest);
//			years++;
//		}
//		
//		System.out.printf("It would take %d years to go from £%.2f to £%.2f at an interest rate of %.2f%%", years, initial, target, interest);
//	}
//}
