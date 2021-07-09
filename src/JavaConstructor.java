import java.util.Scanner;

public class JavaConstructor {

    int num1,num2;

    public JavaConstructor(int num1,int num2){
        this.num1=num1;  // this -> keyword. it is used to refer to current object
        this.num2=num2;
    }

    public void add(){
        int add=num1+num2;
        System.out.println("Addition : "+add);
    }

    public void sub(){
        add();
        int sub=num1-num2;
        System.out.println("Subtraction : "+sub);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number2: ");
        int num2=sc.nextInt();

        JavaConstructor jc=new JavaConstructor(num1,num2);
      //  jc.add();
        jc.sub();

    }
}
