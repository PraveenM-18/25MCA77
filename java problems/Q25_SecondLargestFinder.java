package basic.to.intermediate;


	
	/**
	 * This program reads n integers into an array and finds the second
	 largest number among them. It uses a class with methods for input, 
	 processing (finding second largest), and output. It showcases 
	 array handling and object-oriented principles in Java.
	 
	Problem Flow 
	Read input size n
	Store values in array
	Use loop to compare and find:
		largest
		secondLargest
	Display result
	
	Input / Output Example
Input:
Enter how many numbers: 6
Enter the numbers:
10
45
22
45
8
19

Output:
Second largest number is: 22


	 */
	import java.util.Scanner;

	public class Q25_SecondLargestFinder {

	    private int[] numbers;

	    // Method to read input from user
	    public void readInput() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter how many numbers: ");
	        int n = scanner.nextInt();

	        numbers = new int[n];

	        System.out.println("Enter the numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	    }

	    // Method to find the second largest number
	    public int findSecondLargest() {
	        if (numbers.length < 2) {
	            System.out.println("At least two numbers are required.");
	            return Integer.MIN_VALUE;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : numbers) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }

	    // Method to display the result
	    public void displayResult(int secondLargest) {
	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No valid second largest number found.");
	        } else {
	            System.out.println("Second largest number is: " + secondLargest);
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        Q25_SecondLargestFinder finder = new Q25_SecondLargestFinder();

	        finder.readInput();
	        int secondLargest = finder.findSecondLargest();
	        finder.displayResult(secondLargest);
	    }
	}



