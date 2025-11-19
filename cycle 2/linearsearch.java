import java.util.*;
public class linearsearch
{
    public static void main(String args[])
    {
        int n,key,found=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of elements in array : ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element at "+i+" index is : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the key element to be searched : ");
        key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.print("Element is found at index "+i);
                found=1;
            }
        }
        if(found==0)
        {
            System.out.print("Element not found ");
        }
    }
}
