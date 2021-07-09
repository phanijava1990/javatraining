// Type Casting: Converts one type to another type
// Two types: a) Widening type casting, b) Narrowing type casting
public class TypeCasting {
    public static void main(String[] args) {
        int a=100;
        System.out.println("Value of a: "+a);
        double d=a;   // widening/implicit
        System.out.println("Value of d: "+d);

        double d1=100.5;
        System.out.println("Value of d1: "+d1);
        int a1= (int) d1;   // Narrowing / explicit

        System.out.println("Value of a1: "+a1);
    }
}
