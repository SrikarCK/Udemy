public class AreaCalculator {
    public static void main(String[] args){

        System.out.println("Area of Circle: "+area(-2));
        System.out.println("Area of Rectangle: "+area(10,20));

    }

    public static double area(double radius){
        if(radius < 0){
            //return -1.0;
        }
        double pi = 3.14159;
        double ar = pi * (radius * radius);
        return ar;
    }

    public static double area(double x,double y){
        if(x < 0 || y < 0){
            return -1.0;
        }

        double aRectangle = x * y;
        return aRectangle;
    }
}


