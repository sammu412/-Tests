import java.lang.*;
class shape {
    public double areas() {
        System.out.println("calculating area");
		return 0;
    }
}
class circle extends shape {
    public double circle(double radius) {
        double c=3.14*radius*radius;
		return c;
    }
}
class rectangle extends circle {
    public double rectangle(double l,double b) {
        double r=l*b;
		return r;
    }
}
class triangle extends rectangle {
    public double triangle(double g,double h) {
        double t=0.5*g*h;
		return t;
    }
}

public class area 
{
    public static void main(String[] args) {
        triangle obj1=new triangle();
		obj1.areas();
		double ci=obj1.circle(4);
		double re=obj1.rectangle(32,54);
		double tr=obj1.triangle(45,23);
		System.out.println("circle:"+ci);
		System.out.println("rectangle:"+re);
		System.out.println("triangle:"+tr);
    }
}