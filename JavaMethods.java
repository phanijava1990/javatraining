import java.util.Scanner;

public class JavaMethods {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        JavaMethods j=new JavaMethods();
        j.printFactorial(number);
    }

    public void printFactorial(int number){
        int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of number: "+fact);
    }

}
