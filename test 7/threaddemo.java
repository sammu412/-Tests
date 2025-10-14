import java.util.*;
import java.lang.*;
//import java.Exception.*;
class demo
{
	public void run()
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("number:"+i);
			
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
			System.out.println(e);	
			}
			}
		}
}
public class threaddemo{
	public static void main(String args[])
	{
		demo sc=new demo();
		sc.run();
	}
}

