package chapter22;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("Sorted tree set: " + treeSet);
		
		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(): " + treeSet.headSet("New York"));
		System.out.println("tailSet(): " + treeSet.tailSet("New York"));
		
		System.out.println("lower(\"p\"): " + treeSet.lower("P"));
		System.out.println("higher(\"p\"): " + treeSet.higher("P"));
		System.out.println("floor(\"p\"): " + treeSet.floor("P"));
		System.out.println("ceiling(\"p\"): " + treeSet.ceiling("P"));
		System.out.println("pollFirst(\"p\"): " + treeSet.pollFirst());
		System.out.println("pollLast(\"p\"): " + treeSet.pollLast());
		System.out.println("New TreeSet" + treeSet);
	}

}
