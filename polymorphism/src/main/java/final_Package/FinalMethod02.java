package final_Package;

public class FinalMethod02 extends finalMethod{
	
	public void Method01()//If you make any method as final, you cannot override it .
	{
		System.out.println("Child Method overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethod02 f = new FinalMethod02();
		f.Method01();
		

	}

}
