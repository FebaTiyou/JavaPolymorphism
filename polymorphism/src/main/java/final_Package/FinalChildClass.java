package final_Package;

public class FinalChildClass extends FinalParentClass {//If you make any class as final, 
	//you cannot extend it .
	
	public void childMethod()
	{
		System.out.println("This is child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalChildClass c = new FinalChildClass();
		c.childMethod();
		c.parentMethod();

	}

}
