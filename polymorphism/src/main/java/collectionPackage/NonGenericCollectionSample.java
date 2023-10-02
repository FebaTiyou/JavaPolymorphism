package collectionPackage;


import java.util.*;


public class NonGenericCollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List obj = new ArrayList();
		obj.add(10);
		obj.add("String");
		Iterator i = obj .iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
	}

}
}
