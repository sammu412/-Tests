import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year:");
		int a=sc.nextInt();
	   
	   if(a%4==0)
	   {
			System.out.println("this is leap year");
	   }
	   else
	   {
		   System.out.println("this is not leap year");
	   }
	}
}