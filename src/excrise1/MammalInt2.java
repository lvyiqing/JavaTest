package excrise1;

public class MammalInt2 implements Animal {

	@Override
	public void eat() {
		System.out.println("Mammal2 eats");
	}

	@Override
	public void travel() {
		System.out.println("Mammal2 travels");
	}
	
	public static void main(String args[]) {
		Animal m = new MammalInt();
		m.eat();
		m.travel();
		Animal m1 = new MammalInt2();
		m1.eat();
		m1.travel();
	}
}
