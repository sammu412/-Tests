import java.util.*;
import java.lang.*;
class arith
{
	int add(int a,int b){
		return a+b;
	}
	double add(double a,double b){
		return a+b;
	}
	int add(int a,int b,int c){
		return a+b+c;
	}
}
	public class compiletime{
		public static void main(String args[])
		{
			arith sc=new arith();
			System.out.println("sum of two numbers "+sc.add(12,10));
			System.out.println("sum of two double numbers "+sc.add(12,11.4));
			System.out.println("sum of three numbers "+sc.add(12,10,10));
		}
	}
