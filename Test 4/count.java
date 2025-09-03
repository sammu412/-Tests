import java.lang.*;
import java.util.*;
class prime
{
	static int primeNum() 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=obj.nextInt();
		if(n==0)
		{
			return 1;
		}
		int count=0;
		while(n!=0)
		{
			{
				n/=10;
				count++;
			}
		}
		System.out.println("enter a number:"+count);
        return count;
	}
	public static void main(String args[])
	{
		prime sc=new prime();
		sc.primeNum();
		
	}
}