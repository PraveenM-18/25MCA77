package basic.to.intermediate;


	
	/**This program prints a right-aligned triangle star pattern using 
	 nested for loops. The number of lines (n) is provided by the user.
	 
	Problem Flow
	Get number of lines from user.
	Loop from 1 to n (line-by-line).
	For each line:
	Print n - i spaces.
	Print i stars.
	Go to the next line.

	Input / Output Example
	Input:
	How many Lines? 5
	Output:
    *
   **
  ***
 ****
*****

	 */
	
	import java.util.Scanner;

	public class Q26_StarPattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("How many Lines? ");
	        int n = scanner.nextInt();

	        for (int i = 1; i <= n; i++) {
	            
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}



