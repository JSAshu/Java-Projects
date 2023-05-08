// java code to calculate area of a triangle 
import java.util.*;
class AreaofTraingle
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b,c");  
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x = (a+b+c)/2.0;
        double y = Math.sqrt(x*(x-a)*(x-b)*(x-c));
        System.out.println("Area of the triangle is"+y);
    }
}