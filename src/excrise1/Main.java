package excrise1;

public class Main {

	public static void main(String[] args) {
		int n=3;
        int m=3;
        
        System.out.println(n==m);
        
        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");
        
        String aString = "hello";
        String bString = "g";
        
        System.out.println(aString == bString);
        System.out.println(aString.equals(bString));
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        str1 = str;
        str2 = str;
        System.out.println(str1==str2);
	}
}
