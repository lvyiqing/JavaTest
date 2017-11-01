package excrise1;

public class ab {
	static int c = 100;
	
	public static void main(String[] args) {
		double a = 123.5689124565656757657;
		int n = 56;
		printC(c,n);
		c = c + 2;
		System.out.println(c);
		System.out.println(n);
		printcC();
		System.out.println((double)a);
		System.out.println((char)n);
	}
	
	public static void printC(int c, int n) {
		System.out.println(n+1);
		System.out.println(c+1);
	}
	
	public static void printcC() {
		System.out.println(c);
	}
}
