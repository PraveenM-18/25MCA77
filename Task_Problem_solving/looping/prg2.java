package looping;

import java.util.Scanner;

public class prg2 {

	public static void main(String[] args) {
//		2. Print all odd and even numbers up to n
//		   Sample Input: 10
//		   Sample Output: Odd: 1 3 5 7 9, Even: 2 4 6 8 10

		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		System.out.print("odd:");
		for(int i=1;i<=n;i+=2)
		{
			
			if(i%2!=0)
			{
				System.out.print(i+"\t");
			}}
		System.out.print("even:");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				
				System.out.print(i+"\t");
			}
		}
		

	}

}
