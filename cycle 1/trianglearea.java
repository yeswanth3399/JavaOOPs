import java.util.*;
public class trianglearea 
{
        public static void main(String[] args)
        {
            int a,b,c,s;
            double area;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of side 1 ");
            a=sc.nextInt();
            System.out.println("Enter value of side 2 ");
            b=sc.nextInt();
            System.out.println("Enter value of side 3 ");
            c=sc.nextInt();
            s=(a+b+c)/2;

            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of the triangle is "+area);
            sc.close();
        }
}
