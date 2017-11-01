package excrise1;

import java.io.File;
import java.util.Date;

public class TestFileClass {

	public static void main(String[] args) {
		File file = new File("image/us.gif");
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute? " + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new Date(file.lastModified()));
		System.out.println("Welcome to Java".toCharArray().length);
		System.out.println("Welcome to Java".replace('o', 'T'));
		System.out.println("Welcome to Java".replaceAll("o", "T"));
		System.out.println("Welcome to Java".replaceFirst("o", "T"));
		
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		
		String s4 = "java";
		s4 = "html";
		System.out.println(s4);
		
		StringBuilder sBuilder = new StringBuilder(s1);
		sBuilder.delete(4, 11);
		s1 = sBuilder.toString();
		System.out.println(s1);
	}
}
