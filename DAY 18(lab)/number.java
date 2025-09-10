import java.lang.*;
class numbers {
    public double degit_sum(int n) {
        int count=0;
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(n);
				System.out.println("rem values"+rem);
				count=count+rem;
				n=n/10;
		}
			System.out.println("sum of digits"+count);
    }
}
class specialNumber extends numbers {
    public double special(String num) {
        String rev="";
	for(int i=num.length()-1;i>=0;i--)
	{
		rev=+num.charAt(i);
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
/*class rectangle extends circle {
    public double rectangle(double l,double b) {
        double r=l*b;
		return r;
    }
}*/

public class number 
{
    public static void main(String[] args) {
        specialNumber obj1=new specialNumber();
		obj1.numbers(fgsf);
		obj1.special(2345);
    }
}