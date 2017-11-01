package sort;

public class BubbleSort implements sortable {
	
	public void sort (int[] list) {
		int temp = 0;
		for (int i = 0; i < list.length; i ++) {
			boolean flg = false;
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					flg = true;
				}
			}
			
			if (flg) {
				PrintArray.Print(list);
			}
		}
	}
	
}
