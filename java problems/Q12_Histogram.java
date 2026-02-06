package basic.to.intermediate;

import java.util.Scanner;
public class Q12_Histogram {
	
	/**
	 * This program reads 5 numbers (each between 1 and 30) from the user.
	 For each number, it prints a line with that many asterisks *, 
	 forming a simple bar chart or histogram.
	 
	 Problem Flow:
	Read 5 numbers from the user
	Loop through each number
	For each number:
	Print the number
	Print that many * using inner loop
	
	Sample Output:
	Input:
	Enter 5 Numbers in a same line: 
	3 7 2 6 1
	Output:
	3 ***
 	7 *******
 	2 **
 	6 ******
 	1 *
 	
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nOutput:");
        
//        for (int num : numbers) {
//            System.out.print(num + ": ");
//            for (int i = 0; i < num; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
     
        
        for(int i=0;i<numbers.length;i++) {
        	
            System.out.print(numbers[i] + " ");
          
            for (int j = 0; j < numbers[i]; j++) 
            	{
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
	

}
