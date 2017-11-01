package test;

import javax.swing.text.ChangedCharSetException;

public class IntegerTest {

	public static void main(String[] args) {
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		
		Integer c = new Integer(1000);
		Integer d = new Integer(1000);
		
		Integer e = 100;
		Integer f = 100;
		
		Integer g = 1000;
		Integer h = 1000;

		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println("----------------------------------");
		System.out.println(c.equals(d));
		System.out.println(c == d);
		System.out.println("----------------------------------");
		System.out.println(e.equals(f));
		System.out.println(e == f);
		System.out.println("----------------------------------");
		System.out.println(g.equals(h));
		System.out.println(g == h);
		System.out.println("----------------------------------");
		System.out.println(c.equals(g));
		System.out.println(c == g);
		
		changeNum(e);
		System.out.println(e);
	}
	
	public static void changeNum(Integer integer){
		integer = integer + 100;
		System.out.println(integer);
	}
}
