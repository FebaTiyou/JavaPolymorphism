package aggregationPackage;

public class AggregationChild {//in aggregation we cannot add 'extends'
	
	String course;
	int rank;
	AggregationParent p;//object of parent class,declaring as  instance variable in child class
	
	AggregationChild(String course,int rank,AggregationParent p)//passing parent class object 
	{
		this.course= course;
		this.rank= rank;
		this.p = p;//first class reference object
	}
	public void display()
	{
	System.out.println(p.age+" "+p.name);//displaying parent class instance variable.
	System.out.println(course+" "+rank);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationParent a= new AggregationParent(25,"Feba");//object of first class (a = p)/can give p object itself 
		AggregationChild c = new AggregationChild("Java",01,a);//as in child constructor parent object is passed, here also we need to pass 
		c.display();//In aggregation second class object should be used to access  both parent and child methods and variables 
		
	

	}

}
