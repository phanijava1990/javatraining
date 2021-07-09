// Polymorphism: Same name having multiple forms.
// 2 types: a) Runtime -> Method overriding, b) Compile -> Method overloading

public class Vehicle {
    int speed=100;

    public void wheels(){
        speed=200;
        System.out.println("All vehicles have wheels");
        System.out.println("Speed : "+speed);
    }
}

class Audi extends Vehicle{

    public void wheels(){
        super.wheels();
        System.out.println("Audi has wheels");
    }

    public void features(){
        System.out.println("Audi has many features");
    }

    public static void main(String[] args) {
        Audi a=new Audi();
        a.wheels();
        a.features();
    }
}
