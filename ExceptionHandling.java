// Exception Handling -> Throwable -> Exception -> a) Runtime, b) Compile time

public class ExceptionHandling {

    public static void main(String[] args) {

        int num=5;
        int result=0;
        String str=null;
        try{
            result = num/2;
            System.out.println(str.length());
            System.out.println("Result is: "+result);
        }catch(ArithmeticException e){
            System.out.println("Handled...");
        }catch (NullPointerException ne){
            System.out.println("Null Pointer ex...");
        }
        System.out.println("Helloooo");
    }
}
