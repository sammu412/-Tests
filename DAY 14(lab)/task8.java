import java.lang.*;
class sum
{
	public int getSum()
	{
		int a[]={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		sum+=a[i];	
		}
	    System.out.println("sum of all array element:"+sum);
		return sum;
	}
	public static void main(String args[])
	{
	
		sum sc=new sum();
		sc.getSum();
	}
}