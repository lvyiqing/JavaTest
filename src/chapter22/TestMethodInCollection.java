package chapter22;

import java.util.HashSet;
import java.util.Set;

public class TestMethodInCollection {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		
		System.out.println("set is "+ set);
		System.out.println(set.size() + " elements in set1");
		
		set.remove("London");
		System.out.println("\nset is "+ set);
		System.out.println(set.size() + " elements in set1");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("London");
		set2.add("Shanghai");
		set2.add("Paris");
		
		System.out.println("\nset is "+ set2);
		System.out.println(set2.size() + " elements in set2");
		
		System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
		
		set.addAll(set2);
		System.out.println("\nAfter adding set2 to set, set is " + set);
		
		set.removeAll(set2);
		System.out.println("\nAfter removing set2 from set, set is " + set);
		
		set.retainAll(set2);
		System.out.println("\nAfter removing common elements in set2 from set, set is " + set);
	}

}
