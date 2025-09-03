import java.lang.*;
import java.util.*;
class square
{
	public int num()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int b=sc.nextInt();
		int c=b*b;
		System.out.println("square is:"+c);
		return c;
	}
	public static void main(String args[])
	{
	
		square sc=new square();
		sc.num();
		
		
	}
}