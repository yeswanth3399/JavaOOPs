import java.util.*;
public class amicable 
{
    public static void main(String[] args)
    {
        int a,b,c=0,d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A value");
        a=sc.nextInt();
        System.out.println("Enter B value : ");
        b=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                d=d+i;
            }
        }
        if(a==d&&b==c)
        {
            System.out.println("Amicable number ");
        }
        else{
            System.out.println("Not an amicable numbers ");
        }
    }
}
