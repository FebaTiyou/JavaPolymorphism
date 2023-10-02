package abstractionPackage;

public class AbstractClass03 extends AbstractionClass02{
	
	public void display()
	{
		System.out.println("Abstract function of first class");
	}

	public void show()
	{
		System.out.println("Abstract function of second class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass03 c = new AbstractClass03();
		c.display();
		c.show();
		c.details();

	}

}
