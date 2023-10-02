package interfacePackage;

public class ChildInterfaceClass implements parentInterface01,parentInterface02 {
	
	public void parent01_method()
	{
		System.out.println("Parent01 Method");
	}

	public void parent02_method()
	{
		System.out.println("Parent02 Method");
	}
	
	public void child_method()
	{
		System.out.println("This is a sample for multiple inheritance with different parent method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInterfaceClass c = new ChildInterfaceClass();
		c.parent01_method();
		c.parent02_method();
		c.child_method();

	}

}
