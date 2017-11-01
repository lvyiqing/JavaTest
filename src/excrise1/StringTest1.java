package excrise1;

public class StringTest1 {
	public String aString = "abc";
	public String bString = "abc";
	
	public StringTest1() {
		System.out.println(aString == bString);
		System.out.println(aString.equals(bString));
	}
}
