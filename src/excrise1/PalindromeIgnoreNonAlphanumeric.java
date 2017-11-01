package excrise1;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String s = input.nextLine();
		
		System.out.println("Ignoring nonalphanumeric characters, \nis " 
				+ s + " a palindrome? " + isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		String string = filter(s);
		
		StringBuilder aBuilder = new StringBuilder(string);
		aBuilder.reverse();
		String string2 = aBuilder.toString();
		
		return string.equals(string2);
	}
	
	public static String filter(String string) {
		StringBuilder aBuilder = new StringBuilder();
		
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetterOrDigit(string.charAt(i))) {
				aBuilder.append(string.charAt(i));
			}
		}
		
		return aBuilder.toString();
	}
}
