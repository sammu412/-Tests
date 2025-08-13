import java.lang.*;
import java.util.*;
class tenthmark
{
  public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	
    System.out.println("enter your tamil mark");
    int a=sc.nextInt();
    System.out.println("enter your english mark");
    int b=sc.nextInt();
    System.out.println("enter your maths mark");
    int c=sc.nextInt();
    System.out.println("enter your science mark");
    int d=sc.nextInt();
    System.out.println("enter your social science mark");
    int e=sc.nextInt();
	
    System.out.println("tami:"+a);
    System.out.println("english:"+b);
    System.out.println("maths:"+c);
    System.out.println("science:"+d);
    System.out.println("social science:"+e);
	
    double total=a+b+c+d+e;
    System.out.println("total:"+total);
	
    double avg=(total/500)*100;
    System.out.println("your average is:"+avg);

}
}