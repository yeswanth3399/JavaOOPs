import java.util.*;
public class roots
{
    public static void main(String[] args)
    {
        int a,b,c;
        double root1,root2,discriminate;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a=sc.nextInt();
        System.out.println("Enter value of b :");
        b=sc.nextInt();
        System.out.println("Enter value of c : ");
        c=sc.nextInt();
        discriminate=(b*b)-(4*a*c);
        if(discriminate>0)
        {
            System.out.println("Roots are real and distinct");
            root1=(-b+Math.sqrt(discriminate)/(2*a));
            root2=(-b-Math.sqrt(discriminate)/(2*a));
            System.out.println("Root1 = "+root1+" Root2= "+root2);
        }
        else if(discriminate==0)
        {
            System.out.print("Roots are equal and real ");
            root1=-b/(2*a);
            System.out.println("Roots are :"+root1);
        }
        else
        {
            System.out.println("Roots are imaginary ");
            root1=-b/(2*a);
            System.out.println("Root1= "+root1+"+i"+Math.sqrt(-discriminate)/(2*a));
            System.out.println("Root2= "+root1+"-i"+Math.sqrt(-discriminate)/(2*a));
        }
    }
}
