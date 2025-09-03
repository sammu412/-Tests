import java.lang.*;
import java.util.*;
class prime
{
	static void primeNum() 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=obj.nextInt();
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
	if(count==1)
	{
	System.out.println("this is prime number");	
	}
	else
	{
		System.out.println("this is not a prime number");
	}
	}
	public static void main(String args[])
	{
		prime sc=new prime();
		sc.primeNum();
	}
}