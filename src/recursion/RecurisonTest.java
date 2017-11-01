package recursion;

public class RecurisonTest {
	public static void sum(int num) {
		int sum;
		for (int i = 0; i < num; i++) {
			sum = fn(i);
			
			if (i == num - 1) {
				System.out.println("•’ÊRecrison: " + sum + " ");
			}
		}
	}
	
	public static int fn(int m) {
		if (m <= 1) {
			return 1;
		} else {
			return fn(m - 2) + fn(m - 1);
		}
	}
}
