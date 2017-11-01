package sort;

public class SelectSort implements sortable {
	
	public void sort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < list.length; j++) {
				if (list[minIndex] > list[j]) {
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				int temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
				PrintArray.Print(list);
			}
		}
	}
	
}
