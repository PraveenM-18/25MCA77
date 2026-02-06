package looping;

import java.util.Scanner;

public class prg6 {

	public static void main(String[] args) {
//		6. Sum of factorial of n numbers
//		   Sample Input: n = 3, 
//		   Sample Output: 2! + 3! + 4! = 2 + 6 + 24 = 32

		 Scanner sc=new Scanner(System.in);
		  
		 //user inputs
		 int sum=0;
		 System.out.println("enter inputs values:");
		 int n=sc.nextInt();
		 
		
		 int a;
		 for(int i=1;i<=n;i++)
		 {
		 System.out.println("enter numbers:");
		  a=sc.nextInt();
		 int f=1;
		 for(int j=1;j<=a;j++)
		 {
		  f*=j;
//		  System.out.println("factorial"+f);
		 }
//		 System.out.println("factorial "+f);
		  sum+=f;
		 }
		 
		System.out.println("sum of all factorial is="+sum);
	} }
	
//		  s=s+c;
//		  System.out.println(s);
		  
//		 System.out.println(c);
	
	