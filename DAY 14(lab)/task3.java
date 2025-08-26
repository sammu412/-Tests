import java.util.*;
import java.lang.*;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the elemet of array "+i+":");
		    a[i]=sc.nextInt();
		}
		System.out.print("a[]={");
		for(int i=0;i<size;i++)
		{
		System.out.print(a[i]+",");
		}
		System.out.println("}");
		int count=0;
		for(int i=0;i<size;i++)
		{
		if(a[i]%2==0)
		{
			count++;
		}
		}
		System.out.println("number of even values in array:"+count);
	}
}