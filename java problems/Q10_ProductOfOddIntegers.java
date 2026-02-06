package basic.to.intermediate;

import java.util.Scanner;

public class Q10_ProductOfOddIntegers {
	
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */

	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int product=1;
		  System.out.println("Enter the number:");
	        int no = sc.nextInt();
	        StringBuilder oddNumbers = new StringBuilder();

	        for (int i = 1; i <= no; i += 2) {
	            product *= i;
	            oddNumbers.append(i);
	            if (i < no) {
	                oddNumbers.append(" × ");
	            }
	        }

	        System.out.println("Product of odd numbers from 1 to "+ no +" = " + product);
	        System.out.println("Odd numbers: " + oddNumbers.toString() + " = " + product);
	    }
}
