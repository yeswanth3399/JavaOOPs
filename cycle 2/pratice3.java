import java.util.*;
public class pratice3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int f=1;
        if(n>0){
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of given number"+n+" is "+f);}
        else
        {
            System.out.println("Doesnt exit");
        }
        sc.close();
    }
}