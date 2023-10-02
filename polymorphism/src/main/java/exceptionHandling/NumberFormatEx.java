package exceptionHandling;

public class NumberFormatEx {

	public void display()
	{
	try
	{
		String a = "String";
		int b = Integer.parseInt(a);
		
	}
	

	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	System.out.println("NumberFormatException handled");
}
}
