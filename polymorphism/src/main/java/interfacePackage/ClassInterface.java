package interfacePackage;

public class ClassInterface implements InterfaceClassNew {
	
	public void details()
	{
		System.out.println("Method of interface");
		
	}
	
	public void display()
	{
		System.out.println("Method of class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassInterface c = new ClassInterface();
		c.details();
		c.display();

	}

}
