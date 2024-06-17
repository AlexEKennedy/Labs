package lab03;

import java.util.Scanner;

public class lab03 {
	
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	
        int intResult = getInt("Please enter a number: ", scanner);
        scanner.nextLine();
        String strResult = getString("Please enter a string: ", scanner);
        System.out.println("Number is: " + intResult);
        System.out.println("String is: " + strResult);
        
        TheLunchQueue(scanner);
        
        convertInputToStones(scanner);
        scanner.close();
    }

    public static int getInt(String prompt, Scanner scanner) {
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
    
    public static String getString(String prompt, Scanner scanner) {
        System.out.println(prompt);
        String result = scanner.nextLine();
        return result;
    }
    
    public static void TheLunchQueue(Scanner scanner) {
    	String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ?", scanner);
    	int potatoes = getInt("How many roast potatoes would you like?", scanner);
    	int sprouts = getInt("How many brussel sprouts would you like?", scanner);
    	System.out.println("Your lunch is " + mainCourse + " with " + potatoes + " Potatoes and " + sprouts + " brussel sprouts");
    }
    public static void convertInputToStones(Scanner scanner) {
        int input = getInt("How manys lbs?", scanner);
        System.out.println(input + "lbs is equivalent to " + input / 14 + "st " + input % 14 + "lbs"); 
    }
}