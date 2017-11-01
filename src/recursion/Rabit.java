package recursion;

import java.util.Scanner;

public class Rabit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input an number");
		
		int num = input.nextInt();
		
		System.out.println("begin: " + System.currentTimeMillis());
		LoopTest.sum(num);
		System.out.println("end: " + System.currentTimeMillis());
		
		System.out.println("\n----------------------");
		
		System.out.println("begin: " + System.currentTimeMillis());
		ArrayTest.sum(num);
		System.out.println("end: " + System.currentTimeMillis());
		
		System.out.println("\n----------------------");
		
		System.out.println("begin: " + System.currentTimeMillis());
		RecurisonTest.sum(num);
		System.out.println("end: " + System.currentTimeMillis());
	}
}
