package excrise1;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String aString = input.nextLine();
		
		if (isPalindrome(aString)) {
			System.out.println(aString + " is a palindrome");
		} else {
			System.out.println(aString + " is not a palindrome");
		}
	}
	
	public static boolean isPalindrome(String bString) {
		int start = 0;
		int end = bString.length() - 1;
		boolean isPalind = true;
		
		while (start < end) {
			if (bString.charAt(start) == bString.charAt(end)) {
				start ++;
				end--;
			} else {
				isPalind = false;
				return isPalind;
			}
		}
		return isPalind;
	}
}
