package basic.to.intermediate;

import java.util.*;
public class Q11_FactorialTable {
	
	/**
	 * This program reads a number n from the user and prints the 
	 factorial of numbers from 1 to n in a table format.
	 
	 Problem Flow:
	Read n from user
	Start fact = 1
	Loop from 1 to n
	Multiply fact *= i
	Print each number with its factorial
	
	Sample Output:
	Input:
	Enter the N value: 5

	Output:
	N   |   Factorial
	--------------------
  	1  |            1
  	2  |            2
  	3  |            6
  	4  |           24
  	5  |          120
	 */
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the N value: ");
	        int n = sc.nextInt();

	        int fact = 1;  
	        System.out.println("\nN   |   Factorial");
	        System.out.println("--------------------");
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	            System.out.printf("%-4d| %12d\n", i, fact);
	        }

	        sc.close();
	 }
	
}
