package looping;

import java.util.Scanner;

public class prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. Check Prime Number
//		   Sample Input: 17
//		   Sample Output: Prime

		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(i%1==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("output: prime");
		}
		else
		{
			System.out.println("output: prime");
		}
	}

}
