package exercicio_1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GoodbyeWorldPrinterFile implements WorldPrinter {

	@Override
	public void print() {
		File file = new File("goodbye.txt");
		try {
			PrintWriter writer = new PrintWriter(file);
			writer.print("Goodbye, World");
			writer.close();
			System.out.println("gerou goodbye");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
