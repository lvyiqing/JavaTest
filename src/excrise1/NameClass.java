package excrise1;

public class NameClass {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		for (int c = 0; c < 5; c++){
			if ((++a > 2) && (++b > 2)) {
				a++;
			}
		}
		System.out.println("a 非运算为" + (~a));
		System.out.println("a=" + a + " b=" + b);
	}
}
