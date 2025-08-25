package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	// list is an interface
	// ArrayList, LinkedList, Vector, Stack are the classes that implements List
	// interface
	// List is a collection of elements
	// List allows duplicate values
	// List maintains the insertion order

	public static void main(String[] args) {

		// Syntax
		// List<ElementType> listName = new ArrayList<ElementType>();

		List<String> name = new ArrayList<String>();
		// to add the element

		name.add("sangirthiyayan");
		name.add("valliappan");
		name.add("dhanaKrishnan");
		name.add("mithiun");
		name.add("vijay");
		name.add("VijayKumar");
		name.add("Dinesh");
		name.add("diwakar");
		name.add("Gowtham");
		name.add("Mohamed");
		name.add("joshel");
		name.add("sham");
		name.add("gayathiri");
		name.add("harini");
		name.add("deepika");
		name.add("reshma");
		name.add("VijayKumar");
		name.add("janaki");
		name.add("sinduja");
		name.add("arthi");
		name.add("monica");
		name.add("beniza");
		name.add("shanika");
		name.add("kiruthuga");
		// to get the count of the element
		System.out.println(name.size());

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));

		}
		
		name.remove(3);
		name.remove("vinoth");
	
		
		System.err.println(name.size());
		System.out.println("After removing the element");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));

		}
		
		name.clear();
		System.out.println("After clear the element");
		System.out.println(name.size());
	}
	
	
	

}
