import java.util.*;
class pali
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String num=sc.nextLine();
	String rev="";
	for(int i=num.length()-1;i>=0;i--)
	{
		rev=rev+num.charAt(i);
	}
	System.out.println(rev);
	if(num.equals(rev))
	{
		System.out.println("palindrome");
	}
	else
	{
	System.out.println("this is not palindrome");	
	}
	}
}