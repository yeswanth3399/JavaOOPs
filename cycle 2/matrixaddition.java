import java.util.*;
public class matrixaddition 
{
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows of two matrices : ");
        m=sc.nextInt();
        System.out.println("Enter no.of columns of two matrices : ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("enter values of matrix a : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter values of matrix b : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrices addition is : ");
        c[0][0]=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
