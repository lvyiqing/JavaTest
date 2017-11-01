package test;

public class StringTest {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		
		String c = new String("abc");
		String d = new String("abc");
		
		System.out.println(a.intern());
		System.out.println(b.intern());
		System.out.println(a.intern() == b.intern());
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println("----------------------------------");
		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}

}
