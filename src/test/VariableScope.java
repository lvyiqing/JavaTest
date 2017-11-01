package test;

public class VariableScope {

	public static void main(String[] args) {
		int a = 200;
		int[] b = {1,2,3,4,5,6};
		
		changeNumber(b, a);
		System.out.println("a = " + a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	
	public static void changeNumber(int[] list, int nums) {
		nums = nums + 5;
		list[0] = 100;
		System.out.println("nums = " + nums);
	}
}
