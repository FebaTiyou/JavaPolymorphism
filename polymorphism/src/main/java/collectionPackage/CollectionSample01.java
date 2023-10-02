package collectionPackage;

import java.util.*;//* to import all class


public class CollectionSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>obj = new ArrayList<Integer>();//List is interface
		obj.add(5);//add is used to add value to the list
		obj.add(7);
		obj.add(9);
		//obj.add("String");
		
		/*for(int i:obj)//for each to print one by one 
		               * //for each can be used to print only for generic list
		{
			System.out.println(i);
		}
*/
		System.out.println(obj);
	}

}
