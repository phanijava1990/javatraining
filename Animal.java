// Inheritance : One class is defined from another class
// Types: Single, Multilevel, Hierarchical, Hybrid, Multiple
// A -> B
// A -> B -> C
// A -> B, A -> C
// A -> B -> C, A -> D
// A -> B, A -> C, B, C -> D
public class Animal {

    public void eat(){
        System.out.println("All animals eat");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("All dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.eat();
//        d.bark();
//    }
}

class Puppy extends Dog{

    public void bark1(){
        System.out.println("Puppy also barks");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.bark1();
    }
}