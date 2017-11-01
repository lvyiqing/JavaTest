package sort;

public class QuickSort{

	public static void main(String[] args) {
		int[] array = {52, 49, 80, 36, 14, 58, 61, 97, 23, 75};
	
		int low = 0;
		int high = array.length - 1;
		
		quickSort(low, high, array);
	}
	
	public static void quickSort(int low, int high, int[] array) {
		if (low < high) {
			int num = partitionSort(low, high, array);
			
			for (int o = 0; o < array.length; o++) {
				System.out.print(array[o] + " ");
			}
			System.out.println();
			
			quickSort(low, num - 1, array);
			quickSort(num + 1 , high, array);
		}
	}
	
	public static int partitionSort(int low, int high, int[] array) {
		
		int temp = array[low];
		
		while (low < high) {
			for (int j = high; j >= 0; j--) {
				if (j == low) {
					high = j;
					array[j] = temp;
					break;
				} else {
					if (array[j] < temp) {
						high = j;
						array[low] = array[j];
						break;
					}
			   }
			}
			
			for (int i = low; i <= high; i++) {
				if (i == high) {
					low = i;
					array[i] = temp;
					break;
				} else {
					if (array[i] > temp) {
						low = i;
						array[high] = array[i];
						break;
					}
				}
			}
		}
		
		return high;
	}
}
