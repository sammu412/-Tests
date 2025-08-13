import java.lang.*;
import java.util.*;
class tax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your income:");
int i=sc.nextInt();
if(i<=150000)
{
System.out.println("No tax");
}
else if(i>=150001 && i<=300000)
{
	double a=i*0.10;
System.out.println("Your tax is:"+a);
}
else if(i>=300001 && i<=500000)
{
	double b=i*0.20;
System.out.println("Your tax is:"+b);
}
else 
{
	double c=i*0.30;
System.out.println("Your tax is:"+c);
}
}
}