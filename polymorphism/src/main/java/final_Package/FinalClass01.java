package final_Package;

public class FinalClass01 {
	
	final int a =100;//If you make any variable as final ,
	//you cannot change the value of final variable(It will be constant).
	
	public void method01()
	{
		a = 250;//AS a is final value cannot be changed
		System.out.println("the value of a"+a);
	}
public static void main(String args[])
{
	FinalClass01 f = new FinalClass01();
	f.method01();
}
}
