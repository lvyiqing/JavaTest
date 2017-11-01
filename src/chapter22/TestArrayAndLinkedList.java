package chapter22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class TestArrayAndLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);
		
		System.out.println(arrayList);
		
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		
		System.out.println("Display the linked list forward:");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("Display the linked ist backward");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		
		List<String> list1 = Arrays.asList("red", "green", "blue");
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
		
		System.out.println("\n" + list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list1);
		System.out.println(list2);
		
		List<Integer> list3 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
		System.out.println("Index: " + Collections.binarySearch(list3, 7));
		System.out.println("Index: " + Collections.binarySearch(list3, 9));
		
		List<String> list4 = Arrays.asList("blue", "green", "red");
		System.out.println("Index: " + Collections.binarySearch(list4, "red"));
		System.out.println("Index: " + Collections.binarySearch(list4, "cyan"));
		
		List<Integer> list5 = Arrays.asList(10, 20, 30, 40, 50);
		Collections.reverse(list5);
		System.out.println(list5);
		
		List<String> list6 = Arrays.asList("yellow", "red", "green", "blue");
		Collections.shuffle(list6);
		System.out.println(list6);
		
		List<String> list7 = Arrays.asList("yellow", "red", "green", "blue");
		List<String> list8 = Arrays.asList("yellow", "red", "green", "blue");
		
		Collections.shuffle(list7, new Random(20));
		Collections.shuffle(list8, new Random(20));
		System.out.println(list7);
		System.out.println(list8);
		
		List<String> list9 = Arrays.asList("yellow", "red", "green", "blue");
		List<String> list10 = Arrays.asList("white", "black");
		Collections.copy(list9, list10);
		System.out.println(list9);
		System.out.println(list10);
		
		List<GregorianCalendar> list11 = Collections.nCopies(5, new GregorianCalendar(2005, 0, 1));
		System.out.println(list11);
		
		Collection<String> list12 = Arrays.asList("blue", "green", "red");
		System.out.println(Collections.max(list12));
		System.out.println(Collections.min(list12));
	}

}
