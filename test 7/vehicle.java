import java.util.*;
import java.lang.*;
class vehicles
{
	String color;
	int speed;
	vehicles(String color,int speed)
	{
		this.color=color;
		this.speed=speed;
	}
	void display(){
		System.out.println("vehicle color "+color);
		System.out.println("vehicle speed "+speed);
	}
}
class car extends vehicles{
	String model;
	String brand;
	car(String color,int speed,String model,String brand){
		super(color,speed);
		this.model=model;
		this.brand=brand;
	}
	void display(){
         super.display();
		System.out.println("vehicle model "+model);
		System.out.println("vehicle brand "+brand);
	}
	}
	public class vehicle{
		public static void main(String args[])
		{
			car sc=new car("Red",160,"hybrid","toyota");
			sc.display();
		}
	}
