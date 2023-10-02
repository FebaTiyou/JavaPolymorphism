package exceptionHandling;

public class NullPointerEx {
	public void display()
	{
	try
	{
		String a = null;
		System.out.println(a.length());
	}
	

	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	System.out.println("NullPointerException handled");
}
}
