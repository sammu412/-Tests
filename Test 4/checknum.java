import java.lang.*;
import java.util.*;
class check
{
	public void num()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int b=sc.nextInt();
		if(b%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
	}
	public static void main(String args[])
	{
	
		check sc=new check();
		sc.num();
		
		
	}
}