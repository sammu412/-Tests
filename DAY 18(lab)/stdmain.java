import java.lang.*;
class person
{
String name;
int age;
person(String n,int a)
 {
	 this.name=n;
	 this.age=a;
 }
}
class student extends person
{
int roll_no;
student(String n,int a,int r)
	{
		super(n,a);
		this.roll_no=r;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Agw:"+age);
		System.out.println("Roll no:"+roll_no);
	}
}
class stdmain
{
public static void main(String args[])
{
	student sc=new student("sammu",21,91102);
	sc.display();
}
}
