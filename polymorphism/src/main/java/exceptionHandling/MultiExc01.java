package exceptionHandling;

public class MultiExc01 {
	public void display()
	{
		try
		{
			int a= 5/0;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
