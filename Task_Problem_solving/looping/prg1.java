package looping;

import java.util.Scanner;

public class prg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		System.out.print("Output:");
		for(int i=1;i<=n;i++)
		{
			System.out.print(+i+"\t");
		}

	}

}
