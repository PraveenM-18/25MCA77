package basic.to.intermediate;
import java.util.Scanner;

public class Q03_CompoundInterest {
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Value: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        float rate = sc.nextFloat();

        System.out.print("Enter No. of Years: ");
        float years = sc.nextFloat();

        float i = rate / 100;

        double finalAmount = principal * Math.pow((1 + i), years);

        System.out.printf("Compound Interest %.2f\n", finalAmount);

        
    }
}
