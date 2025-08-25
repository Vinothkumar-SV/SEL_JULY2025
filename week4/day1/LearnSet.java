package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	// Set is an interface
	// HashSet, LinkedHashSet, TreeSet are the classes that implements Set
	// interface
	// Set is a collection of elements
	// Set does not allow duplicate values
	public static void main(String[] args) {

		// Syntax
		// Set<ElementType> setName = new HashSet<ElementType>();

		Set<String> name = new HashSet<String>();

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
		System.out.println(name);
		
		
		
		List<String> list = new ArrayList<String>(name);
		
		
		for (int i = 0; i <list.size(); i++) {
			
			String string = list.get(i);
			
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
}