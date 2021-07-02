// Polymorphism: Same name having multiple forms.
// 2 types: a) Runtime -> Method overriding, b) Compile -> Method overloading

public class Vehicle {

    public void wheels(){
        System.out.println("All vehicles have wheels");
    }
}

class Audi extends Vehicle{

    public void wheels(){
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
