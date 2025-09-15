package basic.to.intermediate;
import java.util.*;
public class Q14_TextAnalysis {
	
	/**
	 *  This program will read a line of text from the user, analyze 
	 each character, and count how many are letters, digits, whitespace, 
	 or other types of characters (like punctuation).
	 
	 Problem Flow:
	Prompt the user to input a line of text.
	Initialize counters for letters, digits, spaces, and other characters.
	Loop through each character and classify it into one of the categories.
	Display the count for each category: letters, digits, spaces, and others.

	Sample Input / Output:
	Input:
	Enter the text below:
	Hello World! 123

	Output:
	Letters : 10
	Digits : 3
	Space Chars : 2
	Others : 2

	 */
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        System.out.println("Enter the text below:");
	        String input = scanner.nextLine();

	        int letters = 0;
	        int digits = 0;
	        int spaces = 0;
	        int others = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else if (Character.isWhitespace(ch)) {
	                spaces++;
	            } else {
	                others++;
	            }
	        }

	       
	        System.out.println("Letters : " + letters);
	        System.out.println("Digits : " + digits);
	        System.out.println("Space Chars : " + spaces);
	        System.out.println("Others : " + others);
	    }

}
