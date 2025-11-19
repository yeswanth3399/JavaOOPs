import java.util.Scanner;
public class ExceptionExample
{
	public static void main(String[] args) 
	{
		int a,b,index,res;
		int ary[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a ");
		a = sc.nextInt();

		System.out.println("Enter value for b ");
		b = sc.nextInt();
		
		System.out.println("Enter index to store result ");
		index = sc.nextInt();
		
		try
		{
			res = a/b;
			ary[index] = res;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception details "+ae);
		}
		catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Exception details "+aib);
		}
		
		System.out.println("Rest of the statements");
	}

}
