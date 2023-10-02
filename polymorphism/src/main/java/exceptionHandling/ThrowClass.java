package exceptionHandling;

public class ThrowClass {
	
	public static void details(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("Not Eligible");
	 }
		else
		{
			System.out.println("Eligible to vote");
		}

}
}