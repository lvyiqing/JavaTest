package excrise1;

public class StringTest {

	public static void main(String[] args) {
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		char[] chars = {'j', 'a', 'v', 'a', '1', '3', '0', '1'};
		"CS3720".getChars(2, 6, chars, 4);
		System.out.println(chars);
		
		String aString = new String(new char[] {'j', 'a', 'v', 'a'});
		String bString = String.valueOf(new char[] {'j', 'a', 'v', 'a'});
		System.out.println(aString);
		System.out.println(bString);
		
		String cString = String.valueOf(true);
		System.out.println(cString);
	}

}
