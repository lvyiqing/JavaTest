package excrise1;

public class A {
	
	int x = 6;
    private int y = 2;
    
    public A() {
    	 System.out.println("66666666666666666");
    }
    
    public A(int a) {
        x = a;
    }

    int getz() {
        int z;
        z = x / y;
        return z;
    }

    void show() {
    	System.out.println("7777777777777777777");
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        System.out.println("z=" + getz());
    }
    
    void show1() {
    	System.out.println("999999999999999999999");
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        System.out.println("z=" + getz());
    }

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
	