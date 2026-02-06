package looping;

import java.util.Scanner;

public class prg4 {

	public static void main(String[] args) {
//		4. Sum of numbers from 1 to n
//		   Sample Input: 5
//		   Sample Output: 15
		Scanner sc=new Scanner(System.in);
		
		int c=0;
		System.out.println("enter input:");
		int n=sc.nextInt();
		System.out.println("Output:");
		for(int i=1;i<=n;i++)
		{
			c=c+i;
		}
		System.out.println("sum of n numbers:"+c);


	}

}
