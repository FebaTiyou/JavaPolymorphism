package interfacePackage;

public class ClassRun implements InterfaceDisplay{
	
	public void show()
	{
		System.out.println("This is method of interface show");
	}
	public void display()
	{
		System.out.println("This is method of interface display");
	}
	public void run()
	{
		System.out.println("This is method of class run");
	}
	public static void main(String[] args) {
		
		ClassRun r = new ClassRun();
		r.show();
		r.display();
		r.run();
	}

}
