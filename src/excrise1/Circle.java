package excrise1;

public class Circle {
	private double radius = 1.0;
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String args[]) {
		Circle myCircle = new Circle();
		System.out.println("Radius is " + myCircle.radius);
	}
}
