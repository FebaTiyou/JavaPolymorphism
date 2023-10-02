package exceptionHandling;

public class ArrayBoundEx {
	public void display()
	{
	try
	{
		int a[] = new int[5];
		a[7] =10;
	}
	

	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	System.out.println("ArrayIndexOutOfBoundsException handled");
}
}