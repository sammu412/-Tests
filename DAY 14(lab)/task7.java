import java.lang.*;
class reverse
{
	static void reverseNumber(int n) 
	{
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
	
		}
		return rev;
	}
	public static void main(String args[])
	{
	System.out.println(reverseNumber(1234));
	//	reverseNumber(int n);
	}
}