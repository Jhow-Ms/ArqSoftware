package exercicio_1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HelloWorldPrinterFile implements WorldPrinter{

	@Override
	public void print() {		
		File file = new File("hello.txt");
		try {
			PrintWriter writer = new PrintWriter(file);
			writer.print("Hello, World");
			writer.close();
			System.out.println("gerou hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
