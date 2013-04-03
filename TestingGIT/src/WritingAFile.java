import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class WritingAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String path = "src\\output.txt";
		File outFile = new File(path);
		PrintWriter output = null;
		
		try {
			output = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.print("Enter a line (\"q\" to quit.): ");
		String line = kb.nextLine();
		while(!line.equalsIgnoreCase("q")){
			output.println(line);
			System.out.print("Enter a line (\"q\" to quit.): ");
			line = kb.nextLine();
		}
		System.out.println("Terminating input and closing file.");
		output.close();
	}

}
