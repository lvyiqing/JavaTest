package recursion;

public class ArrayTest {
	public static void sum(int num) {
		
		int[] array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			if (i <= 1) {
				array[i] = 1;
			} else {
				array[i] = array[i - 2] + array[i - 1];
			}
		}
		
		System.out.println("•’ÊArray: " + array[array.length - 1]);
	}
}
