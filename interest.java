import java.util.*;

class interest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p,r,t");
        double p = sc.nextInt();
        double r = sc.nextInt();
        double t = sc.nextInt();
        
        double innerTerm = 1+(r/100);
        
        double powerTerm = Math.pow(innerTerm,t);
        
        double finalCI = p * (powerTerm-1);
        
        System.out.println("Final CI is "+finalCI);
        
        double simpleInterst = (p*r*t)/100;
        System.out.println("SI is "+simpleInterst);
        
        double interestDiff = finalCI-simpleInterst ;
        System.out.println("difference is"+interestDiff);
        
    }
}