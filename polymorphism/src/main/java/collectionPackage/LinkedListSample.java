package collectionPackage;


import java.util.*;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add("String");
		obj.add("Good Mornong");
		obj.add(20);
		obj.add(20);
		obj.remove(2);
		System.out.println(obj);
		int s = obj.size();
		System.out.println(s);	
		System.out.println(obj.indexOf("String"));
		System.out.println("index of 20");
		System.out.println(obj.indexOf(20));
		System.out.println(obj.contains(20));
		System.out.println(obj.peekFirst());
		System.out.println(obj);
		System.out.println(obj.peekLast());
		System.out.println(obj);
		System.out.println(obj.pollFirst());//print and remove first element 
		System.out.println(obj);
		System.out.println(obj.pollLast());//print and remove last element 
		System.out.println(obj);
	}

}
