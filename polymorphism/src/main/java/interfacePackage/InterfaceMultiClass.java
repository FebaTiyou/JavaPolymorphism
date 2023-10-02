package interfacePackage;

public class InterfaceMultiClass implements interfaceMulti01,interfaceMuilti02{
	
	public void display()
	{
		System.out.println("Sample to display mutiple inheritance with same parent method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMultiClass c = new InterfaceMultiClass();
		c.display();
		

	}

}
