import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class FileTweaker {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);
		ArrayList<String> tweakee = new ArrayList<String>();

		System.out.print("Please enter the name of the input text file: ");
		String inFile = userInput.next();

		System.out.print("Please enter the name of the output text file: ");
		String outFile = userInput.next();

		System.out.print("Would you like to append to the file (y/N): ");
		String append = "N";
		append = userInput.next();

		try {
// tries and if it errors it catches the exception
			//FileLoader loadee = new FileLoader(inFile);
			//tweakee = loadee.loadFile();

			AltFileLoader altLoadee = new AltFileLoader(inFile);
			tweakee = altLoadee.loadFile();

			tweakee.set(2, "meh");

		}catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		}

		try {

			if (append.equalsIgnoreCase("Y")) {

				FileDumper dumpee = new FileDumper(outFile, true);
				dumpee.dumpFile(tweakee);
			} else {
			FileDumper dumpee = new FileDumper(outFile);
				dumpee.dumpFile(tweakee);
			}
		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		}
	}
}
