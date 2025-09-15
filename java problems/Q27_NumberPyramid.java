package basic.to.intermediate;


	
	/**This program prints a numeric pyramid pattern where numbers 
	 increase from the middle outwards and then decrease symmetrically. 
	 The pattern is centered and uses nested loops
	 
	 Problem Flow Summary
	Ask user for number of lines (n).
	For each line i from 1 to n:
	Print spaces to align the pyramid.
	Print increasing numbers (i to i + i - 1).
	Print decreasing numbers back to i.
	Move to the next line after printing each row.
	
Input / Output Example
Input:
Enter Number of Lines: 5

Output:
    1
   232
  34543
 4567654
567898765


	 
	 */
	
	import java.util.Scanner;

	public class Q27_NumberPyramid {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Number of Lines: ");
	        int n = scanner.nextInt();

	        for (int i = 1; i <= n; i++) {

	            for (int s = 1; s <= n - i; s++) {
	                System.out.print(" ");
	            }

	            int num = i;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num);
	                num++;
	            }

	            num = num - 2; 
	            for (int j = 1; j < i; j++) {
	                System.out.print(num);
	                num--;
	            }

	            System.out.println();
	        }

	        scanner.close();
	    }
	}



