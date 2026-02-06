package basic.to.intermediate;

import java.util.Scanner;

public class Q21_PrimeNumbersTable {
	
	/**
	 * This program reads a number n and prints the first n prime numbers.
	 A prime number is a number that is divisible only by 1 and itself.
	 
	 Problem Flow
	Get input n (how many primes).
	Start checking from 2.
	Use isPrime() to validate.
	If prime, print it and increment count.
	Stop when count reaches n.
	 
	Input / Output Example
	Input:
	How many Prime numbers? 10
	Output:
	2 3 5 7 11 13 17 19 23 29

	 */
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		boolean isPrime=true;
//		System.out.println("Enter a number to find prime: ");
//		int num=sc.nextInt();
//		if(num==1||num==2) {
//			System.out.println(isPrime); 
//		}
//		else if(num==0) {
//			System.out.println("Enter a positive number");
//		}
//		else {
//			for(int i=2;i<=num;i++) {
//				for(int j=2;j<=num/2;j++) {
//					if(num%2==0) {
//						isPrime=false;
//						System.out.println(isPrime);
//					}
//				}
//			}
//			if(isPrime!=false) {
//				System.out.println(num+ " is prime");
//			}
//			else {
//				System.out.println(num+ " is not prime");
//			}
//		}
//		
//	}
//
//	

}
