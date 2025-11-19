public class ThrowsExample
{

	public static void main(String[] args) 
	{
		
		ThrowsExample obj= new ThrowsExample(); 
		try
		{
			obj.m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught "+e);
		}
		finally
		{
			obj = null;
			System.gc(); 
		}

	}
	
	void m1()throws Exception
	{
		m2();
	}
	
	void m2()throws Exception
	{
		throw new Exception();
	}

}
