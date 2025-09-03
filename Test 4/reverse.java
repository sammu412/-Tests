import java.lang.*;
import java.util.*;
class reverse
{
	static void reverseNumber() 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number to reverse:");
		int n=obj.nextInt();
		//int n=1234;
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		System.out.println("reverse is:"+rev);
	}
	public static void main(String args[])
	{
		reverse sc=new reverse();
		sc.reverseNumber();
	}
}