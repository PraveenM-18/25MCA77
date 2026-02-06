package looping;

import java.util.Scanner;

public class prg3 {

	public static void main(String[] args) {
		/*3. Multiplication Table of a number
		   Sample Input: 5
		   Sample Output: 5 10 15 20 25 30 35 40 45 50
         */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:");
		int n=sc.nextInt();
		int c;
		System.out.println("Output:");
		for(int i=1;i<=10;i++)
			
		{
			c=i*n;
			System.out.print(c+"\t");
		}
		
	}

}
