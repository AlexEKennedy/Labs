package lab03;

import java.util.Scanner;

public class Program {
	  public static int getInt(String prompt) {
	    System.out.println(prompt);
	    Scanner s = new Scanner(System.in);
	    return s.nextInt();
	  }

	  public static void main(String[] args) {
	    getInt("Give number");
	  }
	}