package excrise1;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws Exception {
		File file = new File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			// System.exit(0)¥³í‘Şo’ö˜
			System.exit(0);
		}
		
		PrintWriter output = new PrintWriter(file);
		
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.close();
	}
}
