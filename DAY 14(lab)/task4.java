import java.util.*;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={3,7,9,4,6,4};
		System.out.println("enter the element to search");
		int element=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				System.out.println("element is present at "+i);
			}
			else
			{
				count++;
			}
			
		}
		if(count==6)
			{
				System.out.println("element is not present");
			}
		
		
	
	}
}