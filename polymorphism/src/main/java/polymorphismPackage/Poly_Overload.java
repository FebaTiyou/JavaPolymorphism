package polymorphismPackage;

public class Poly_Overload {
	public void method01(int a, int b)
	{
	System.out.println("The value of a and b is:"+a+" "+ b);
	}
	public void method01(String s)
	{
	System.out.println("The value of String is:"+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_Overload p = new Poly_Overload();
		p.method01(5,10);
		p.method01("Good");
	}

}
