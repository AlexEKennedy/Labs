package lab5;

import java.util.Scanner;

public class Program{
	  public static int getInt(String prompt) {
		    System.out.println(prompt);
		    Scanner s = new Scanner(System.in);
		    return s.nextInt();
		  }
	public static void grades() {
		int mark = getInt("Input your grades");
		if (mark < 1 || mark > 100) {
			System.out.println("Error: marks must be between 1 and 100");
		}
		else if (mark < 50) {
			System.out.println("Fail")
		}
		else if (mark < 61) {
			System.out.println("Pass")
		}
		else if (mark < 71) {
			System.out.println("Merit")
		}
		else {
			System.out.println("Distinction")
		}
			
	}
	public static void main(String args) {
		
	}
}