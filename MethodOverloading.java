public class MethodOverloading {

    public void calculateArea(int radius){
        double area=3.14*radius*radius;
        System.out.println("Area of circle : "+area);
    }

    public void calculateArea(int l,int w){
        int area=l*w;
        System.out.println("area of rect: "+area);
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.calculateArea(5);
        m.calculateArea(10,20);
    }
}
