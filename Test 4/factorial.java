import java.lang.*;
import java.util.*;
class fac
{
	public void num()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int b=sc.nextInt();
	    int sum=1;
		for(int i=1;i<=b;i++)
		{
			sum=sum*+i;
		}
		System.out.println("factorial is:"+sum);
	}
	public static void main(String args[])
	{
	
		check sc=new check();
		sc.num();
		
		
	}
}