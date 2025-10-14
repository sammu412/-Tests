import java.util.*;
import java.lang.*;
class animal
{
	void sound()
	{
	System.out.println("sound of animal");	
	}
	}
	class cat extends animal{
		void sound(){
			System.out.println("meoww");
		}
	}
	class dog{
		void sound(){
			System.out.println("bark");
		}
	}
	
	public class runtime{
		public static void main(String args[])
		{
			dog sc=new dog();
			sc.sound();
		}
	}
