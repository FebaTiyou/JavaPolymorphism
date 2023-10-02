package exceptionHandling;

public class FinallyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a= 10/2;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("final block");
		}
	}

}
