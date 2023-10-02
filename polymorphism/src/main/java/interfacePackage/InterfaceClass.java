package interfacePackage;

public class InterfaceClass implements Interface01 {
	
	public void display()
	{
		System.out.println("first class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceClass i = new InterfaceClass();
		i.display();

	}

}
