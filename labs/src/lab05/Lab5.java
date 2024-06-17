package lab05;

import java.util.Scanner;

public class Lab5 {
	Scanner scanner = new Scanner(System.in);
    public static int getInt(String prompt, Scanner scanner) {
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
    public void grades() {
    	int mark = getInt("Enter your mark ", scanner);
    	if (mark < 1 || mark > 100) {
    		System.out.println("Error: marks must be between 1 and 100");
    	}
    	else if (mark < 50) {
    		System.out.println("Fail");
    	}
    	else if (mark < 61) {
    		System.out.println("Pass");
    	}
    	else if (mark < 71) {
    		System.out.println("Merit");
    	}
    	else {
    		System.out.println("Distinction");
    	}
    }
}
