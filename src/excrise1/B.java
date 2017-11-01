package excrise1;

public class B extends A {

	int x = 3, y = 5, z;

    public B(int a) {
        System.out.println("555555555555");
        this.x = 8;
    }

    int getz() {
        z = x + y;
        return z;
    }
    
    void show() {
//    	show1();
    	System.out.println("8888888888888888888888");
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        System.out.println("z=" + getz());
    }

//    void show1() {
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        System.out.println("z=" + getz());
//    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
