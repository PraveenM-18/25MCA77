package basic.to.intermediate;
import java.util.*;
public class Q20_FibonacciSeries {
	/**
	 * This program calculates and displays the first n numbers in the 
	 Fibonacci sequence. Each number is the sum of the previous 
	 two numbers.
	 
	 Code Flow 
	Input: number of terms n
	Initialize first two terms: f1 = 1, f2 = 1
	Loop from i = 3 to n:
		Find next term using f = f1 + f2
		Shift values for next round
	Display all terms
	
	Sample Input/Output
 	Input:
	How many Fibonacci terms? 10
	Output:
	1 1 2 3 5 8 13 21 34 55

	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Fibonacci terms? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int f1 = 1, f2 = 1;

        if (n == 1) {
            System.out.println(f1);
            return;
        }

        System.out.print(f1 + " " + f2);

        for (int i = 3; i <= n; i++) {
            int f = f1 + f2;
            System.out.print(" " + f);
            f1 = f2;
            f2 = f;
        }

        System.out.println(); 
    }
}
