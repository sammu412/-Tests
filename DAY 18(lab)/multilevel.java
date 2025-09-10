import java.lang.*;
class Animal {
    public void animal() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    public void dog() {
        System.out.println("Bark");
    }
}
class puppy extends Dog {
    public void puppy() {
        System.out.println("Meow");
    }
}

public class multilevel {
    public static void main(String[] args) {
        puppy sc=new puppy();
		sc.animal();
		sc.dog();
		sc.puppy();
    }
}