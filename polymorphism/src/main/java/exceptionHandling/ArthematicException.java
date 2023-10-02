package exceptionHandling;

public class ArthematicException {
public void display()
{
	try
	{
		int a= 5/0;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("ArithmeticException handled");
}

}
