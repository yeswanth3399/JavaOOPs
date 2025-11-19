import java.util.*;
public class pratice 
{
    public static void main(String[] args)
    {
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1 and c1 values :");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter r2 and c2 values :");
        r2=sc.nextInt();
        c2=sc.nextInt();
        if(r1!=c2)
        {
            System.out.println("Matrix multiplication is not poassible");
            return;
        }
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        System.out.println("Enter elements in mat a");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements in mat b");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix mutliplication is");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<c1;k++)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
