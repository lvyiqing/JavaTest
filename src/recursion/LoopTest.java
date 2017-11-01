package recursion;

public class LoopTest {
	public static void sum(int num) {
		int sum = 0;
		int a = 1;
		int b = 1;
		for (int i = 0; i < num; i++) {
			if (i > 1) {
				sum = a + b;
				a = b;
				b = sum;
				
				if (i == num - 1) {
					System.out.println("普通Loop： " + sum + " ");
				}
			}
		}
	}
}
