package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethodsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj = new ArrayList();
		obj.add(10);
		obj.add("String");
		obj.add("Good Mornong");
		obj.add(20);
		obj.add(20);
		
		System.out.println(obj);
		//1. //obj.remove(4);
		//System.out.println(obj);
		//2.//int size = obj.size();
		//System.out.println(size);
		//3.//obj.add(5, "new element");
		System.out.println(obj.contains("String"));
	}

}
