// java code to find cube root of two numbers 
import java.util.*;
class CubeRoot
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.cbrt(a+b);
        System.out.println("Cube root is"+c);
    }
}