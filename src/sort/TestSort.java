package sort;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		int[] arr = new int[15];
		
		List<sortable> list = new ArrayList<sortable>();
		list.add(new BubbleSort());
		list.add(new SelectSort());
//		list.add(new QuickSort());
		
		sortTest sortTest = new sortTest();
		for (sortable sortter : list) {
			System.out.println("--------------------");
			createRandomNumber(arr);
//			sortter.sort(arr);
			sortTest.setSortable(sortter);
			sortTest.doSort(arr);
		}
	}
	
	public static void createRandomNumber(int[] list) {
		for (int i = 0; i < 15; i++) {
			int num = (int)(Math.random() * 100 + 1);
			if (i == 0) {
				list[i] = num;
			} else {
				for (int j = 0; j < i; j++) {
					if (list[j] == num) {
						num = (int)(Math.random() * 100);
						j = -1;
					}
				}
				list[i] = num;
			}
		}
	}
}
