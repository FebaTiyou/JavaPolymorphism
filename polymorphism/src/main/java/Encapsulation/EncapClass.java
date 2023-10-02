package Encapsulation;

public class EncapClass {

	private String name;//cannot access outside the class ,only within the class
	private int salary;
	
	
	public String getName() {
		return name;
		//getter method- to read/to display
		//to access we need to use getter & setter method
	}
	public void setName(String name) {
		this.name = name;
		//setter method -to write 
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
