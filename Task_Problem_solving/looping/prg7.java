package looping;

import java.util.Scanner;

public class prg7 {

	public static void main(String[] args) {
//		7. Sum of Even and Odd numbers separately
//		   Sample Input: 10
//		   Sample Output: Sum of Even = 30, Sum of Odd = 25
		
Scanner sc=new Scanner(System.in);
System.out.println("enter inputs:");
int n=sc.nextInt();
int c=0,s=0;
for(int i=1;i<=n;i++)
{
	if(i%2==0)
	{
		c=c+i;
	}
//	System.out.println("sum of even="+i);
	else
	{
	s=s+i;
    }
//	System.out.println("sum of odd="+i);
	}
System.out.println("Output:");
System.out.print("sum of even="+c);
System.out.print(",sum of odd="+s);

	}

}
